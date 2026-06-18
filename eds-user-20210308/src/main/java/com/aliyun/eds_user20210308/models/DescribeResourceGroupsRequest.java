// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeResourceGroupsRequest extends TeaModel {
    /**
     * <p>A list of Aliyun resource group IDs.</p>
     */
    @NameInMap("AliyunResourceGroupIds")
    public java.util.List<String> aliyunResourceGroupIds;

    /**
     * <p>The business channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NeedContainResourceGroupWithOfficeSite")
    public Long needContainResourceGroupWithOfficeSite;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <blockquote>
     * <p>The cloud platform.</p>
     * <ul>
     * <li>For Elastic Desktop Service (EDS) Enterprise Edition, this parameter must be set to AliyunConsole.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AliyunConsole</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceClassification")
    public String resourceClassification;

    /**
     * <p>A list of resource group IDs.</p>
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>部门A资源组</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static DescribeResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceGroupsRequest self = new DescribeResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceGroupsRequest setAliyunResourceGroupIds(java.util.List<String> aliyunResourceGroupIds) {
        this.aliyunResourceGroupIds = aliyunResourceGroupIds;
        return this;
    }
    public java.util.List<String> getAliyunResourceGroupIds() {
        return this.aliyunResourceGroupIds;
    }

    public DescribeResourceGroupsRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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

    public DescribeResourceGroupsRequest setResourceClassification(String resourceClassification) {
        this.resourceClassification = resourceClassification;
        return this;
    }
    public String getResourceClassification() {
        return this.resourceClassification;
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
