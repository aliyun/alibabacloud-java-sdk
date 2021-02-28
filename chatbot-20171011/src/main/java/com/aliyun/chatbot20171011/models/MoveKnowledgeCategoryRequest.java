// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class MoveKnowledgeCategoryRequest extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("CategoryId")
    public Long categoryId;

    public static MoveKnowledgeCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveKnowledgeCategoryRequest self = new MoveKnowledgeCategoryRequest();
        return TeaModel.build(map, self);
    }

    public MoveKnowledgeCategoryRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public MoveKnowledgeCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}
