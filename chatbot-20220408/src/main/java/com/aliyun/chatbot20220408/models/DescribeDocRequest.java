// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeDocRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("ShowDetail")
    public Boolean showDetail;

    public static DescribeDocRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocRequest self = new DescribeDocRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DescribeDocRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public DescribeDocRequest setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }
    public Boolean getShowDetail() {
        return this.showDetail;
    }

}
