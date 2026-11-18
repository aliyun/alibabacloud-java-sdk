// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>The scope of authorized resources. Valid values:</p>
     * <ul>
     * <li>custom: resources within the specified project scope</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("AuthorizationResourceScope")
    public String authorizationResourceScope;

    /**
     * <p>The name of the authorization rule. The name can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_rule</p>
     */
    @NameInMap("AuthorizationRuleName")
    public String authorizationRuleName;

    /**
     * <p>The scenario label of the authorization rule. The label can be up to 64 characters in length.</p>
     * <blockquote>
     * <p>When a label value is specified, the business layer restricts the types of authorized resources based on the label.
     * For historical reasons, an empty value is also treated as an enum value. If this parameter is left empty, the authorized resource types supported by other enum values are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>privileged_cloud_account</p>
     */
    @NameInMap("AuthorizationRuleScenarioLabel")
    public String authorizationRuleScenarioLabel;

    /**
     * <p>Ensures the idempotence of the request. You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter only supports ASCII characters and can be up to 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the authorization rule. The description can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test rule</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the project associated with the authorization rule. If you are unsure about the associated project, you can associate the default project. The ID of the default project is iprj_system_default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iprj_system_default</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The type of subject to which the authorization rule applies. Valid values:</p>
     * <ul>
     * <li>user</li>
     * <li>application<blockquote>
     * <p>user (for human users) or application (for machines). When explicitly specified, only privileged cloud account rules with a custom resource scope are supported. If this field is omitted for custom scope rules in this scenario, the default value is user.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("SubjectType")
    public String subjectType;

    public static CreateAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRuleRequest self = new CreateAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRuleRequest setAuthorizationResourceScope(String authorizationResourceScope) {
        this.authorizationResourceScope = authorizationResourceScope;
        return this;
    }
    public String getAuthorizationResourceScope() {
        return this.authorizationResourceScope;
    }

    public CreateAuthorizationRuleRequest setAuthorizationRuleName(String authorizationRuleName) {
        this.authorizationRuleName = authorizationRuleName;
        return this;
    }
    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    public CreateAuthorizationRuleRequest setAuthorizationRuleScenarioLabel(String authorizationRuleScenarioLabel) {
        this.authorizationRuleScenarioLabel = authorizationRuleScenarioLabel;
        return this;
    }
    public String getAuthorizationRuleScenarioLabel() {
        return this.authorizationRuleScenarioLabel;
    }

    public CreateAuthorizationRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAuthorizationRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAuthorizationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAuthorizationRuleRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAuthorizationRuleRequest setSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }
    public String getSubjectType() {
        return this.subjectType;
    }

}
