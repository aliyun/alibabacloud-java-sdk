// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyRelatedApprovalsResponseBody extends TeaModel {
    /**
     * <p>The paginated results.</p>
     */
    @NameInMap("Data")
    public ListMyRelatedApprovalsResponseBodyData data;

    /**
     * <p>The request ID, a universally unique identifier (UUID).</p>
     * 
     * <strong>example:</strong>
     * <p>0bc5df3a17****903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMyRelatedApprovalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyRelatedApprovalsResponseBody self = new ListMyRelatedApprovalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyRelatedApprovalsResponseBody setData(ListMyRelatedApprovalsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMyRelatedApprovalsResponseBodyData getData() {
        return this.data;
    }

    public ListMyRelatedApprovalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMyRelatedApprovalsResponseBodyDataDataContentsGrantee extends TeaModel {
        /**
         * <p>The principal ID.</p>
         * <p>Note: The format of this ID depends on the PrincipalType:</p>
         * <ul>
         * <li><p>RamUser: The user ID.</p>
         * </li>
         * <li><p>RamRole: The user ID, prefixed with <code>ROLE_</code>.</p>
         * </li>
         * <li><p>DataworksTenantMember: The user ID.</p>
         * </li>
         * <li><p>DataworksTenantRole: The role code in the Dataworks tenant.</p>
         * </li>
         * <li><p>DataworksProjectRole: The role code in the Dataworks workspace.</p>
         * </li>
         * <li><p>DataworksProjectMember: The user ID.</p>
         * </li>
         * <li><p>DlfRole: The name of the DlfNext role.</p>
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
         * <li><p>RamRole</p>
         * </li>
         * <li><p>RamUser</p>
         * </li>
         * <li><p>DataworksTenantMember</p>
         * </li>
         * <li><p>DataworksTenantRole</p>
         * </li>
         * <li><p>DataworksProjectMember</p>
         * </li>
         * <li><p>DataworksProjectRole</p>
         * </li>
         * <li><p>DlfRole</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RamRole</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static ListMyRelatedApprovalsResponseBodyDataDataContentsGrantee build(java.util.Map<String, ?> map) throws Exception {
            ListMyRelatedApprovalsResponseBodyDataDataContentsGrantee self = new ListMyRelatedApprovalsResponseBodyDataDataContentsGrantee();
            return TeaModel.build(map, self);
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContentsGrantee setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContentsGrantee setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListMyRelatedApprovalsResponseBodyDataDataContentsResource extends TeaModel {
        /**
         * <p>The name of the ResourceSchema required to parse the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The version of the ResourceSchema required to parse the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>The resource metadata. The content is constrained by the ResourceSchema.</p>
         */
        @NameInMap("MetaData")
        public java.util.Map<String, ?> metaData;

        public static ListMyRelatedApprovalsResponseBodyDataDataContentsResource build(java.util.Map<String, ?> map) throws Exception {
            ListMyRelatedApprovalsResponseBodyDataDataContentsResource self = new ListMyRelatedApprovalsResponseBodyDataDataContentsResource();
            return TeaModel.build(map, self);
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContentsResource setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContentsResource setDefVersion(String defVersion) {
            this.defVersion = defVersion;
            return this;
        }
        public String getDefVersion() {
            return this.defVersion;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContentsResource setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

    }

    public static class ListMyRelatedApprovalsResponseBodyDataDataContents extends TeaModel {
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
         * <p>The time when the entry was created, in milliseconds since the Unix epoch.</p>
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
         * <p>The permission\&quot;s expiration time, in milliseconds since the Unix epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>1779695088000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The permissions granted for the resource after the final approval.</p>
         */
        @NameInMap("FinalAccessTypes")
        public java.util.List<String> finalAccessTypes;

        /**
         * <p>The grantee.</p>
         */
        @NameInMap("Grantee")
        public ListMyRelatedApprovalsResponseBodyDataDataContentsGrantee grantee;

        /**
         * <p>The unique ID of the request content.</p>
         * 
         * <strong>example:</strong>
         * <p>1009516415</p>
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
         * <p>The resource declaration.</p>
         */
        @NameInMap("Resource")
        public ListMyRelatedApprovalsResponseBodyDataDataContentsResource resource;

        /**
         * <p>The name of the resource type at the leaf-node level.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li><p>WaitApproval: Waiting for approval.</p>
         * </li>
         * <li><p>Confirmed: Pending authorization.</p>
         * </li>
         * <li><p>RejectApproval: Approval rejected.</p>
         * </li>
         * <li><p>AuthorizeSucceed: Authorization succeeded.</p>
         * </li>
         * <li><p>AuthorizeFailed: Authorization failed.</p>
         * </li>
         * <li><p>Deleted: Deleted.</p>
         * </li>
         * <li><p>Canceled: Canceled.</p>
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
         * <p>The time when the entry was last updated, in milliseconds since the Unix epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05 18:24:13</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListMyRelatedApprovalsResponseBodyDataDataContents build(java.util.Map<String, ?> map) throws Exception {
            ListMyRelatedApprovalsResponseBodyDataDataContents self = new ListMyRelatedApprovalsResponseBodyDataDataContents();
            return TeaModel.build(map, self);
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setAccessTypes(java.util.List<String> accessTypes) {
            this.accessTypes = accessTypes;
            return this;
        }
        public java.util.List<String> getAccessTypes() {
            return this.accessTypes;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setAuthMethod(String authMethod) {
            this.authMethod = authMethod;
            return this;
        }
        public String getAuthMethod() {
            return this.authMethod;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setFinalAccessTypes(java.util.List<String> finalAccessTypes) {
            this.finalAccessTypes = finalAccessTypes;
            return this;
        }
        public java.util.List<String> getFinalAccessTypes() {
            return this.finalAccessTypes;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setGrantee(ListMyRelatedApprovalsResponseBodyDataDataContentsGrantee grantee) {
            this.grantee = grantee;
            return this;
        }
        public ListMyRelatedApprovalsResponseBodyDataDataContentsGrantee getGrantee() {
            return this.grantee;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setResource(ListMyRelatedApprovalsResponseBodyDataDataContentsResource resource) {
            this.resource = resource;
            return this;
        }
        public ListMyRelatedApprovalsResponseBodyDataDataContentsResource getResource() {
            return this.resource;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListMyRelatedApprovalsResponseBodyDataDataContents setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListMyRelatedApprovalsResponseBodyDataData extends TeaModel {
        /**
         * <p>The time when the request was submitted, in milliseconds since the Unix epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>1779695088000</p>
         */
        @NameInMap("ApplicationTime")
        public Long applicationTime;

        /**
         * <p>The content of the request.</p>
         */
        @NameInMap("Contents")
        public java.util.List<ListMyRelatedApprovalsResponseBodyDataDataContents> contents;

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
         * <li><p>WaitApproval: Waiting for approval.</p>
         * </li>
         * <li><p>Confirmed: Pending authorization.</p>
         * </li>
         * <li><p>RejectApproval: Approval rejected.</p>
         * </li>
         * <li><p>AuthorizeSucceed: Authorization succeeded.</p>
         * </li>
         * <li><p>AuthorizeFailed: Authorization failed.</p>
         * </li>
         * <li><p>Deleted: Deleted.</p>
         * </li>
         * <li><p>Canceled: Canceled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deleted</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListMyRelatedApprovalsResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListMyRelatedApprovalsResponseBodyDataData self = new ListMyRelatedApprovalsResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListMyRelatedApprovalsResponseBodyDataData setApplicationTime(Long applicationTime) {
            this.applicationTime = applicationTime;
            return this;
        }
        public Long getApplicationTime() {
            return this.applicationTime;
        }

        public ListMyRelatedApprovalsResponseBodyDataData setContents(java.util.List<ListMyRelatedApprovalsResponseBodyDataDataContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<ListMyRelatedApprovalsResponseBodyDataDataContents> getContents() {
            return this.contents;
        }

        public ListMyRelatedApprovalsResponseBodyDataData setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListMyRelatedApprovalsResponseBodyDataData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public ListMyRelatedApprovalsResponseBodyDataData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListMyRelatedApprovalsResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListMyRelatedApprovalsResponseBodyData extends TeaModel {
        /**
         * <p>The details of the approval requests.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListMyRelatedApprovalsResponseBodyDataData> data;

        /**
         * <p>Indicates whether more results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The token to use to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJpZCI6NDU2fQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of entries per page. Default: 10. Maximum: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListMyRelatedApprovalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMyRelatedApprovalsResponseBodyData self = new ListMyRelatedApprovalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMyRelatedApprovalsResponseBodyData setData(java.util.List<ListMyRelatedApprovalsResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListMyRelatedApprovalsResponseBodyDataData> getData() {
            return this.data;
        }

        public ListMyRelatedApprovalsResponseBodyData setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMyRelatedApprovalsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListMyRelatedApprovalsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
