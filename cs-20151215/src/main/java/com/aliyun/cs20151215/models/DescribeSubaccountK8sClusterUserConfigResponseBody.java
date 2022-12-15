// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeSubaccountK8sClusterUserConfigResponseBody extends TeaModel {
    @NameInMap("config")
    public String config;

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
