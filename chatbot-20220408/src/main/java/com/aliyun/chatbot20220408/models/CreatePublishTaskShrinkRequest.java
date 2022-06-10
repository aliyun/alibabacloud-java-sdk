// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePublishTaskShrinkRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 发布单元类型，机器人发布请使用 CreateInstancePublishTask API
    @NameInMap("BizType")
    public String bizType;

    // 附加发布信息，当前支持：如果BizType是faq，此字段填写类目Id，表示只发布这些类目下面的知识
    @NameInMap("DataIdList")
    public String dataIdListShrink;

    public static CreatePublishTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishTaskShrinkRequest self = new CreatePublishTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublishTaskShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreatePublishTaskShrinkRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreatePublishTaskShrinkRequest setDataIdListShrink(String dataIdListShrink) {
        this.dataIdListShrink = dataIdListShrink;
        return this;
    }
    public String getDataIdListShrink() {
        return this.dataIdListShrink;
    }

}
