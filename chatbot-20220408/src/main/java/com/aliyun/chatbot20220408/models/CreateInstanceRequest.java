// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The workspace key. If this parameter is not specified, the default workspace is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The description of the chatbot. The description can be up to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>A sample chatbot for the mobile app</p>
     */
    @NameInMap("Introduction")
    public String introduction;

    /**
     * <p>The language of the chatbot service, such as zh-cn or en-us. Default value: the default language of the workspace. Valid values: the languages supported by the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("LanguageCode")
    public String languageCode;

    /**
     * <p>The name of the chatbot. The name can be up to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleChatbot</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the chatbot. Default value: scenario_im.</p>
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
