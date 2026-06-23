// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigResponseBody extends TeaModel {
    /**
     * <p>The KubeConfig of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1\nclusters:\n- cluster:\n    server: <a href="https://114.55.xx.xx:6443%5C%5Cn">https://114.55.xx.xx:6443\\n</a>    certificate-authority-data: LS0tLS****</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The expiration time of the KubeConfig. Format: UTC time in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-10T09:56:17Z</p>
     */
    @NameInMap("expiration")
    public String expiration;

    public static DescribeClusterUserKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterUserKubeconfigResponseBody self = new DescribeClusterUserKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterUserKubeconfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeClusterUserKubeconfigResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

}
