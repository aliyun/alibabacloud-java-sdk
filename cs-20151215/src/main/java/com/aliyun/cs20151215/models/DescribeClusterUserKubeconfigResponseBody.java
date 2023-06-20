// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigResponseBody extends TeaModel {
    /**
     * <p>The content of the kubeconfig file. For more information about the content of the kubeconfig file, see [Configure cluster credentials](~~86494~~).</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The expiration time of the kubeconfig file. The value is the UTC time displayed in RFC3339 format.</p>
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
