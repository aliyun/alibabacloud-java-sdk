// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigResponseBody extends TeaModel {
    /**
     * <p>The kubeconfig file of the cluster. For more information about the content of the kubeconfig file, see <a href="https://help.aliyun.com/document_detail/86494.html">Configure cluster credentials</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1****</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The validity period of the kubeconfig file. The value is the UTC time displayed in RFC3339 format.</p>
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
