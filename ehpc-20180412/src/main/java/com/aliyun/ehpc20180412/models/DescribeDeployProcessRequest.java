// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeDeployProcessRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Role")
    public String role;

    public static DescribeDeployProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployProcessRequest self = new DescribeDeployProcessRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeployProcessRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeDeployProcessRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeDeployProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeployProcessRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
