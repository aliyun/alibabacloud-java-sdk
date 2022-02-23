// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateBotRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Avatar")
    public String avatar;

    @NameInMap("Introduction")
    public String introduction;

    @NameInMap("LanguageCode")
    public String languageCode;

    @NameInMap("Name")
    public String name;

    @NameInMap("RobotType")
    public String robotType;

    public static CreateBotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBotRequest self = new CreateBotRequest();
        return TeaModel.build(map, self);
    }

    public CreateBotRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateBotRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public CreateBotRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public CreateBotRequest setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }

    public CreateBotRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBotRequest setRobotType(String robotType) {
        this.robotType = robotType;
        return this;
    }
    public String getRobotType() {
        return this.robotType;
    }

}
