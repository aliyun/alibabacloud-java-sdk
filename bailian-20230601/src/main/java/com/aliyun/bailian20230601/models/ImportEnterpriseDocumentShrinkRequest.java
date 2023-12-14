// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ImportEnterpriseDocumentShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataType")
    public Integer dataType;

    @NameInMap("DocumentList")
    public String documentListShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("Tags")
    public String tagsShrink;

    public static ImportEnterpriseDocumentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportEnterpriseDocumentShrinkRequest self = new ImportEnterpriseDocumentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportEnterpriseDocumentShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ImportEnterpriseDocumentShrinkRequest setDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }
    public Integer getDataType() {
        return this.dataType;
    }

    public ImportEnterpriseDocumentShrinkRequest setDocumentListShrink(String documentListShrink) {
        this.documentListShrink = documentListShrink;
        return this;
    }
    public String getDocumentListShrink() {
        return this.documentListShrink;
    }

    public ImportEnterpriseDocumentShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportEnterpriseDocumentShrinkRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public ImportEnterpriseDocumentShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
