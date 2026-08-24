// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetOneMetaOssieModelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocFormat")
    public String docFormat;

    /**
     * <p>This parameter is required.</p>
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
