// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListStyleLearningResultRequest extends TeaModel {
    /**
     * <p>Unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>Number of items per page. Default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static ListStyleLearningResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStyleLearningResultRequest self = new ListStyleLearningResultRequest();
        return TeaModel.build(map, self);
    }

    public ListStyleLearningResultRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListStyleLearningResultRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListStyleLearningResultRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
