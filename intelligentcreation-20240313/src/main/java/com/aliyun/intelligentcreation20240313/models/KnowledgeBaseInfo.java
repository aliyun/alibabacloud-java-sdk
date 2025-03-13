// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class KnowledgeBaseInfo extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("id")
    public String id;

    @NameInMap("industry")
    public String industry;

    @NameInMap("knowledgeBaseType")
    public String knowledgeBaseType;

    @NameInMap("name")
    public String name;

    public static KnowledgeBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseInfo self = new KnowledgeBaseInfo();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KnowledgeBaseInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public KnowledgeBaseInfo setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public KnowledgeBaseInfo setKnowledgeBaseType(String knowledgeBaseType) {
        this.knowledgeBaseType = knowledgeBaseType;
        return this;
    }
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    public KnowledgeBaseInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
