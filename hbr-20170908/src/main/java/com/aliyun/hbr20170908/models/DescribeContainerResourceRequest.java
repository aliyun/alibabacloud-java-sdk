// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeContainerResourceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-0005**********hhjw</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number for paged queries. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Minimum value: 1. Maximum value: 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource ID.</p>
     * <ul>
     * <li><strong>ResourceType=PV</strong>: The persistent volume ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>a9ab843d-<strong><strong>-</strong></strong>-8e46-1d67a82128a7</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid value:</p>
     * <ul>
     * <li><strong>PV</strong>: persistent volume (PV).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PV</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeContainerResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerResourceRequest self = new DescribeContainerResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeContainerResourceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeContainerResourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeContainerResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeContainerResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
