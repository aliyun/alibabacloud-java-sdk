// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPendingApprovalsResponseBody extends TeaModel {
    /**
     * <p>Paginated results.</p>
     */
    @NameInMap("Data")
    public ListPendingApprovalsResponseBodyData data;

    /**
     * <p>API request ID, generated as UUID.</p>
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
         * <p>Principal ID.</p>
         * <p>Note: The semantics of the ID vary depending on the principalType:</p>
         * <ul>
         * <li>RamUser: DataWorks UserId</li>
         * <li>RamRole: DataWorks UserId prefixed with &quot;ROLE_&quot;</li>
         * <li>DataworksTenantMember: DataWorks UserId</li>
         * <li>DataworksTenantRole: DataWorks tenant roleCode</li>
         * <li>DataworksProjectRole: DataWorks workspace roleCode</li>
         * <li>DataworksProjectMember: DataWorks UserId</li>
         * <li>DlfRole: DlfNext role name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>213463068144525171</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>Principal type. Enumeration:</p>
         * <ul>
         * <li>RamRole</li>
         * <li>RamUser</li>
         * <li>DataworksTenantMember</li>
         * <li>DataworksTenantRole</li>
         * <li>DataworksProjectMember</li>
         * <li>DataworksProjectRole</li>
         * <li>DlfRole</li>
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
         * <p>ResourceSchema.name that the resource parsing depends on.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>ResourceSchema.version that the resource parsing depends on.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>Resource metadata. The data content is constrained by ResourceSchema.</p>
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
         * <p>Resource operation permissions requested in the application.</p>
         */
        @NameInMap("AccessTypes")
        public java.util.List<String> accessTypes;

        /**
         * <p>Authorization method.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AuthMethod")
        public String authMethod;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-11 10:13:21</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>Permission expiration date, millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782354014507</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>Resource operation permissions finally approved.</p>
         */
        @NameInMap("FinalAccessTypes")
        public java.util.List<String> finalAccessTypes;

        /**
         * <p>Authorization principal description.</p>
         */
        @NameInMap("Grantee")
        public ListPendingApprovalsResponseBodyDataDataContentsGrantee grantee;

        /**
         * <p>Unique identifier of the request content.</p>
         * 
         * <strong>example:</strong>
         * <p>210001918826</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p><strong>Process instance ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>176906667488145</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <p>Resource declaration.</p>
         */
        @NameInMap("Resource")
        public ListPendingApprovalsResponseBodyDataDataContentsResource resource;

        /**
         * <p>Minimum permission resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>Approval status. Enumeration:</p>
         * <ul>
         * <li>WaitApproval: Pending approval</li>
         * <li>Confirmed: Pending authorization</li>
         * <li>RejectApproval: Approval rejected</li>
         * <li>AuthorizeSucceed: Authorization succeeded</li>
         * <li>AuthorizeFailed: Authorization failed</li>
         * <li>Deleted: Deleted</li>
         * <li>Canceled: Canceled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deleted</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69973837489</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Update time.</p>
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
         * <p>Time when the request was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>申请时间</p>
         */
        @NameInMap("ApplicationTime")
        public Long applicationTime;

        /**
         * <p>Request content.</p>
         */
        @NameInMap("Contents")
        public java.util.List<ListPendingApprovalsResponseBodyDataDataContents> contents;

        /**
         * <p>Resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>Process instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>176906667488145</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <p>Reason for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>业务需要</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Approval status. Enumeration:</p>
         * <ul>
         * <li>WaitApproval: Pending approval</li>
         * <li>Confirmed: Pending authorization</li>
         * <li>RejectApproval: Approval rejected</li>
         * <li>AuthorizeSucceed: Authorization succeeded</li>
         * <li>AuthorizeFailed: Authorization failed</li>
         * <li>Deleted: Deleted</li>
         * <li>Canceled: Canceled</li>
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
         * <p>Data list in the paginated results.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListPendingApprovalsResponseBodyDataData> data;

        /**
         * <p>Whether more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>Cursor.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJpZCI6MTIzfQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>Page size (default: 10, maximum: 200).</p>
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
