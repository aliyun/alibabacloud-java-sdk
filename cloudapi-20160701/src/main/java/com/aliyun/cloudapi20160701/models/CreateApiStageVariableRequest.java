// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class CreateApiStageVariableRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("StageRouteModel")
    public String stageRouteModel;

    @NameInMap("SupportRoute")
    public Boolean supportRoute;

    @NameInMap("VariableName")
    public String variableName;

    @NameInMap("VariableValue")
    public String variableValue;

    public static CreateApiStageVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiStageVariableRequest self = new CreateApiStageVariableRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiStageVariableRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateApiStageVariableRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateApiStageVariableRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public CreateApiStageVariableRequest setStageRouteModel(String stageRouteModel) {
        this.stageRouteModel = stageRouteModel;
        return this;
    }
    public String getStageRouteModel() {
        return this.stageRouteModel;
    }

    public CreateApiStageVariableRequest setSupportRoute(Boolean supportRoute) {
        this.supportRoute = supportRoute;
        return this;
    }
    public Boolean getSupportRoute() {
        return this.supportRoute;
    }

    public CreateApiStageVariableRequest setVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }
    public String getVariableName() {
        return this.variableName;
    }

    public CreateApiStageVariableRequest setVariableValue(String variableValue) {
        this.variableValue = variableValue;
        return this;
    }
    public String getVariableValue() {
        return this.variableValue;
    }

}
