// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyRelatedApprovalsRequest extends TeaModel {
    /**
     * <p>Filters by the requested permissions.</p>
     * <p>Note: The types of permissions that can be requested vary based on the resource level and are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.isValidLeaf, accessTypeRestrictions, and authMethodAccessTypes.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
     */
    @NameInMap("AccessTypes")
    public java.util.List<String> accessTypes;

    /**
     * <p>Filters by resource type.</p>
     * <p>Note: The resource types supported for application are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("DefSchema")
    public String defSchema;

    /**
     * <p>The end time of the application. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1779724799999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Filters by authorization principal. </p>
     * <p>Note: The authorization principal types supported by the system are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.authPrincipal.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
     */
    @NameInMap("Grantee")
    public ListMyRelatedApprovalsRequestGrantee grantee;

    /**
     * <p>The pagination cursor.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJpZCI6MTIzfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Performs exact or generalized filtering based on resources. The resource description is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
     */
    @NameInMap("Resource")
    public ListMyRelatedApprovalsRequestResource resource;

    /**
     * <p>Filters by least privilege resource type.</p>
     * <p>Note: The least privilege resource types are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources[*].isValidLeaf being true.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;table&quot;, &quot;column&quot;]</p>
     */
    @NameInMap("ResourceType")
    public java.util.List<String> resourceType;

    /**
     * <p>The start time of the application. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1771948800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Filters by approval status. Valid values:</p>
     * <ul>
     * <li>WaitApproval: Pending approval.</li>
     * <li>Confirmed: Pending authorization.</li>
     * <li>RejectApproval: Rejected.</li>
     * <li>AuthorizeSucceed: Authorized.</li>
     * <li>AuthorizeFailed: Authorization failed.</li>
     * <li>Deleted: Deleted.</li>
     * <li>Canceled: Withdrawn.</li>
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
         * <p>The ID of the authorization principal. The meaning of the ID varies based on the principal type:</p>
         * <ul>
         * <li><code>RamUser</code>: DataWorks user ID.</li>
         * <li><code>RamRole</code>: DataWorks user ID that starts with &quot;ROLE_&quot;.</li>
         * <li><code>DataworksTenantMember</code>: DataWorks user ID.</li>
         * <li><code>DataworksTenantRole</code>: DataWorks tenant role code.</li>
         * <li><code>DataworksProjectRole</code>: DataWorks workspace role code.</li>
         * <li><code>DataworksProjectMember</code>: DataWorks user ID.</li>
         * <li><code>DlfRole</code>: DLF Next role name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROLE_3133343434</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The type of the authorization principal. Valid values:</p>
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
         * <p>The resource type.</p>
         * <p>Note: The resource types supported for application are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
         * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
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
         * <p>The resource metadata.</p>
         * <p>Note: The metadata is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources. A valid resource declaration must include the full-path metadata declaration from level 0 to the validLeaf level.</p>
         * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;workspace&quot;: &quot;449056&quot;, &quot;project&quot;: &quot;sync_destination&quot;}</p>
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
