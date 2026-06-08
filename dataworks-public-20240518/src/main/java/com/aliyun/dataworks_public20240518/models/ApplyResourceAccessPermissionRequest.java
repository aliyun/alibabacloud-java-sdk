// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ApplyResourceAccessPermissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyContents")
    public java.util.List<ApplyResourceAccessPermissionRequestApplyContents> applyContents;

    /**
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ROLE_32237475848545</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("AccessTypes")
        public java.util.List<String> accessTypes;

        /**
         * <strong>example:</strong>
         * <p>ranger</p>
         */
        @NameInMap("AuthMethod")
        public String authMethod;

        /**
         * <strong>example:</strong>
         * <p>1785835708000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Grantee")
        public ApplyResourceAccessPermissionRequestApplyContentsGrantee grantee;

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
