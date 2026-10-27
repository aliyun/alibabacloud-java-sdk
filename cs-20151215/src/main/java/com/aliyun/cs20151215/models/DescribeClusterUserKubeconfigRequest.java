// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to retrieve the internal network connection configuration. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Retrieves only the internal network connection credentials.</li>
     * <li><code>false</code>: Retrieves only the public network connection credentials.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    /**
     * <p>The validity period of the temporary kubeconfig file, in minutes. Valid values: 15 (15 minutes) to 4320 (3 days).</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically determines a longer validity period. You can determine the specific expiration time based on the value of the <code>expiration</code> field in the response.</p>
     * </blockquote>
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
