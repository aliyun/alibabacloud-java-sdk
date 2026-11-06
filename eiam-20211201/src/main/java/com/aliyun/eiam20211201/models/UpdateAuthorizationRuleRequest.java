// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>The authorization resource scope. Valid values:</p>
     * <ul>
     * <li>global: global resources under the project</li>
     * <li>custom: resources under a specified project scope</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("AuthorizationResourceScope")
    public String authorizationResourceScope;

    /**
     * <p>The authorization rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <p>The name of the authorization rule. The name can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test_rule</p>
     */
    @NameInMap("AuthorizationRuleName")
    public String authorizationRuleName;

    /**
     * <p>Ensures the idempotence of the request. You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and cannot exceed 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleRequest self = new UpdateAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleRequest setAuthorizationResourceScope(String authorizationResourceScope) {
        this.authorizationResourceScope = authorizationResourceScope;
        return this;
    }
    public String getAuthorizationResourceScope() {
        return this.authorizationResourceScope;
    }

    public UpdateAuthorizationRuleRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public UpdateAuthorizationRuleRequest setAuthorizationRuleName(String authorizationRuleName) {
        this.authorizationRuleName = authorizationRuleName;
        return this;
    }
    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    public UpdateAuthorizationRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAuthorizationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
