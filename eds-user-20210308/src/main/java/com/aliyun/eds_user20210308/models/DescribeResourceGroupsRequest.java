// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeResourceGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NeedContainResourceGroupWithOfficeSite")
    public Long needContainResourceGroupWithOfficeSite;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AliyunConsole</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static DescribeResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceGroupsRequest self = new DescribeResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceGroupsRequest setNeedContainResourceGroupWithOfficeSite(Long needContainResourceGroupWithOfficeSite) {
        this.needContainResourceGroupWithOfficeSite = needContainResourceGroupWithOfficeSite;
        return this;
    }
    public Long getNeedContainResourceGroupWithOfficeSite() {
        return this.needContainResourceGroupWithOfficeSite;
    }

    public DescribeResourceGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResourceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResourceGroupsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DescribeResourceGroupsRequest setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public DescribeResourceGroupsRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
