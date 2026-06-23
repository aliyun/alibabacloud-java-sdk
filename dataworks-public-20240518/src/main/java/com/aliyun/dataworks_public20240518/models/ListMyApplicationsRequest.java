// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyApplicationsRequest extends TeaModel {
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
    public ListMyApplicationsRequestResource resource;

    /**
     * <p>The name of the leaf node that specifies the resource type. You can specify multiple resource types. Note that different leaf node names can map to the same business logic.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public java.util.List<String> resourceType;

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
    public java.util.List<String> statuses;

    public static ListMyApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyApplicationsRequest self = new ListMyApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListMyApplicationsRequest setDefSchema(String defSchema) {
        this.defSchema = defSchema;
        return this;
    }
    public String getDefSchema() {
        return this.defSchema;
    }

    public ListMyApplicationsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListMyApplicationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMyApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMyApplicationsRequest setResource(ListMyApplicationsRequestResource resource) {
        this.resource = resource;
        return this;
    }
    public ListMyApplicationsRequestResource getResource() {
        return this.resource;
    }

    public ListMyApplicationsRequest setResourceType(java.util.List<String> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.List<String> getResourceType() {
        return this.resourceType;
    }

    public ListMyApplicationsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListMyApplicationsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static class ListMyApplicationsRequestResource extends TeaModel {
        /**
         * <p>The name of the resource schema (<code>ResourceSchema.name</code>) required for resource parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The version of the resource schema (<code>ResourceSchema.version</code>) required for resource parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>The resource metadata. The content is constrained by the <code>ResourceSchema</code>.</p>
         */
        @NameInMap("MetaData")
        public java.util.Map<String, ?> metaData;

        public static ListMyApplicationsRequestResource build(java.util.Map<String, ?> map) throws Exception {
            ListMyApplicationsRequestResource self = new ListMyApplicationsRequestResource();
            return TeaModel.build(map, self);
        }

        public ListMyApplicationsRequestResource setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListMyApplicationsRequestResource setDefVersion(String defVersion) {
            this.defVersion = defVersion;
            return this;
        }
        public String getDefVersion() {
            return this.defVersion;
        }

        public ListMyApplicationsRequestResource setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

    }

}
