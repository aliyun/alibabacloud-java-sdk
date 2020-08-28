// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigResponseBody extends TeaModel {
    @NameInMap("config")
    @Validation(required = true)
    public String config;

    public static DescribeClusterUserKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterUserKubeconfigResponseBody self = new DescribeClusterUserKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

}
