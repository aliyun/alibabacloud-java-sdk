// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetApplicationContentsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetApplicationContentsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>34267E2E-0335-1A60-A1F0-ADA530890CBA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationContentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationContentsResponseBody self = new GetApplicationContentsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationContentsResponseBody setData(GetApplicationContentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApplicationContentsResponseBodyData getData() {
        return this.data;
    }

    public GetApplicationContentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationContentsResponseBodyDataContentsGrantee extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ROLE_3133343434</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <strong>example:</strong>
         * <p>RamRole</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static GetApplicationContentsResponseBodyDataContentsGrantee build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationContentsResponseBodyDataContentsGrantee self = new GetApplicationContentsResponseBodyDataContentsGrantee();
            return TeaModel.build(map, self);
        }

        public GetApplicationContentsResponseBodyDataContentsGrantee setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public GetApplicationContentsResponseBodyDataContentsGrantee setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class GetApplicationContentsResponseBodyDataContentsResource extends TeaModel {
        /**
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

        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;schema\&quot;:\&quot;default\&quot;,\&quot;threeTierModel\&quot;:false,\&quot;workspace\&quot;:\&quot;449656\&quot;,\&quot;project\&quot;:\&quot;sync_destination\&quot;,\&quot;table\&quot;:\&quot;order_table\&quot;,\&quot;tenant\&quot;:\&quot;524997424564736\&quot;}&quot;</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        public static GetApplicationContentsResponseBodyDataContentsResource build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationContentsResponseBodyDataContentsResource self = new GetApplicationContentsResponseBodyDataContentsResource();
            return TeaModel.build(map, self);
        }

        public GetApplicationContentsResponseBodyDataContentsResource setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public GetApplicationContentsResponseBodyDataContentsResource setDefVersion(String defVersion) {
            this.defVersion = defVersion;
            return this;
        }
        public String getDefVersion() {
            return this.defVersion;
        }

        public GetApplicationContentsResponseBodyDataContentsResource setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

    }

    public static class GetApplicationContentsResponseBodyDataContents extends TeaModel {
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
         * <p>1773972024000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <strong>example:</strong>
         * <p>1785835708000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        @NameInMap("FinalAccessTypes")
        public java.util.List<String> finalAccessTypes;

        @NameInMap("Grantee")
        public GetApplicationContentsResponseBodyDataContentsGrantee grantee;

        /**
         * <strong>example:</strong>
         * <p>Y9H7AKFmjhWzLYdZNDZA5</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>777799223</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("Resource")
        public GetApplicationContentsResponseBodyDataContentsResource resource;

        /**
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>WAIT_APPROVAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>69973837489</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>1773972024000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetApplicationContentsResponseBodyDataContents build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationContentsResponseBodyDataContents self = new GetApplicationContentsResponseBodyDataContents();
            return TeaModel.build(map, self);
        }

        public GetApplicationContentsResponseBodyDataContents setAccessTypes(java.util.List<String> accessTypes) {
            this.accessTypes = accessTypes;
            return this;
        }
        public java.util.List<String> getAccessTypes() {
            return this.accessTypes;
        }

        public GetApplicationContentsResponseBodyDataContents setAuthMethod(String authMethod) {
            this.authMethod = authMethod;
            return this;
        }
        public String getAuthMethod() {
            return this.authMethod;
        }

        public GetApplicationContentsResponseBodyDataContents setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetApplicationContentsResponseBodyDataContents setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public GetApplicationContentsResponseBodyDataContents setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public GetApplicationContentsResponseBodyDataContents setFinalAccessTypes(java.util.List<String> finalAccessTypes) {
            this.finalAccessTypes = finalAccessTypes;
            return this;
        }
        public java.util.List<String> getFinalAccessTypes() {
            return this.finalAccessTypes;
        }

        public GetApplicationContentsResponseBodyDataContents setGrantee(GetApplicationContentsResponseBodyDataContentsGrantee grantee) {
            this.grantee = grantee;
            return this;
        }
        public GetApplicationContentsResponseBodyDataContentsGrantee getGrantee() {
            return this.grantee;
        }

        public GetApplicationContentsResponseBodyDataContents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetApplicationContentsResponseBodyDataContents setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetApplicationContentsResponseBodyDataContents setResource(GetApplicationContentsResponseBodyDataContentsResource resource) {
            this.resource = resource;
            return this;
        }
        public GetApplicationContentsResponseBodyDataContentsResource getResource() {
            return this.resource;
        }

        public GetApplicationContentsResponseBodyDataContents setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetApplicationContentsResponseBodyDataContents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApplicationContentsResponseBodyDataContents setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetApplicationContentsResponseBodyDataContents setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetApplicationContentsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1779675618000</p>
         */
        @NameInMap("ApplicationTime")
        public Long applicationTime;

        @NameInMap("Contents")
        public java.util.List<GetApplicationContentsResponseBodyDataContents> contents;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <strong>example:</strong>
         * <p>332066440109224007</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>WaitApproval</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetApplicationContentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationContentsResponseBodyData self = new GetApplicationContentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplicationContentsResponseBodyData setApplicationTime(Long applicationTime) {
            this.applicationTime = applicationTime;
            return this;
        }
        public Long getApplicationTime() {
            return this.applicationTime;
        }

        public GetApplicationContentsResponseBodyData setContents(java.util.List<GetApplicationContentsResponseBodyDataContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<GetApplicationContentsResponseBodyDataContents> getContents() {
            return this.contents;
        }

        public GetApplicationContentsResponseBodyData setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public GetApplicationContentsResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetApplicationContentsResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetApplicationContentsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
