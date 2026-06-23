// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPendingApprovalsResponseBody extends TeaModel {
    /**
     * <p>The paginated results.</p>
     */
    @NameInMap("Data")
    public ListPendingApprovalsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc5df3a17****903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPendingApprovalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPendingApprovalsResponseBody self = new ListPendingApprovalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPendingApprovalsResponseBody setData(ListPendingApprovalsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPendingApprovalsResponseBodyData getData() {
        return this.data;
    }

    public ListPendingApprovalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPendingApprovalsResponseBodyDataDataContentsGrantee extends TeaModel {
        /**
         * <p>The principal ID.</p>
         * <p>Note: The meaning of this ID varies based on the <code>principalType</code>.</p>
         * <ul>
         * <li><p>If the <code>principalType</code> is <code>RamUser</code>, this is the DataWorks user ID.</p>
         * </li>
         * <li><p>If the <code>principalType</code> is <code>RamRole</code>, this is the DataWorks user ID, prefixed with &quot;ROLE_&quot;.</p>
         * </li>
         * <li><p>If the <code>principalType</code> is <code>DataWorksTenantMember</code>, this is the DataWorks user ID.</p>
         * </li>
         * <li><p>If the <code>principalType</code> is <code>DataWorksTenantRole</code>, this is the DataWorks tenant role code.</p>
         * </li>
         * <li><p>If the <code>principalType</code> is <code>DataWorksProjectRole</code>, this is the DataWorks workspace role code.</p>
         * </li>
         * <li><p>If the <code>principalType</code> is <code>DataWorksProjectMember</code>, this is the DataWorks user ID.</p>
         * </li>
         * <li><p>If the <code>principalType</code> is <code>DlfRole</code>, this is the DLF role name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>213463068144525171</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The principal type. Valid values:</p>
         * <ul>
         * <li><p><code>RamRole</code>: A RAM role.</p>
         * </li>
         * <li><p><code>RamUser</code>: A RAM user.</p>
         * </li>
         * <li><p><code>DataWorksTenantMember</code>: A DataWorks tenant member.</p>
         * </li>
         * <li><p><code>DataWorksTenantRole</code>: A DataWorks tenant role.</p>
         * </li>
         * <li><p><code>DataWorksProjectMember</code>: A DataWorks workspace member.</p>
         * </li>
         * <li><p><code>DataWorksProjectRole</code>: A DataWorks workspace role.</p>
         * </li>
         * <li><p><code>DlfRole</code>: A DLF role.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RamUser</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static ListPendingApprovalsResponseBodyDataDataContentsGrantee build(java.util.Map<String, ?> map) throws Exception {
            ListPendingApprovalsResponseBodyDataDataContentsGrantee self = new ListPendingApprovalsResponseBodyDataDataContentsGrantee();
            return TeaModel.build(map, self);
        }

        public ListPendingApprovalsResponseBodyDataDataContentsGrantee setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListPendingApprovalsResponseBodyDataDataContentsGrantee setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListPendingApprovalsResponseBodyDataDataContentsResource extends TeaModel {
        /**
         * <p>The name of the <code>ResourceSchema</code> used to parse the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The version of the <code>ResourceSchema</code> used to parse the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>The resource metadata. The content is constrained by the DefSchema.</p>
         */
        @NameInMap("MetaData")
        public java.util.Map<String, ?> metaData;

        public static ListPendingApprovalsResponseBodyDataDataContentsResource build(java.util.Map<String, ?> map) throws Exception {
            ListPendingApprovalsResponseBodyDataDataContentsResource self = new ListPendingApprovalsResponseBodyDataDataContentsResource();
            return TeaModel.build(map, self);
        }

        public ListPendingApprovalsResponseBodyDataDataContentsResource setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListPendingApprovalsResponseBodyDataDataContentsResource setDefVersion(String defVersion) {
            this.defVersion = defVersion;
            return this;
        }
        public String getDefVersion() {
            return this.defVersion;
        }

        public ListPendingApprovalsResponseBodyDataDataContentsResource setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

    }

    public static class ListPendingApprovalsResponseBodyDataDataContents extends TeaModel {
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
         * <p>The creation time of the entry.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-11 10:13:21</p>
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
         * <p>The permission expiration time, in milliseconds since the Unix epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>1782354014507</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The final permissions granted after approval.</p>
         */
        @NameInMap("FinalAccessTypes")
        public java.util.List<String> finalAccessTypes;

        /**
         * <p>Information about the grantee.</p>
         */
        @NameInMap("Grantee")
        public ListPendingApprovalsResponseBodyDataDataContentsGrantee grantee;

        /**
         * <p>The unique identifier of the requested item.</p>
         * 
         * <strong>example:</strong>
         * <p>210001918826</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p><strong>The process instance ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>176906667488145</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <p>The resource declaration.</p>
         */
        @NameInMap("Resource")
        public ListPendingApprovalsResponseBodyDataDataContentsResource resource;

        /**
         * <p>The type of the resource, such as a table or function.</p>
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
         * <li><p><code>AuthorizeSucceed</code>: Authorization successful</p>
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
         * <p>The time the entry was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-06 19:13:05</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListPendingApprovalsResponseBodyDataDataContents build(java.util.Map<String, ?> map) throws Exception {
            ListPendingApprovalsResponseBodyDataDataContents self = new ListPendingApprovalsResponseBodyDataDataContents();
            return TeaModel.build(map, self);
        }

        public ListPendingApprovalsResponseBodyDataDataContents setAccessTypes(java.util.List<String> accessTypes) {
            this.accessTypes = accessTypes;
            return this;
        }
        public java.util.List<String> getAccessTypes() {
            return this.accessTypes;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setAuthMethod(String authMethod) {
            this.authMethod = authMethod;
            return this;
        }
        public String getAuthMethod() {
            return this.authMethod;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setFinalAccessTypes(java.util.List<String> finalAccessTypes) {
            this.finalAccessTypes = finalAccessTypes;
            return this;
        }
        public java.util.List<String> getFinalAccessTypes() {
            return this.finalAccessTypes;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setGrantee(ListPendingApprovalsResponseBodyDataDataContentsGrantee grantee) {
            this.grantee = grantee;
            return this;
        }
        public ListPendingApprovalsResponseBodyDataDataContentsGrantee getGrantee() {
            return this.grantee;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setResource(ListPendingApprovalsResponseBodyDataDataContentsResource resource) {
            this.resource = resource;
            return this;
        }
        public ListPendingApprovalsResponseBodyDataDataContentsResource getResource() {
            return this.resource;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListPendingApprovalsResponseBodyDataDataContents setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListPendingApprovalsResponseBodyDataData extends TeaModel {
        /**
         * <p>The submission time of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>申请时间</p>
         */
        @NameInMap("ApplicationTime")
        public Long applicationTime;

        /**
         * <p>The content of the request.</p>
         */
        @NameInMap("Contents")
        public java.util.List<ListPendingApprovalsResponseBodyDataDataContents> contents;

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
         * <p>The reason for the request.</p>
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
         * <li><p><code>AuthorizeSucceed</code>: Authorization successful</p>
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

        public static ListPendingApprovalsResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListPendingApprovalsResponseBodyDataData self = new ListPendingApprovalsResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListPendingApprovalsResponseBodyDataData setApplicationTime(Long applicationTime) {
            this.applicationTime = applicationTime;
            return this;
        }
        public Long getApplicationTime() {
            return this.applicationTime;
        }

        public ListPendingApprovalsResponseBodyDataData setContents(java.util.List<ListPendingApprovalsResponseBodyDataDataContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<ListPendingApprovalsResponseBodyDataDataContents> getContents() {
            return this.contents;
        }

        public ListPendingApprovalsResponseBodyDataData setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListPendingApprovalsResponseBodyDataData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public ListPendingApprovalsResponseBodyDataData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListPendingApprovalsResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListPendingApprovalsResponseBodyData extends TeaModel {
        /**
         * <p>The list of pending approvals.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListPendingApprovalsResponseBodyDataData> data;

        /**
         * <p>Indicates whether more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>A token to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJpZCI6MTIzfQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The page size. Default: 10. Maximum: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListPendingApprovalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPendingApprovalsResponseBodyData self = new ListPendingApprovalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPendingApprovalsResponseBodyData setData(java.util.List<ListPendingApprovalsResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListPendingApprovalsResponseBodyDataData> getData() {
            return this.data;
        }

        public ListPendingApprovalsResponseBodyData setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListPendingApprovalsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListPendingApprovalsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
