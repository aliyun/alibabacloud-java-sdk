// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeTagValuesRequest extends TeaModel {
    /**
     * <p>The type of the tag key. Valid values:</p>
     * <br>
     * <p>*   **Custom**: The tag key is created by users.</p>
     * <p>*   **System**: The tag key is created by the system.</p>
     * <br>
     * <p>>  By default, if the parameter is left empty, both custom tag keys and system tag keys are returned.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The tag key.</p>
     * <br>
     * <p>>  This parameter is required.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The page number of the start page to return for a tag key that has multiple values. The valid value ranges from 1 to the maximum value of the INTEGER data type. This parameter is often used with the PageSize parameter. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of tag values to return each time for a tag key that has multiple values. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the DTS instance. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking instance. You can call the [DescribeDtsJobs](https://help.aliyun.com/document_detail/209702.html) operation to query the instance ID.</p>
     * <br>
     * <p>>  If this parameter is left empty, the values of all tag keys of the current user are returned.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Set the value to **ALIYUN::DTS::INSTANCE**.</p>
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
