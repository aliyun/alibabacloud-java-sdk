// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to obtain the kubeconfig file that is used to connect to the cluster over the internal network. You can obtain the terminal ID by calling one of the following operations:</p>
     * <ul>
     * <li><code>true</code>: obtains the kubeconfig file that is used to connect to the master instance over the internal network.</li>
     * <li><code>false</code>: obtains the kubeconfig file that is used to connect to the master instance over the Internet.</li>
     * </ul>
     * <p>Default value: <code>false</code></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    /**
     * <p>The validity period of the temporary kubeconfig file. Unit: minutes. Valid values: 15 to 4320 (3 days).</p>
     * <p>**</p>
     * <p><strong>Usage notes</strong> If you do not specify this parameter, the system specifies a longer validity period. The validity period is returned in the <code>expiration</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
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
