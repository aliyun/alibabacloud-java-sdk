// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class SearchEnterpriseDataRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataIdList")
    public java.util.List<String> dataIdList;

    @NameInMap("EnableRank")
    public Boolean enableRank;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Query")
    public String query;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("TagIdList")
    public java.util.List<Long> tagIdList;

    public static SearchEnterpriseDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchEnterpriseDataRequest self = new SearchEnterpriseDataRequest();
        return TeaModel.build(map, self);
    }

    public SearchEnterpriseDataRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SearchEnterpriseDataRequest setDataIdList(java.util.List<String> dataIdList) {
        this.dataIdList = dataIdList;
        return this;
    }
    public java.util.List<String> getDataIdList() {
        return this.dataIdList;
    }

    public SearchEnterpriseDataRequest setEnableRank(Boolean enableRank) {
        this.enableRank = enableRank;
        return this;
    }
    public Boolean getEnableRank() {
        return this.enableRank;
    }

    public SearchEnterpriseDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SearchEnterpriseDataRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchEnterpriseDataRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public SearchEnterpriseDataRequest setTagIdList(java.util.List<Long> tagIdList) {
        this.tagIdList = tagIdList;
        return this;
    }
    public java.util.List<Long> getTagIdList() {
        return this.tagIdList;
    }

}
