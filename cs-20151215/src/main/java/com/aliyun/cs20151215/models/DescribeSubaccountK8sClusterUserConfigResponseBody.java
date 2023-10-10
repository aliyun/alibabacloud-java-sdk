// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeSubaccountK8sClusterUserConfigResponseBody extends TeaModel {
    /**
     * <p>The cluster kubeconfig file. For more information about the content of the kubeconfig file, see [Configure cluster credentials](~~86494~~).</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The expiration date of the kubeconfig file. The value is the UTC time displayed in RFC3339 format.</p>
     */
    @NameInMap("expiration")
    public String expiration;

    public static DescribeSubaccountK8sClusterUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubaccountK8sClusterUserConfigResponseBody self = new DescribeSubaccountK8sClusterUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubaccountK8sClusterUserConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeSubaccountK8sClusterUserConfigResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

}
