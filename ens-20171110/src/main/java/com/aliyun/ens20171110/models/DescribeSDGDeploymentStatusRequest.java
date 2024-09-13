// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGDeploymentStatusRequest extends TeaModel {
    @NameInMap("DeploymentType")
    public String deploymentType;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The ID of the SDG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    @NameInMap("Status")
    public String status;

    public static DescribeSDGDeploymentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGDeploymentStatusRequest self = new DescribeSDGDeploymentStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDGDeploymentStatusRequest setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public DescribeSDGDeploymentStatusRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeSDGDeploymentStatusRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSDGDeploymentStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSDGDeploymentStatusRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public DescribeSDGDeploymentStatusRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

    public DescribeSDGDeploymentStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
