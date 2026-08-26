// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetOneMetaOssieModelRequest extends TeaModel {
    /**
     * <p>The document type of the semantic model. Valid values: JSON and YAML.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("DocFormat")
    public String docFormat;

    /**
     * <p>The UUID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86c5c290052147c***</p>
     */
    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    public static GetOneMetaOssieModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOneMetaOssieModelRequest self = new GetOneMetaOssieModelRequest();
        return TeaModel.build(map, self);
    }

    public GetOneMetaOssieModelRequest setDocFormat(String docFormat) {
        this.docFormat = docFormat;
        return this;
    }
    public String getDocFormat() {
        return this.docFormat;
    }

    public GetOneMetaOssieModelRequest setKnowledgeUuid(String knowledgeUuid) {
        this.knowledgeUuid = knowledgeUuid;
        return this;
    }
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

}
