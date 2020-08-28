// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterV2UserKubeconfigRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DescribeClusterV2UserKubeconfigQuery query;

    public static DescribeClusterV2UserKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterV2UserKubeconfigRequest self = new DescribeClusterV2UserKubeconfigRequest();
        return TeaModel.build(map, self);
    }

}
