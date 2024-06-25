// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeSubaccountK8sClusterUserConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to obtain the kubeconfig file used to connect to the cluster over the internal network. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Obtain the kubeconfig file used to connect to the cluster over the internal network.</li>
     * <li><code>false</code>: Obtain the kubeconfig file used to connect to the cluster over the Internet.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    /**
     * <p>The validity period of the temporary kubeconfig file. Unit: minutes.</p>
     * <p>Valid values: 15 to 4320 (three days).</p>
     * <blockquote>
     * <p>If you leave this parameter empty, the system sets a longer validity period and returns the value in the expiration parameter of the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TemporaryDurationMinutes")
    public Long temporaryDurationMinutes;

    public static DescribeSubaccountK8sClusterUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubaccountK8sClusterUserConfigRequest self = new DescribeSubaccountK8sClusterUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubaccountK8sClusterUserConfigRequest setPrivateIpAddress(Boolean privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeSubaccountK8sClusterUserConfigRequest setTemporaryDurationMinutes(Long temporaryDurationMinutes) {
        this.temporaryDurationMinutes = temporaryDurationMinutes;
        return this;
    }
    public Long getTemporaryDurationMinutes() {
        return this.temporaryDurationMinutes;
    }

}
