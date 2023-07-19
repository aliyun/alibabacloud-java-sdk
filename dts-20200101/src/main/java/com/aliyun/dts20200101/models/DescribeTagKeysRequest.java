// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeTagKeysRequest extends TeaModel {
    /**
     * <p>The type of the tag. Valid values:</p>
     * <br>
     * <p>*   **Custom**: The tag is added by a user.</p>
     * <p>*   **System**: The tag is added by the system.</p>
     * <br>
     * <p>>  By default, if the parameter is left empty, custom tags and system tags are returned.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1. This parameter is used together with PageSize.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of tags to return on each page if the DTS instance has multiple tags. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking instance. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Set the value to **ALIYUN::DTS::INSTANCE**.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeTagKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeysRequest self = new DescribeTagKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeysRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeTagKeysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagKeysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTagKeysRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeTagKeysRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
