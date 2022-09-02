// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class QueryTreeNodesRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("SearchText")
    public String searchText;

    @NameInMap("Type")
    public String type;

    public static QueryTreeNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTreeNodesRequest self = new QueryTreeNodesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTreeNodesRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QueryTreeNodesRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

    public QueryTreeNodesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
