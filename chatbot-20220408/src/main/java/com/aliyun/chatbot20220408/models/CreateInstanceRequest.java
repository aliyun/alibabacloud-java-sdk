// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The key of the agent. If you omit this parameter, the default agent is used. You can find the key on the Business Management page of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>A description of the robot. The description can be up to 50 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>用于手机app的小蜜机器人</p>
     */
    @NameInMap("Introduction")
    public String introduction;

    /**
     * <p>The language of the robot, such as <code>zh-cn</code> or <code>en-us</code>. The language must be supported by the agent. If you omit this parameter, the agent\&quot;s default language is used.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("LanguageCode")
    public String languageCode;

    /**
     * <p>The name of the robot. The maximum length is 50 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>小蜜机器人</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The robot type. The default value is <code>scenario_im</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>scenario_im</p>
     */
    @NameInMap("RobotType")
    public String robotType;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateInstanceRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public CreateInstanceRequest setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }

    public CreateInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateInstanceRequest setRobotType(String robotType) {
        this.robotType = robotType;
        return this;
    }
    public String getRobotType() {
        return this.robotType;
    }

}
