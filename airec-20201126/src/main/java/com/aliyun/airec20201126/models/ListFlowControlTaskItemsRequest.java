// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskItemsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListFlowControlTaskItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskItemsRequest self = new ListFlowControlTaskItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskItemsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListFlowControlTaskItemsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
