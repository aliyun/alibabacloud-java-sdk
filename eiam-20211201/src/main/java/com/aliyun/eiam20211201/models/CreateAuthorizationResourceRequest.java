// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateAuthorizationResourceRequest extends TeaModel {
    /**
     * <p>The ID of the resource entity associated with the authorization resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>carole_01kmek49aqxxxx</p>
     */
    @NameInMap("AuthorizationResourceEntityId")
    public String authorizationResourceEntityId;

    /**
     * <p>The type of the resource entity associated with the authorization resource. Valid values:</p>
     * <ul>
     * <li>cloud_account_role: cloud role</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_account_role</p>
     */
    @NameInMap("AuthorizationResourceEntityType")
    public String authorizationResourceEntityType;

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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate a parameter value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see References <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The effective condition.</p>
     */
    @NameInMap("Condition")
    public CreateAuthorizationResourceRequestCondition condition;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateAuthorizationResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationResourceRequest self = new CreateAuthorizationResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationResourceRequest setAuthorizationResourceEntityId(String authorizationResourceEntityId) {
        this.authorizationResourceEntityId = authorizationResourceEntityId;
        return this;
    }
    public String getAuthorizationResourceEntityId() {
        return this.authorizationResourceEntityId;
    }

    public CreateAuthorizationResourceRequest setAuthorizationResourceEntityType(String authorizationResourceEntityType) {
        this.authorizationResourceEntityType = authorizationResourceEntityType;
        return this;
    }
    public String getAuthorizationResourceEntityType() {
        return this.authorizationResourceEntityType;
    }

    public CreateAuthorizationResourceRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public CreateAuthorizationResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAuthorizationResourceRequest setCondition(CreateAuthorizationResourceRequestCondition condition) {
        this.condition = condition;
        return this;
    }
    public CreateAuthorizationResourceRequestCondition getCondition() {
        return this.condition;
    }

    public CreateAuthorizationResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class CreateAuthorizationResourceRequestConditionCredentialCondition extends TeaModel {
        /**
         * <p>Specifies whether same-name identity accounts are supported.</p>
         */
        @NameInMap("AllowSameNameIdentity")
        public Boolean allowSameNameIdentity;

        public static CreateAuthorizationResourceRequestConditionCredentialCondition build(java.util.Map<String, ?> map) throws Exception {
            CreateAuthorizationResourceRequestConditionCredentialCondition self = new CreateAuthorizationResourceRequestConditionCredentialCondition();
            return TeaModel.build(map, self);
        }

        public CreateAuthorizationResourceRequestConditionCredentialCondition setAllowSameNameIdentity(Boolean allowSameNameIdentity) {
            this.allowSameNameIdentity = allowSameNameIdentity;
            return this;
        }
        public Boolean getAllowSameNameIdentity() {
            return this.allowSameNameIdentity;
        }

    }

    public static class CreateAuthorizationResourceRequestCondition extends TeaModel {
        /**
         * <p>The effective condition when used as a credential.</p>
         */
        @NameInMap("CredentialCondition")
        public CreateAuthorizationResourceRequestConditionCredentialCondition credentialCondition;

        public static CreateAuthorizationResourceRequestCondition build(java.util.Map<String, ?> map) throws Exception {
            CreateAuthorizationResourceRequestCondition self = new CreateAuthorizationResourceRequestCondition();
            return TeaModel.build(map, self);
        }

        public CreateAuthorizationResourceRequestCondition setCredentialCondition(CreateAuthorizationResourceRequestConditionCredentialCondition credentialCondition) {
            this.credentialCondition = credentialCondition;
            return this;
        }
        public CreateAuthorizationResourceRequestConditionCredentialCondition getCredentialCondition() {
            return this.credentialCondition;
        }

    }

}
