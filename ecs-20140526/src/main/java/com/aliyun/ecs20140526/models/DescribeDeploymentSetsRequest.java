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

}
