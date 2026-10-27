// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeSubaccountK8sClusterUserConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether the internal network connection configuration is obtained. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Obtains only the KubeConfig credentials for the internal network connection.</li>
     * <li><code>false</code>: Obtains only the KubeConfig credentials for the public network connection.</li>
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
     * <p>Valid values: 15 to 4320, which indicates a maximum of 3 days.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically determines a longer validity period. The specific expiration time is determined by the value of the returned expiration field.</p>
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
