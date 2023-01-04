// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterKubeconfigRequest extends TeaModel {
    // The ID of the master instance.
    @NameInMap("ClusterId")
    public String clusterId;

    // Specifies whether to obtain the credential that is used to connect to the master instance over the internal network. Valid values: - `true`: obtains only the credential that is used to access the master instance over the internal network. - `false`: obtains only the credential that is used to access the master instance over the Internet. Default value: `false`.
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
