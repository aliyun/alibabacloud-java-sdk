// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterKubeconfigRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    public static DescribeHubClusterKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterKubeconfigRequest self = new DescribeHubClusterKubeconfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterKubeconfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeHubClusterKubeconfigRequest setPrivateIpAddress(Boolean privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

}
