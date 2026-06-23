// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ApplyResourceAccessPermissionRequest extends TeaModel {
    /**
     * <p>A list of permission requests.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyContents")
    public java.util.List<ApplyResourceAccessPermissionRequestApplyContents> applyContents;

    /**
     * <p>The idempotency parameter, which prevents duplicate operations from repeated calls.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The reason for the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>业务发展需要</p>
     */
    @NameInMap("Reason")
    public String reason;

    public static ApplyResourceAccessPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourceAccessPermissionRequest self = new ApplyResourceAccessPermissionRequest();
        return TeaModel.build(map, self);
    }

    public ApplyResourceAccessPermissionRequest setApplyContents(java.util.List<ApplyResourceAccessPermissionRequestApplyContents> applyContents) {
        this.applyContents = applyContents;
        return this;
    }
    public java.util.List<ApplyResourceAccessPermissionRequestApplyContents> getApplyContents() {
        return this.applyContents;
    }

    public ApplyResourceAccessPermissionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApplyResourceAccessPermissionRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public static class ApplyResourceAccessPermissionRequestApplyContentsGrantee extends TeaModel {
        /**
         * <p>The ID of the principal. The value of this parameter depends on the <code>PrincipalType</code>:</p>
         * <ul>
         * <li><p><code>RamUser</code>: The Dataworks user ID.</p>
         * </li>
         * <li><p><code>RamRole</code>: The Dataworks user ID, prefixed with <code>ROLE_</code>.</p>
         * </li>
         * <li><p><code>DlfRole</code>: The DlfNext role name.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ROLE_32237475848545</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The principal type. Valid values:</p>
         * <ul>
         * <li><p>RamRole</p>
         * </li>
         * <li><p>RamUser</p>
         * </li>
         * <li><p>DlfRole</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RamRole</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static ApplyResourceAccessPermissionRequestApplyContentsGrantee build(java.util.Map<String, ?> map) throws Exception {
            ApplyResourceAccessPermissionRequestApplyContentsGrantee self = new ApplyResourceAccessPermissionRequestApplyContentsGrantee();
            return TeaModel.build(map, self);
        }

        public ApplyResourceAccessPermissionRequestApplyContentsGrantee setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ApplyResourceAccessPermissionRequestApplyContentsGrantee setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ApplyResourceAccessPermissionRequestApplyContentsResource extends TeaModel {
        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The version of <code>ResourceSchema</code> that is required to parse the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>The resource metadata. The content is constrained by <code>ResourceSchema</code>.</p>
         */
        @NameInMap("MetaData")
        public java.util.Map<String, ?> metaData;

        public static ApplyResourceAccessPermissionRequestApplyContentsResource build(java.util.Map<String, ?> map) throws Exception {
            ApplyResourceAccessPermissionRequestApplyContentsResource self = new ApplyResourceAccessPermissionRequestApplyContentsResource();
            return TeaModel.build(map, self);
        }

        public ApplyResourceAccessPermissionRequestApplyContentsResource setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ApplyResourceAccessPermissionRequestApplyContentsResource setDefVersion(String defVersion) {
            this.defVersion = defVersion;
            return this;
        }
        public String getDefVersion() {
            return this.defVersion;
        }

        public ApplyResourceAccessPermissionRequestApplyContentsResource setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

    }

    public static class ApplyResourceAccessPermissionRequestApplyContents extends TeaModel {
        /**
         * <p>The requested permissions.</p>
         * <p>Note: The supported permission types vary by resource level and are constrained by the <code>ResourceSchema</code> of the corresponding resource type.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AccessTypes")
        public java.util.List<String> accessTypes;

        /**
         * <p>The authorization method.</p>
         * <p>Note: This parameter is supported only for <code>SEVERLESS_STARROCKS</code> resources. Valid values are <code>ranger</code> and <code>starrocksManager</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ranger</p>
         */
        @NameInMap("AuthMethod")
        public String authMethod;

        /**
         * <p>The permission expiration time, as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1785835708000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The principal to which permissions are granted.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Grantee")
        public ApplyResourceAccessPermissionRequestApplyContentsGrantee grantee;

        /**
         * <p>The resource for which permissions are requested.</p>
         */
        @NameInMap("Resource")
        public ApplyResourceAccessPermissionRequestApplyContentsResource resource;

        public static ApplyResourceAccessPermissionRequestApplyContents build(java.util.Map<String, ?> map) throws Exception {
            ApplyResourceAccessPermissionRequestApplyContents self = new ApplyResourceAccessPermissionRequestApplyContents();
            return TeaModel.build(map, self);
        }

        public ApplyResourceAccessPermissionRequestApplyContents setAccessTypes(java.util.List<String> accessTypes) {
            this.accessTypes = accessTypes;
            return this;
        }
        public java.util.List<String> getAccessTypes() {
            return this.accessTypes;
        }

        public ApplyResourceAccessPermissionRequestApplyContents setAuthMethod(String authMethod) {
            this.authMethod = authMethod;
            return this;
        }
        public String getAuthMethod() {
            return this.authMethod;
        }

        public ApplyResourceAccessPermissionRequestApplyContents setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public ApplyResourceAccessPermissionRequestApplyContents setGrantee(ApplyResourceAccessPermissionRequestApplyContentsGrantee grantee) {
            this.grantee = grantee;
            return this;
        }
        public ApplyResourceAccessPermissionRequestApplyContentsGrantee getGrantee() {
            return this.grantee;
        }

        public ApplyResourceAccessPermissionRequestApplyContents setResource(ApplyResourceAccessPermissionRequestApplyContentsResource resource) {
            this.resource = resource;
            return this;
        }
        public ApplyResourceAccessPermissionRequestApplyContentsResource getResource() {
            return this.resource;
        }

    }

}
