// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListItemsRequest extends TeaModel {
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

    @NameInMap("strategyUsed")
    public Boolean strategyUsed;

    @NameInMap("withInvalidDetail")
    public Boolean withInvalidDetail;

    public static ListItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListItemsRequest self = new ListItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListItemsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListItemsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListItemsRequest setStrategyUsed(Boolean strategyUsed) {
        this.strategyUsed = strategyUsed;
        return this;
    }
    public Boolean getStrategyUsed() {
        return this.strategyUsed;
    }

    public ListItemsRequest setWithInvalidDetail(Boolean withInvalidDetail) {
        this.withInvalidDetail = withInvalidDetail;
        return this;
    }
    public Boolean getWithInvalidDetail() {
        return this.withInvalidDetail;
    }

}
