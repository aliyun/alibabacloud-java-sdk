// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyRelatedApprovalsShrinkRequest extends TeaModel {
    /**
     * <p>Filter by requested permissions.</p>
     * <p>Note: Different resource levels support different application permission types, all constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.isValidLeaf, accessTypeRestrictions, and authMethodAccessTypes.</p>
     * <p>Reference: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema International Site Documentation</a></p>
     */
    @NameInMap("AccessTypes")
    public String accessTypesShrink;

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
    public String granteeShrink;

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
    public String resourceShrink;

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
    public String resourceTypeShrink;

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
    public String statusesShrink;

    public static ListMyRelatedApprovalsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyRelatedApprovalsShrinkRequest self = new ListMyRelatedApprovalsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMyRelatedApprovalsShrinkRequest setAccessTypesShrink(String accessTypesShrink) {
        this.accessTypesShrink = accessTypesShrink;
        return this;
    }
    public String getAccessTypesShrink() {
        return this.accessTypesShrink;
    }

    public ListMyRelatedApprovalsShrinkRequest setDefSchema(String defSchema) {
        this.defSchema = defSchema;
        return this;
    }
    public String getDefSchema() {
        return this.defSchema;
    }

    public ListMyRelatedApprovalsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListMyRelatedApprovalsShrinkRequest setGranteeShrink(String granteeShrink) {
        this.granteeShrink = granteeShrink;
        return this;
    }
    public String getGranteeShrink() {
        return this.granteeShrink;
    }

    public ListMyRelatedApprovalsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMyRelatedApprovalsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMyRelatedApprovalsShrinkRequest setResourceShrink(String resourceShrink) {
        this.resourceShrink = resourceShrink;
        return this;
    }
    public String getResourceShrink() {
        return this.resourceShrink;
    }

    public ListMyRelatedApprovalsShrinkRequest setResourceTypeShrink(String resourceTypeShrink) {
        this.resourceTypeShrink = resourceTypeShrink;
        return this;
    }
    public String getResourceTypeShrink() {
        return this.resourceTypeShrink;
    }

    public ListMyRelatedApprovalsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListMyRelatedApprovalsShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

}
