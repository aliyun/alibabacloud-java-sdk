// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetApplicationContentsResponseBody extends TeaModel {
    /**
     * <p>The process instance and the associated request details.</p>
     */
    @NameInMap("Data")
    public GetApplicationContentsResponseBodyData data;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
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
         * <p>The authorization principal ID. The mapped ID has different semantics for different principal types:</p>
         * <ul>
         * <li><p>RamUser: the DataWorks user ID.</p>
         * </li>
         * <li><p>RamRole: the DataWorks user ID starting with &quot;ROLE_&quot;.</p>
         * </li>
         * <li><p>DlfRole: the DlfNext role name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROLE_3133343434</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The authorization principal type. Valid values:</p>
         * <ul>
         * <li>RamUser</li>
         * <li>RamRole</li>
         * <li>DlfRole</li>
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
         * <p>The resource type.</p>
         * <p>Note: The resource types supported by the system are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The resource parsing version is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.version.</p>
         * <p><a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>The resource metadata declaration.</p>
         * <p>Note: The metadata is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources. A valid resource declaration must include the full-path metadata declaration from level 0 to the validLeaf level.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
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
         * <p>The list of requested permissions.</p>
         * <p>Note: Different levels of resources support different types of permission requests, which are uniformly constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.isValidLeaf, accessTypeRestrictions, and authMethodAccessTypes.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
         */
        @NameInMap("AccessTypes")
        public java.util.List<String> accessTypes;

        /**
         * <p>The authorization method. Currently, only SEVERLESS_STARROCKS supports specifying the authorization method: ranger and starrocksManager.</p>
         * <p>Note: Different resources support different authorization methods, which are uniformly constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.authMethods.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
         * 
         * <strong>example:</strong>
         * <p>ranger</p>
         */
        @NameInMap("AuthMethod")
        public String authMethod;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1773972024000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The resource type.</p>
         * <p>Note: The resource types supported by the system are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The expiration date of the permission. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1785835708000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The list of resource operation permissions that are finally approved.</p>
         */
        @NameInMap("FinalAccessTypes")
        public java.util.List<String> finalAccessTypes;

        /**
         * <p>The description of the authorization principal. </p>
         * <p>Note: The authorization principal types supported by the system are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.authPrincipal.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
         */
        @NameInMap("Grantee")
        public GetApplicationContentsResponseBodyDataContentsGrantee grantee;

        /**
         * <p>The unique identifier of the request item.</p>
         * 
         * <strong>example:</strong>
         * <p>Y9H7AKFmjhWzLYdZNDZA5</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the approval process instance for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>777799223</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <p>The resource declaration. The resource description is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
         */
        @NameInMap("Resource")
        public GetApplicationContentsResponseBodyDataContentsResource resource;

        /**
         * <p>The least privilege resource type.</p>
         * <p>Note: The least privilege resource types are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources[*].isValidLeaf being true.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li>WaitApproval: pending approval</li>
         * <li>Confirmed: pending authorization</li>
         * <li>RejectApproval: approval rejected</li>
         * <li>AuthorizeSucceed: authorization succeeded</li>
         * <li>AuthorizeFailed: authorization failed</li>
         * <li>Deleted: deleted</li>
         * <li>Canceled: canceled</li>
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
         * <p>The update time.</p>
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
         * <p>The time when the request was submitted. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1779675618000</p>
         */
        @NameInMap("ApplicationTime")
        public Long applicationTime;

        /**
         * <p>The list of request items.</p>
         */
        @NameInMap("Contents")
        public java.util.List<GetApplicationContentsResponseBodyDataContents> contents;

        /**
         * <p>The resource type.</p>
         * <p>Note: The resource types supported by the system are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
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
         * <p>The reason for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Business requirement</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li>WaitApproval: pending approval</li>
         * <li>Confirmed: pending authorization</li>
         * <li>RejectApproval: approval rejected</li>
         * <li>AuthorizeSucceed: authorization succeeded</li>
         * <li>AuthorizeFailed: authorization failed</li>
         * <li>Deleted: deleted</li>
         * <li>Canceled: canceled</li>
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
