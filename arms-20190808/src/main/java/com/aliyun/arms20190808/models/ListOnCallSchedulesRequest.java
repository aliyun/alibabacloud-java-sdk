// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListOnCallSchedulesRequest extends TeaModel {
    /**
     * <p>The name of the scheduling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>OnCallSchedule_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Long size;

    public static ListOnCallSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnCallSchedulesRequest self = new ListOnCallSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public ListOnCallSchedulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListOnCallSchedulesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListOnCallSchedulesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
