// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryEnterpriseDataListRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataName")
    public String dataName;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StoreType")
    public String storeType;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static QueryEnterpriseDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseDataListRequest self = new QueryEnterpriseDataListRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseDataListRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public QueryEnterpriseDataListRequest setDataName(String dataName) {
        this.dataName = dataName;
        return this;
    }
    public String getDataName() {
        return this.dataName;
    }

    public QueryEnterpriseDataListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryEnterpriseDataListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryEnterpriseDataListRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public QueryEnterpriseDataListRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
