// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The new knowledge base description.</p>
     * 
     * <strong>example:</strong>
     * <p>updated kb desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-HZ-zgr1***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    /**
     * <p>The new knowledge base name.</p>
     * 
     * <strong>example:</strong>
     * <p>updated kb name</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseRequest self = new UpdateKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

    public UpdateKnowledgeBaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
