// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteOneMetaOssieModelRequest extends TeaModel {
    /**
     * <p>The UUID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86c5c290052147c***</p>
     */
    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    public static DeleteOneMetaOssieModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOneMetaOssieModelRequest self = new DeleteOneMetaOssieModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOneMetaOssieModelRequest setKnowledgeUuid(String knowledgeUuid) {
        this.knowledgeUuid = knowledgeUuid;
        return this;
    }
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

}
