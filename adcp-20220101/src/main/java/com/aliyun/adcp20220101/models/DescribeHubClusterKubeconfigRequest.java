// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterKubeconfigRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c102fe5f1ee5d4c87a68121a77d8b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to obtain the kubeconfig file that is used to connect to the cluster over the internal network. Valid values:</p>
     * <ul>
     * <li><code>true</code>: obtains the kubeconfig file that is used to connect to the master instance over the internal network.</li>
     * <li><code>false</code>: obtains the kubeconfig file that is used to connect to the master instance over the Internet.</li>
     * </ul>
     * <p>Default value: <code>false</code></p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
