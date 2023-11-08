// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class SearchEnterpriseDataShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataIdList")
    public String dataIdListShrink;

    @NameInMap("EnableRank")
    public Boolean enableRank;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Query")
    public String query;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("TagIdList")
    public String tagIdListShrink;

    public static SearchEnterpriseDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchEnterpriseDataShrinkRequest self = new SearchEnterpriseDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchEnterpriseDataShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SearchEnterpriseDataShrinkRequest setDataIdListShrink(String dataIdListShrink) {
        this.dataIdListShrink = dataIdListShrink;
        return this;
    }
    public String getDataIdListShrink() {
        return this.dataIdListShrink;
    }

    public SearchEnterpriseDataShrinkRequest setEnableRank(Boolean enableRank) {
        this.enableRank = enableRank;
        return this;
    }
    public Boolean getEnableRank() {
        return this.enableRank;
    }

    public SearchEnterpriseDataShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SearchEnterpriseDataShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchEnterpriseDataShrinkRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public SearchEnterpriseDataShrinkRequest setTagIdListShrink(String tagIdListShrink) {
        this.tagIdListShrink = tagIdListShrink;
        return this;
    }
    public String getTagIdListShrink() {
        return this.tagIdListShrink;
    }

}
