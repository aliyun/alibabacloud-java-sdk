// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationResourceResponseBody extends TeaModel {
    /**
     * <p>The authorization resource.</p>
     */
    @NameInMap("AuthorizationResource")
    public GetAuthorizationResourceResponseBodyAuthorizationResource authorizationResource;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAuthorizationResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationResourceResponseBody self = new GetAuthorizationResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationResourceResponseBody setAuthorizationResource(GetAuthorizationResourceResponseBodyAuthorizationResource authorizationResource) {
        this.authorizationResource = authorizationResource;
        return this;
    }
    public GetAuthorizationResourceResponseBodyAuthorizationResource getAuthorizationResource() {
        return this.authorizationResource;
    }

    public GetAuthorizationResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuthorizationResourceResponseBodyAuthorizationResourceConditionCredentialCondition extends TeaModel {
        /**
         * <p>Specifies whether same-name identity accounts are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowSameNameIdentity")
        public Boolean allowSameNameIdentity;

        public static GetAuthorizationResourceResponseBodyAuthorizationResourceConditionCredentialCondition build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorizationResourceResponseBodyAuthorizationResourceConditionCredentialCondition self = new GetAuthorizationResourceResponseBodyAuthorizationResourceConditionCredentialCondition();
            return TeaModel.build(map, self);
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResourceConditionCredentialCondition setAllowSameNameIdentity(Boolean allowSameNameIdentity) {
            this.allowSameNameIdentity = allowSameNameIdentity;
            return this;
        }
        public Boolean getAllowSameNameIdentity() {
            return this.allowSameNameIdentity;
        }

    }

    public static class GetAuthorizationResourceResponseBodyAuthorizationResourceCondition extends TeaModel {
        /**
         * <p>The credential condition.</p>
         */
        @NameInMap("CredentialCondition")
        public GetAuthorizationResourceResponseBodyAuthorizationResourceConditionCredentialCondition credentialCondition;

        public static GetAuthorizationResourceResponseBodyAuthorizationResourceCondition build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorizationResourceResponseBodyAuthorizationResourceCondition self = new GetAuthorizationResourceResponseBodyAuthorizationResourceCondition();
            return TeaModel.build(map, self);
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResourceCondition setCredentialCondition(GetAuthorizationResourceResponseBodyAuthorizationResourceConditionCredentialCondition credentialCondition) {
            this.credentialCondition = credentialCondition;
            return this;
        }
        public GetAuthorizationResourceResponseBodyAuthorizationResourceConditionCredentialCondition getCredentialCondition() {
            return this.credentialCondition;
        }

    }

    public static class GetAuthorizationResourceResponseBodyAuthorizationResource extends TeaModel {
        /**
         * <p>The resource entity ID associated with the authorization resource.</p>
         * 
         * <strong>example:</strong>
         * <p>carole_01kmek49aqxxxx</p>
         */
        @NameInMap("AuthorizationResourceEntityId")
        public String authorizationResourceEntityId;

        /**
         * <p>The resource entity type associated with the authorization resource. Valid values:</p>
         * <ul>
         * <li>cloud_account_role: cloud role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_account_role</p>
         */
        @NameInMap("AuthorizationResourceEntityType")
        public String authorizationResourceEntityType;

        /**
         * <p>The authorization resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>arres_01kgh3jvt7pk093rv6giu0c0qxxxx</p>
         */
        @NameInMap("AuthorizationResourceId")
        public String authorizationResourceId;

        /**
         * <p>The authorization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        /**
         * <p>The cloud account ID to which the resource entity associated with the authorization resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>The condition restriction.</p>
         */
        @NameInMap("Condition")
        public GetAuthorizationResourceResponseBodyAuthorizationResourceCondition condition;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1787023451494</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1787023451494</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetAuthorizationResourceResponseBodyAuthorizationResource build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorizationResourceResponseBodyAuthorizationResource self = new GetAuthorizationResourceResponseBodyAuthorizationResource();
            return TeaModel.build(map, self);
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setAuthorizationResourceEntityId(String authorizationResourceEntityId) {
            this.authorizationResourceEntityId = authorizationResourceEntityId;
            return this;
        }
        public String getAuthorizationResourceEntityId() {
            return this.authorizationResourceEntityId;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setAuthorizationResourceEntityType(String authorizationResourceEntityType) {
            this.authorizationResourceEntityType = authorizationResourceEntityType;
            return this;
        }
        public String getAuthorizationResourceEntityType() {
            return this.authorizationResourceEntityType;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setAuthorizationResourceId(String authorizationResourceId) {
            this.authorizationResourceId = authorizationResourceId;
            return this;
        }
        public String getAuthorizationResourceId() {
            return this.authorizationResourceId;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setCondition(GetAuthorizationResourceResponseBodyAuthorizationResourceCondition condition) {
            this.condition = condition;
            return this;
        }
        public GetAuthorizationResourceResponseBodyAuthorizationResourceCondition getCondition() {
            return this.condition;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
