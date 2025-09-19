// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GenMetaKnowledgeAssetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1860****</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    public static GenMetaKnowledgeAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        GenMetaKnowledgeAssetRequest self = new GenMetaKnowledgeAssetRequest();
        return TeaModel.build(map, self);
    }

    public GenMetaKnowledgeAssetRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

}
