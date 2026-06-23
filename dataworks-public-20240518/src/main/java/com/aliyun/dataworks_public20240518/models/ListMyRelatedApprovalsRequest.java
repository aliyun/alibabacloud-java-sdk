// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyRelatedApprovalsRequest extends TeaModel {
    /**
     * <p>The permissions.</p>
     */
    @NameInMap("AccessTypes")
    public java.util.List<String> accessTypes;

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
     * <p>The end of the application time range, specified as a millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1779724799999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Filters approvals by the specified principal.</p>
     */
    @NameInMap("Grantee")
    public ListMyRelatedApprovalsRequestGrantee grantee;

    /**
     * <p>The pagination token that acts as a cursor to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJpZCI6MTIzfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource declaration.</p>
     */
    @NameInMap("Resource")
    public ListMyRelatedApprovalsRequestResource resource;

    /**
     * <p>The resource type, specified as a leaf node name. Multiple values are supported because a single business semantic can be mapped to multiple leaf node names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;table&quot;, &quot;column&quot;]</p>
     */
    @NameInMap("ResourceType")
    public java.util.List<String> resourceType;

    /**
     * <p>The start of the application time range, specified as a millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1771948800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Filters the results by approval status. Valid values:</p>
     * <ul>
     * <li><p><code>WaitApproval</code>: Pending approval</p>
     * </li>
     * <li><p><code>Confirmed</code>: Pending authorization</p>
     * </li>
     * <li><p><code>RejectApproval</code>: Approval rejected</p>
     * </li>
     * <li><p><code>AuthorizeSucceed</code>: Authorization succeeded</p>
     * </li>
     * <li><p><code>AuthorizeFailed</code>: Authorization failed</p>
     * </li>
     * <li><p><code>Deleted</code>: Deleted</p>
     * </li>
     * <li><p><code>Canceled</code>: Withdrawn</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WAIT_APPROVAL</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListMyRelatedApprovalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyRelatedApprovalsRequest self = new ListMyRelatedApprovalsRequest();
        return TeaModel.build(map, self);
    }

    public ListMyRelatedApprovalsRequest setAccessTypes(java.util.List<String> accessTypes) {
        this.accessTypes = accessTypes;
        return this;
    }
    public java.util.List<String> getAccessTypes() {
        return this.accessTypes;
    }

    public ListMyRelatedApprovalsRequest setDefSchema(String defSchema) {
        this.defSchema = defSchema;
        return this;
    }
    public String getDefSchema() {
        return this.defSchema;
    }

    public ListMyRelatedApprovalsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListMyRelatedApprovalsRequest setGrantee(ListMyRelatedApprovalsRequestGrantee grantee) {
        this.grantee = grantee;
        return this;
    }
    public ListMyRelatedApprovalsRequestGrantee getGrantee() {
        return this.grantee;
    }

    public ListMyRelatedApprovalsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMyRelatedApprovalsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMyRelatedApprovalsRequest setResource(ListMyRelatedApprovalsRequestResource resource) {
        this.resource = resource;
        return this;
    }
    public ListMyRelatedApprovalsRequestResource getResource() {
        return this.resource;
    }

    public ListMyRelatedApprovalsRequest setResourceType(java.util.List<String> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.List<String> getResourceType() {
        return this.resourceType;
    }

    public ListMyRelatedApprovalsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListMyRelatedApprovalsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static class ListMyRelatedApprovalsRequestGrantee extends TeaModel {
        /**
         * <p>The ID of the principal. The format varies based on the value of <code>PrincipalType</code>.</p>
         * <ul>
         * <li><p>If <code>PrincipalType</code> is <code>RamUser</code>, this parameter is the Dataworks user ID.</p>
         * </li>
         * <li><p>If <code>PrincipalType</code> is <code>RamRole</code>, this parameter is a Dataworks user ID that starts with <code>ROLE_</code>.</p>
         * </li>
         * <li><p>If <code>PrincipalType</code> is <code>DataworksTenantMember</code>, this parameter is the Dataworks user ID.</p>
         * </li>
         * <li><p>If <code>PrincipalType</code> is <code>DataworksTenantRole</code>, this parameter is the Dataworks tenant <code>roleCode</code>.</p>
         * </li>
         * <li><p>If <code>PrincipalType</code> is <code>DataworksProjectRole</code>, this parameter is the Dataworks workspace <code>roleCode</code>.</p>
         * </li>
         * <li><p>If <code>PrincipalType</code> is <code>DataworksProjectMember</code>, this parameter is the Dataworks user ID.</p>
         * </li>
         * <li><p>If <code>PrincipalType</code> is <code>DlfRole</code>, this parameter is the DlfNext role name.</p>
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

        public static ListMyRelatedApprovalsRequestGrantee build(java.util.Map<String, ?> map) throws Exception {
            ListMyRelatedApprovalsRequestGrantee self = new ListMyRelatedApprovalsRequestGrantee();
            return TeaModel.build(map, self);
        }

        public ListMyRelatedApprovalsRequestGrantee setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListMyRelatedApprovalsRequestGrantee setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListMyRelatedApprovalsRequestResource extends TeaModel {
        /**
         * <p>The <code>name</code> of the <code>ResourceSchema</code> used to parse the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The <code>version</code> of the <code>ResourceSchema</code> used to parse the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>The resource metadata. The <code>ResourceSchema</code> defines its content.</p>
         */
        @NameInMap("MetaData")
        public java.util.Map<String, ?> metaData;

        public static ListMyRelatedApprovalsRequestResource build(java.util.Map<String, ?> map) throws Exception {
            ListMyRelatedApprovalsRequestResource self = new ListMyRelatedApprovalsRequestResource();
            return TeaModel.build(map, self);
        }

        public ListMyRelatedApprovalsRequestResource setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListMyRelatedApprovalsRequestResource setDefVersion(String defVersion) {
            this.defVersion = defVersion;
            return this;
        }
        public String getDefVersion() {
            return this.defVersion;
        }

        public ListMyRelatedApprovalsRequestResource setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

    }

}
