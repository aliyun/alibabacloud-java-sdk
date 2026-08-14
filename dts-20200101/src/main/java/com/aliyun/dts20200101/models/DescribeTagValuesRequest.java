// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeTagValuesRequest extends TeaModel {
    /**
     * <p>The type of the tag key. Valid values:</p>
     * <ul>
     * <li><strong>Custom</strong>: a user-added tag key.</li>
     * <li><strong>System</strong>: a system-created tag key.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is left empty, all tag keys are returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The key of the tag.</p>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>owner</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The page number. Specifies the page to return when a tag key has multiple tag values. The value must be a positive integer that does not exceed the maximum value of the Integer data type. This parameter is typically used together with PageSize. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of tag values to return per page when a tag key has multiple tag values. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID.</p>
     * <blockquote>
     * <p>If this parameter is left empty, all tag values of the specified tag key for the current account are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtsl5o11f9029c****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type defined by the system. Set the value to <strong>ALIYUN::DTS::INSTANCE</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::DTS::INSTANCE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeTagValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValuesRequest self = new DescribeTagValuesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagValuesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeTagValuesRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeTagValuesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagValuesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagValuesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTagValuesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeTagValuesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeTagValuesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
