// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DeploymentSetIds")
    public String deploymentSetIds;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Strategy")
    public String strategy;

    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("Domain")
    public String domain;

    public static DescribeDeploymentSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetsRequest self = new DescribeDeploymentSetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeploymentSetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeploymentSetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeploymentSetsRequest setDeploymentSetIds(String deploymentSetIds) {
        this.deploymentSetIds = deploymentSetIds;
        return this;
    }
    public String getDeploymentSetIds() {
        return this.deploymentSetIds;
    }

    public DescribeDeploymentSetsRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeDeploymentSetsRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public DescribeDeploymentSetsRequest setDeploymentSetName(String deploymentSetName) {
        this.deploymentSetName = deploymentSetName;
        return this;
    }
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    public DescribeDeploymentSetsRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public DescribeDeploymentSetsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
