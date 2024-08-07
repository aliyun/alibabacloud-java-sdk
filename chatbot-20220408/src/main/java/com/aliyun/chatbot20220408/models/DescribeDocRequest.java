// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeDocRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001979424</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
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
