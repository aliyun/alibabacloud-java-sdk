// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyApplicationsResponseBody extends TeaModel {
    /**
     * <p>The paginated results.</p>
     */
    @NameInMap("Data")
    public ListMyApplicationsResponseBodyData data;

    /**
     * <p>A unique identifier (UUID) generated for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc5df3a17****903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMyApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyApplicationsResponseBody self = new ListMyApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyApplicationsResponseBody setData(ListMyApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMyApplicationsResponseBodyData getData() {
        return this.data;
    }

    public ListMyApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMyApplicationsResponseBodyDataDataContentsGrantee extends TeaModel {
        /**
         * <p>The ID of the principal. The value of this parameter varies based on the value of <code>PrincipalType</code>:</p>
         * <ul>
         * <li><p><code>RamUser</code>: The DataWorks user ID.</p>
         * </li>
         * <li><p><code>RamRole</code>: The DataWorks user ID, prefixed with <code>ROLE_</code>.</p>
         * </li>
         * <li><p><code>DataworksTenantMember</code>: The DataWorks user ID.</p>
         * </li>
         * <li><p><code>DataworksTenantRole</code>: The DataWorks tenant role code.</p>
         * </li>
         * <li><p><code>DataworksProjectRole</code>: The DataWorks workspace role code.</p>
         * </li>
         * <li><p><code>DataworksProjectMember</code>: The DataWorks user ID.</p>
         * </li>
         * <li><p><code>DlfRole</code>: The DlfNext role name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROLE_3133343434</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The type of the principal. Valid values:</p>
         * <ul>
         * <li><p><code>RamRole</code></p>
         * </li>
         * <li><p><code>RamUser</code></p>
         * </li>
         * <li><p><code>DataworksTenantMember</code></p>
         * </li>
         * <li><p><code>DataworksTenantRole</code></p>
         * </li>
         * <li><p><code>DataworksProjectMember</code></p>
         * </li>
         * <li><p><code>DataworksProjectRole</code></p>
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

        public static ListMyApplicationsResponseBodyDataDataContentsGrantee build(java.util.Map<String, ?> map) throws Exception {
            ListMyApplicationsResponseBodyDataDataContentsGrantee self = new ListMyApplicationsResponseBodyDataDataContentsGrantee();
            return TeaModel.build(map, self);
        }

        public ListMyApplicationsResponseBodyDataDataContentsGrantee setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListMyApplicationsResponseBodyDataDataContentsGrantee setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListMyApplicationsResponseBodyDataDataContentsResource extends TeaModel {
        /**
         * <p><strong>The name of the <code>ResourceSchema</code> used to parse the resource.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p><strong>The version of the <code>ResourceSchema</code> used to parse the resource.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p><strong>The resource metadata. Its format is defined by the <code>ResourceSchema</code>.</strong></p>
         */
        @NameInMap("MetaData")
        public java.util.Map<String, ?> metaData;

        public static ListMyApplicationsResponseBodyDataDataContentsResource build(java.util.Map<String, ?> map) throws Exception {
            ListMyApplicationsResponseBodyDataDataContentsResource self = new ListMyApplicationsResponseBodyDataDataContentsResource();
            return TeaModel.build(map, self);
        }

        public ListMyApplicationsResponseBodyDataDataContentsResource setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListMyApplicationsResponseBodyDataDataContentsResource setDefVersion(String defVersion) {
            this.defVersion = defVersion;
            return this;
        }
        public String getDefVersion() {
            return this.defVersion;
        }

        public ListMyApplicationsResponseBodyDataDataContentsResource setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

    }

    public static class ListMyApplicationsResponseBodyDataDataContents extends TeaModel {
        /**
         * <p>The permissions requested for the resource.</p>
         */
        @NameInMap("AccessTypes")
        public java.util.List<String> accessTypes;

        /**
         * <p>The authorization method.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AuthMethod")
        public String authMethod;

        /**
         * <p>The time when the item was created, in Unix timestamp format (milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-29 15:04:52</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>MAXCOMPUTE</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>When the permission expires, in Unix timestamp format (milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1782354014507</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The granted permissions.</p>
         */
        @NameInMap("FinalAccessTypes")
        public java.util.List<String> finalAccessTypes;

        /**
         * <p><strong>The principal to be granted the permission.</strong></p>
         */
        @NameInMap("Grantee")
        public ListMyApplicationsResponseBodyDataDataContentsGrantee grantee;

        /**
         * <p>The unique ID of the application item.</p>
         * 
         * <strong>example:</strong>
         * <p>a8aa620037bb410ea13837f9b4d053d8</p>
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
         * <p><strong>The requested resource.</strong></p>
         */
        @NameInMap("Resource")
        public ListMyApplicationsResponseBodyDataDataContentsResource resource;

        /**
         * <p>The category of the resource. For example, <code>table</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li><p><code>WaitApproval</code>: Pending approval</p>
         * </li>
         * <li><p><code>Confirmed</code>: Pending authorization</p>
         * </li>
         * <li><p><code>RejectApproval</code>: Rejected</p>
         * </li>
         * <li><p><code>AuthorizeSucceed</code>: Authorization succeeded</p>
         * </li>
         * <li><p><code>AuthorizeFailed</code>: Authorization failed</p>
         * </li>
         * <li><p><code>Deleted</code>: Deleted</p>
         * </li>
         * <li><p><code>Canceled</code>: Canceled</p>
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
         * <p>The time when the item was last updated, in Unix timestamp format (milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-08 23:58:59</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListMyApplicationsResponseBodyDataDataContents build(java.util.Map<String, ?> map) throws Exception {
            ListMyApplicationsResponseBodyDataDataContents self = new ListMyApplicationsResponseBodyDataDataContents();
            return TeaModel.build(map, self);
        }

        public ListMyApplicationsResponseBodyDataDataContents setAccessTypes(java.util.List<String> accessTypes) {
            this.accessTypes = accessTypes;
            return this;
        }
        public java.util.List<String> getAccessTypes() {
            return this.accessTypes;
        }

        public ListMyApplicationsResponseBodyDataDataContents setAuthMethod(String authMethod) {
            this.authMethod = authMethod;
            return this;
        }
        public String getAuthMethod() {
            return this.authMethod;
        }

        public ListMyApplicationsResponseBodyDataDataContents setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMyApplicationsResponseBodyDataDataContents setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListMyApplicationsResponseBodyDataDataContents setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public ListMyApplicationsResponseBodyDataDataContents setFinalAccessTypes(java.util.List<String> finalAccessTypes) {
            this.finalAccessTypes = finalAccessTypes;
            return this;
        }
        public java.util.List<String> getFinalAccessTypes() {
            return this.finalAccessTypes;
        }

        public ListMyApplicationsResponseBodyDataDataContents setGrantee(ListMyApplicationsResponseBodyDataDataContentsGrantee grantee) {
            this.grantee = grantee;
            return this;
        }
        public ListMyApplicationsResponseBodyDataDataContentsGrantee getGrantee() {
            return this.grantee;
        }

        public ListMyApplicationsResponseBodyDataDataContents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMyApplicationsResponseBodyDataDataContents setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public ListMyApplicationsResponseBodyDataDataContents setResource(ListMyApplicationsResponseBodyDataDataContentsResource resource) {
            this.resource = resource;
            return this;
        }
        public ListMyApplicationsResponseBodyDataDataContentsResource getResource() {
            return this.resource;
        }

        public ListMyApplicationsResponseBodyDataDataContents setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListMyApplicationsResponseBodyDataDataContents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMyApplicationsResponseBodyDataDataContents setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListMyApplicationsResponseBodyDataDataContents setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListMyApplicationsResponseBodyDataData extends TeaModel {
        /**
         * <p>The time the application was submitted, in Unix timestamp format (milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1779695088000</p>
         */
        @NameInMap("ApplicationTime")
        public Long applicationTime;

        /**
         * <p>The content of the application.</p>
         */
        @NameInMap("Contents")
        public java.util.List<ListMyApplicationsResponseBodyDataDataContents> contents;

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
         * <p>176906667488145</p>
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
         * <li><p><code>WaitApproval</code>: Pending approval</p>
         * </li>
         * <li><p><code>Confirmed</code>: Pending authorization</p>
         * </li>
         * <li><p><code>RejectApproval</code>: Rejected</p>
         * </li>
         * <li><p><code>AuthorizeSucceed</code>: Authorization succeeded</p>
         * </li>
         * <li><p><code>AuthorizeFailed</code>: Authorization failed</p>
         * </li>
         * <li><p><code>Deleted</code>: Deleted</p>
         * </li>
         * <li><p><code>Canceled</code>: Canceled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deleted</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListMyApplicationsResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListMyApplicationsResponseBodyDataData self = new ListMyApplicationsResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListMyApplicationsResponseBodyDataData setApplicationTime(Long applicationTime) {
            this.applicationTime = applicationTime;
            return this;
        }
        public Long getApplicationTime() {
            return this.applicationTime;
        }

        public ListMyApplicationsResponseBodyDataData setContents(java.util.List<ListMyApplicationsResponseBodyDataDataContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<ListMyApplicationsResponseBodyDataDataContents> getContents() {
            return this.contents;
        }

        public ListMyApplicationsResponseBodyDataData setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListMyApplicationsResponseBodyDataData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public ListMyApplicationsResponseBodyDataData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListMyApplicationsResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListMyApplicationsResponseBodyData extends TeaModel {
        /**
         * <p>The list of application details.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListMyApplicationsResponseBodyDataData> data;

        /**
         * <p>Indicates whether more results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The cursor to retrieve the next page of results. If this parameter is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJpZCI6NDU2fQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The page size. Default value: 10. Maximum value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListMyApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMyApplicationsResponseBodyData self = new ListMyApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMyApplicationsResponseBodyData setData(java.util.List<ListMyApplicationsResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListMyApplicationsResponseBodyDataData> getData() {
            return this.data;
        }

        public ListMyApplicationsResponseBodyData setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMyApplicationsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListMyApplicationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
