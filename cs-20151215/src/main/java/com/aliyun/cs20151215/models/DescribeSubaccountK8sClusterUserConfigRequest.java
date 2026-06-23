// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeSubaccountK8sClusterUserConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to obtain the internal network connection configuration. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Obtains only the KubeConfig credentials for internal network connections.</li>
     * <li><code>false</code>: Obtains only the KubeConfig credentials for public network connections.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    /**
     * <p>The validity period of the temporary KubeConfig. Unit: minutes.</p>
     * <p>Valid values: [15, 4320], which is up to 3 days.</p>
     * <blockquote>
     * <p>If this parameter is not set, the system automatically determines a longer validity period. The specific expiration time is indicated by the value of the expiration field in the response.</p>
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
