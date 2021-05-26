// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GenerateTokenRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("PassportId")
    public String passportId;

    @NameInMap("PassportName")
    public String passportName;

    @NameInMap("PassportType")
    public Integer passportType;

    public static GenerateTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTokenRequest self = new GenerateTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTokenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateTokenRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public GenerateTokenRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public GenerateTokenRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GenerateTokenRequest setPassportId(String passportId) {
        this.passportId = passportId;
        return this;
    }
    public String getPassportId() {
        return this.passportId;
    }

    public GenerateTokenRequest setPassportName(String passportName) {
        this.passportName = passportName;
        return this;
    }
    public String getPassportName() {
        return this.passportName;
    }

    public GenerateTokenRequest setPassportType(Integer passportType) {
        this.passportType = passportType;
        return this;
    }
    public Integer getPassportType() {
        return this.passportType;
    }

}
