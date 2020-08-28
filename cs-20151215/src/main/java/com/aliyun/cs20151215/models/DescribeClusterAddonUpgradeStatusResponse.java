// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonUpgradeStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterAddonUpgradeStatusResponseBody body;

    public static DescribeClusterAddonUpgradeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonUpgradeStatusResponse self = new DescribeClusterAddonUpgradeStatusResponse();
        return TeaModel.build(map, self);
    }

}
