// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetApplicationContentsResponseBody extends TeaModel {
    /**
     * <p>The process instance and its associated application contents.</p>
     */
    @NameInMap("Data")
    public GetApplicationContentsResponseBodyData data;

    /**
     * <p>The request ID. Use this ID to locate logs and troubleshoot issues.</p>
     * 
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
         * <p>The ID of the principal. The format of the ID varies based on the <code>PrincipalType</code> value:</p>
         * <ul>
         * <li><p>If <code>PrincipalType</code> is <code>RamUser</code>, this parameter specifies the ID of a DataWorks user.</p>
         * </li>
         * <li><p>If <code>PrincipalType</code> is <code>RamRole</code>, this parameter specifies the ID of a role in DataWorks. The ID must be prefixed with <code>ROLE_</code>.</p>
         * </li>
         * <li><p>If <code>PrincipalType</code> is <code>DlfRole</code>, this parameter specifies the name of a DlfNext role.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROLE_3133343434</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The principal type. Valid values:</p>
         * <ul>
         * <li><p><code>RamUser</code></p>
         * </li>
         * <li><p><code>RamRole</code></p>
         * </li>
         * <li><p><code>DlfRole</code></p>
         * </li>
         * </ul>
         * 
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
         * <p>The name of the <code>ResourceSchema</code> that defines how to parse this resource.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The version of the <code>ResourceSchema</code> that defines how to parse this resource.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>The resource metadata. The structure of the metadata is defined by the <code>ResourceSchema</code>.</p>
         * 
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
        /**
         * <p>A list of the permissions requested for the resource.</p>
         */
        @NameInMap("AccessTypes")
        public java.util.List<String> accessTypes;

        /**
         * <p>The authorization method.</p>
         * 
         * <strong>example:</strong>
         * <p>ranger</p>
         */
        @NameInMap("AuthMethod")
        public String authMethod;

        /**
         * <p>The time when the content item was created. This value is a millisecond-precision timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1773972024000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The time when the permissions expire. This value is a millisecond-precision timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1785835708000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>A list of the permissions granted in the final approval.</p>
         */
        @NameInMap("FinalAccessTypes")
        public java.util.List<String> finalAccessTypes;

        /**
         * <p>The grantee.</p>
         */
        @NameInMap("Grantee")
        public GetApplicationContentsResponseBodyDataContentsGrantee grantee;

        /**
         * <p>The unique ID of the application content item.</p>
         * 
         * <strong>example:</strong>
         * <p>Y9H7AKFmjhWzLYdZNDZA5</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the approval process instance for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>777799223</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <p>The resource declaration.</p>
         */
        @NameInMap("Resource")
        public GetApplicationContentsResponseBodyDataContentsResource resource;

        /**
         * <p>The specific type of the resource, such as a table.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li><p><code>WaitApproval</code>: The item is pending approval.</p>
         * </li>
         * <li><p><code>Confirmed</code>: The item is pending authorization.</p>
         * </li>
         * <li><p><code>RejectApproval</code>: The item was rejected.</p>
         * </li>
         * <li><p><code>AuthorizeSucceed</code>: Authorization was successful.</p>
         * </li>
         * <li><p><code>AuthorizeFailed</code>: Authorization failed.</p>
         * </li>
         * <li><p><code>Deleted</code>: The item was deleted during the approval process.</p>
         * </li>
         * <li><p><code>Canceled</code>: The item was canceled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deleted</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69973837489</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The time when the content item was last updated. This value is a millisecond-precision timestamp.</p>
         * 
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
         * <p>The time when the application was submitted. This value is a millisecond-precision timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1779675618000</p>
         */
        @NameInMap("ApplicationTime")
        public Long applicationTime;

        /**
         * <p>A list of the application contents.</p>
         */
        @NameInMap("Contents")
        public java.util.List<GetApplicationContentsResponseBodyDataContents> contents;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The process instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>332066440109224007</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <p>The reason for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>业务需要</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li><p><code>WaitApproval</code>: The application is pending approval.</p>
         * </li>
         * <li><p><code>Confirmed</code>: The application is pending authorization.</p>
         * </li>
         * <li><p><code>RejectApproval</code>: The application was rejected.</p>
         * </li>
         * <li><p><code>AuthorizeSucceed</code>: Authorization was successful.</p>
         * </li>
         * <li><p><code>AuthorizeFailed</code>: Authorization failed.</p>
         * </li>
         * <li><p><code>Deleted</code>: The application was deleted.</p>
         * </li>
         * <li><p><code>Canceled</code>: The application was canceled.</p>
         * </li>
         * </ul>
         * 
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
