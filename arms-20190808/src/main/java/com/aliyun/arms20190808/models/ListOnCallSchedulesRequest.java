// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListOnCallSchedulesRequest extends TeaModel {
    // 排班策略名称
    @NameInMap("Name")
    public String name;

    // 页数
    @NameInMap("Page")
    public Long page;

    // 展示数目
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
