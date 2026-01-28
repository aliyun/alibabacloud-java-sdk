// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>授权资源范围，枚举值：global（Project下的所有资源）、custom（自定义资源范围）。</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("AuthorizationResourceScope")
    public String authorizationResourceScope;

    /**
     * <p>授权规则名称，长度限制最大64个字符。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_rule</p>
     */
    @NameInMap("AuthorizationRuleName")
    public String authorizationRuleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>授权规则备注描述，长度限制最大128个字符。</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test rule</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>授权规则关联的项目标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iprj_system_default</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

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

}
