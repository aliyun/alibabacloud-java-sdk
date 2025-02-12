// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiStageVariableRequest extends TeaModel {
    /**
     * <p>The ID of the API group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the runtime environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
     */
    @NameInMap("StageId")
    public String stageId;

    /**
     * <p>The routing model of the environment.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;location&quot;: &quot;HEAD&quot;,
     *     &quot;parameterCatalog&quot;: &quot;CUSTOM&quot;,
     *     &quot;parameterType&quot;: &quot;String&quot;,
     *     &quot;serviceParameterName&quot;: &quot;TestConstant&quot;,
     *     &quot;routeMatchSymbol&quot;: &quot;IN&quot;,
     *     &quot;routeRules&quot;: [
     *         {
     *             &quot;conditionValue&quot;: &quot;aaa,bbb&quot;,
     *             &quot;resultValue&quot;: &quot;apigateway-test.com&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("StageRouteModel")
    @Deprecated
    public String stageRouteModel;

    /**
     * <p>Specifies whether routing is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportRoute")
    public Boolean supportRoute;

    /**
     * <p>The name of the variable to be added. This parameter is case-sensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>serverName</p>
     */
    @NameInMap("VariableName")
    public String variableName;

    /**
     * <p>The value of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>api.domain.com</p>
     */
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

    @Deprecated
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
