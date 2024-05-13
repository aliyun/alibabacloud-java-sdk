// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterKubeconfigRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to obtain the kubeconfig file that is used to connect to the cluster over the internal network. Valid values:</p>
     * <br>
     * <p>*   `true`: obtains the kubeconfig file that is used to connect to the master instance over the internal network.</p>
     * <p>*   `false`: obtains the kubeconfig file that is used to connect to the master instance over the Internet.</p>
     * <br>
     * <p>Default value: `false`</p>
     */
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
