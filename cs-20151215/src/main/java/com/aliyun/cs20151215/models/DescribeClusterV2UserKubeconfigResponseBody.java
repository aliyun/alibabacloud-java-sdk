// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterV2UserKubeconfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DescribeClusterV2UserKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterV2UserKubeconfigResponseBody self = new DescribeClusterV2UserKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

}
