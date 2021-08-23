// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeRequest extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static DescribeKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeRequest self = new DescribeKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
