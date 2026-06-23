// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyApplicationsShrinkRequest extends TeaModel {
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
     * <p>The end time of the application, specified as a Unix timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1779724799999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>A token that you can use in a subsequent request to retrieve the next page of results.</p>
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
     * <p>The search criteria for the resource.</p>
     */
    @NameInMap("Resource")
    public String resourceShrink;

    /**
     * <p>The name of the leaf node that specifies the resource type. You can specify multiple resource types. Note that different leaf node names can map to the same business logic.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceTypeShrink;

    /**
     * <p>The start time of the application, specified as a Unix timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1771948800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The approval statuses for filtering. Valid values:</p>
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
     * <li><p><code>Deleted</code>: The application was deleted.</p>
     * </li>
     * <li><p><code>Canceled</code>: The application was canceled.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Statuses")
    public String statusesShrink;

    public static ListMyApplicationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyApplicationsShrinkRequest self = new ListMyApplicationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMyApplicationsShrinkRequest setDefSchema(String defSchema) {
        this.defSchema = defSchema;
        return this;
    }
    public String getDefSchema() {
        return this.defSchema;
    }

    public ListMyApplicationsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListMyApplicationsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMyApplicationsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMyApplicationsShrinkRequest setResourceShrink(String resourceShrink) {
        this.resourceShrink = resourceShrink;
        return this;
    }
    public String getResourceShrink() {
        return this.resourceShrink;
    }

    public ListMyApplicationsShrinkRequest setResourceTypeShrink(String resourceTypeShrink) {
        this.resourceTypeShrink = resourceTypeShrink;
        return this;
    }
    public String getResourceTypeShrink() {
        return this.resourceTypeShrink;
    }

    public ListMyApplicationsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListMyApplicationsShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

}
