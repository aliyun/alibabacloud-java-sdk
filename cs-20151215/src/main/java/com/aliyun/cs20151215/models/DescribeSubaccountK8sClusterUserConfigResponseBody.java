// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeSubaccountK8sClusterUserConfigResponseBody extends TeaModel {
    /**
     * <p>The cluster kubeconfig file. For more information about how to view the kubeconfig file content, see <a href="https://help.aliyun.com/document_detail/86494.html">Configure cluster credentials</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1\nclusters:\n- cluster:\n    server: <a href="https://114.55.xx.xx:6443%5C%5Cn">https://114.55.xx.xx:6443\\n</a>    certificate-authority-data: LS0tLS****</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The expiration date of the kubeconfig file. The value is the UTC time displayed in RFC3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2028-04-09T06:20:47Z</p>
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
