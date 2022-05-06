// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessRulesRequest extends TeaModel {
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("StartOffset")
    public Integer startOffset;

    public static ListAccessRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessRulesRequest self = new ListAccessRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessRulesRequest setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public ListAccessRulesRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ListAccessRulesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListAccessRulesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListAccessRulesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListAccessRulesRequest setStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
        return this;
    }
    public Integer getStartOffset() {
        return this.startOffset;
    }

}
