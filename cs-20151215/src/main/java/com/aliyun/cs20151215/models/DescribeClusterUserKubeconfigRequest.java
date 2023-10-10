// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to obtain the kubeconfig file that is used to connect to the cluster over the internal network. Valid values:</p>
     * <br>
     * <p>*   `true`: obtains the kubeconfig file that is used to connect to the master instance over the internal network.</p>
     * <p>*   `false`: obtains the kubeconfig file that is used to connect to the master instance over the Internet.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    /**
     * <p>The validity period of a temporary kubeconfig file. Unit: minutes. Valid values: 15 to 4320 (3 days).</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system specifies a longer validity period. The validity period is returned in the `expiration` parameter.</p>
     */
    @NameInMap("TemporaryDurationMinutes")
    public Long temporaryDurationMinutes;

    public static DescribeClusterUserKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterUserKubeconfigRequest self = new DescribeClusterUserKubeconfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterUserKubeconfigRequest setPrivateIpAddress(Boolean privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeClusterUserKubeconfigRequest setTemporaryDurationMinutes(Long temporaryDurationMinutes) {
        this.temporaryDurationMinutes = temporaryDurationMinutes;
        return this;
    }
    public Long getTemporaryDurationMinutes() {
        return this.temporaryDurationMinutes;
    }

}
