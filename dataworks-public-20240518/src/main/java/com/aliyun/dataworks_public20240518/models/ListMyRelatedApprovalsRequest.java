// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyRelatedApprovalsRequest extends TeaModel {
    /**
     * <p>Filter by requested permissions.</p>
     * <p>Note: Different resource levels support different application permission types, all constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.isValidLeaf, accessTypeRestrictions, and authMethodAccessTypes.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema International Site Documentation</a></p>
     */
    @NameInMap("AccessTypes")
    public java.util.List<String> accessTypes;

    /**
     * <p>Filter by resource type.</p>
     * <p>Note: The resource types supported by the system for applications are constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema International Site Documentation</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("DefSchema")
    public String defSchema;

    /**
     * <p>Application time end (millisecond timestamp)</p>
     * 
     * <strong>example:</strong>
     * <p>1779724799999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Filter by authorization principal.</p>
     * <p>Note: The authorization principal types supported by the system are constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.authPrincipal.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema International Site Documentation</a></p>
     */
    @NameInMap("Grantee")
    public ListMyRelatedApprovalsRequestGrantee grantee;

    /**
     * <p>Pagination cursor</p>
     * 
     * <strong>example:</strong>
     * <p>eyJpZCI6MTIzfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Page size (default 10, maximum 200)</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filter by resource with exact/generalized matching. The resource description is constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema International Site Documentation</a></p>
     */
    @NameInMap("Resource")
    public ListMyRelatedApprovalsRequestResource resource;

    /**
     * <p>Filter by minimum permission resource type.</p>
     * <p>Note: The minimum permission resource type is constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources[*].isValidLeaf being true.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema International Site Documentation</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;table&quot;, &quot;column&quot;]</p>
     */
    @NameInMap("ResourceType")
    public java.util.List<String> resourceType;

    /**
     * <p>Application time start (millisecond timestamp)</p>
     * 
     * <strong>example:</strong>
     * <p>1771948800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Filter by approval status. Enum values:</p>
     * <ul>
     * <li>WaitApproval: Pending approval</li>
     * <li>Confirmed: Pending authorization</li>
     * <li>RejectApproval: Approval rejected</li>
     * <li>AuthorizeSucceed: Authorization succeeded</li>
     * <li>AuthorizeFailed: Authorization failed</li>
     * <li>Deleted: Deleted</li>
     * <li>Canceled: Withdrawn</li>
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
         * <p>Authorization principal ID:</p>
         * <ul>
         * <li><code>RamUser</code>: Dataworks UserId</li>
         * <li><code>RamRole</code>: Dataworks UserId prefixed with &quot;ROLE_&quot;</li>
         * <li><code>DataworksTenantMember</code>: Dataworks UserId</li>
         * <li><code>DataworksTenantRole</code>: Dataworks tenant roleCode</li>
         * <li><code>DataworksProjectRole</code>: Dataworks workspace roleCode</li>
         * <li><code>DataworksProjectMember</code>: Dataworks UserId</li>
         * <li><code>DlfRole</code>: DlfNext role name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROLE_3133343434</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>Authorization principal type:</p>
         * <ul>
         * <li><code>RamRole</code></li>
         * <li><code>RamUser</code></li>
         * <li><code>DataworksTenantMember</code></li>
         * <li><code>DataworksTenantRole</code></li>
         * <li><code>DataworksProjectMember</code></li>
         * <li><code>DataworksProjectRole</code></li>
         * <li><code>DlfRole</code></li>
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
         * <p>Resource type.</p>
         * <p>Note: The resource types supported by the system for applications are constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
         * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema International Site Documentation</a></p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The resource parsing version is constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.version.</p>
         * <p><a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema International Site Documentation</a></p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>Resource metadata.</p>
         * <p>Note: The metadata is constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources. A valid resource declaration must include the full-path metadata declaration from level 0 to validLeaf layer.</p>
         * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema International Site Documentation</a></p>
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
