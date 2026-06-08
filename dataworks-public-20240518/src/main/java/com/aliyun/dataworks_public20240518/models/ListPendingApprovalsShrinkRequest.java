// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPendingApprovalsShrinkRequest extends TeaModel {
    @NameInMap("AccessTypes")
    public String accessTypesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("DefSchema")
    public String defSchema;

    /**
     * <strong>example:</strong>
     * <p>1779724799999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Grantee")
    public String granteeShrink;

    /**
     * <strong>example:</strong>
     * <p>eyJpZCI6MTIzfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Resource")
    public String resourceShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;table&quot;, &quot;column&quot;]</p>
     */
    @NameInMap("ResourceType")
    public String resourceTypeShrink;

    /**
     * <strong>example:</strong>
     * <p>1771948800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListPendingApprovalsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPendingApprovalsShrinkRequest self = new ListPendingApprovalsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPendingApprovalsShrinkRequest setAccessTypesShrink(String accessTypesShrink) {
        this.accessTypesShrink = accessTypesShrink;
        return this;
    }
    public String getAccessTypesShrink() {
        return this.accessTypesShrink;
    }

    public ListPendingApprovalsShrinkRequest setDefSchema(String defSchema) {
        this.defSchema = defSchema;
        return this;
    }
    public String getDefSchema() {
        return this.defSchema;
    }

    public ListPendingApprovalsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListPendingApprovalsShrinkRequest setGranteeShrink(String granteeShrink) {
        this.granteeShrink = granteeShrink;
        return this;
    }
    public String getGranteeShrink() {
        return this.granteeShrink;
    }

    public ListPendingApprovalsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPendingApprovalsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPendingApprovalsShrinkRequest setResourceShrink(String resourceShrink) {
        this.resourceShrink = resourceShrink;
        return this;
    }
    public String getResourceShrink() {
        return this.resourceShrink;
    }

    public ListPendingApprovalsShrinkRequest setResourceTypeShrink(String resourceTypeShrink) {
        this.resourceTypeShrink = resourceTypeShrink;
        return this;
    }
    public String getResourceTypeShrink() {
        return this.resourceTypeShrink;
    }

    public ListPendingApprovalsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
