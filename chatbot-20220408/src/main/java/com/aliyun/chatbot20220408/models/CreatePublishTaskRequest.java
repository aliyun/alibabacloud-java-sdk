// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePublishTaskRequest extends TeaModel {
    /**
     * <p>The workspace key. If not specified, the default workspace is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The publish unit type. To publish a chatbot, use the CreateInstancePublishTask API.</p>
     * 
     * <strong>example:</strong>
     * <p>faq</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Additional publish information. Currently supported: if BizType is faq, this field specifies category IDs, indicating that only knowledge under these categories is published.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;8521&quot;]</p>
     */
    @NameInMap("DataIdList")
    public java.util.List<String> dataIdList;

    public static CreatePublishTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishTaskRequest self = new CreatePublishTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublishTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreatePublishTaskRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreatePublishTaskRequest setDataIdList(java.util.List<String> dataIdList) {
        this.dataIdList = dataIdList;
        return this;
    }
    public java.util.List<String> getDataIdList() {
        return this.dataIdList;
    }

}
