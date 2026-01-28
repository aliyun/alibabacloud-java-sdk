// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>授权资源范围，枚举值：global（Project下的所有资源）、custom（自定义资源范围）。</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("AuthorizationResourceScope")
    public String authorizationResourceScope;

    /**
     * <p>授权规则标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <p>授权规则名称，长度限制最大64个字符。</p>
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
     * <p>IDaaS EIAM实例的ID。</p>
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
