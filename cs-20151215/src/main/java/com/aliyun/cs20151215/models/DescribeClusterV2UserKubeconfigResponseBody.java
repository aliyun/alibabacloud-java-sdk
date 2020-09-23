// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterV2UserKubeconfigResponseBody extends TeaModel {
    // kubeconfig内容。
    @NameInMap("config")
    public String config;

    public static DescribeClusterV2UserKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterV2UserKubeconfigResponseBody self = new DescribeClusterV2UserKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterV2UserKubeconfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
