// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class BatchDeleteSynonymsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("synonymIdKeys")
    public java.util.List<String> synonymIdKeys;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static BatchDeleteSynonymsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteSynonymsRequest self = new BatchDeleteSynonymsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteSynonymsRequest setSynonymIdKeys(java.util.List<String> synonymIdKeys) {
        this.synonymIdKeys = synonymIdKeys;
        return this;
    }
    public java.util.List<String> getSynonymIdKeys() {
        return this.synonymIdKeys;
    }

    public BatchDeleteSynonymsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
