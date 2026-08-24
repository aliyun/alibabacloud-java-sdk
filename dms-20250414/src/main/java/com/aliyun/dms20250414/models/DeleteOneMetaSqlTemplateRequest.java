// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteOneMetaSqlTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    public static DeleteOneMetaSqlTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOneMetaSqlTemplateRequest self = new DeleteOneMetaSqlTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOneMetaSqlTemplateRequest setKnowledgeUuid(String knowledgeUuid) {
        this.knowledgeUuid = knowledgeUuid;
        return this;
    }
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

}
