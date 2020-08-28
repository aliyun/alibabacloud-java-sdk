// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaResponseBody extends TeaModel {
    @NameInMap("cluster_quota")
    @Validation(required = true)
    public Integer clusterQuota;

    @NameInMap("node_quota")
    @Validation(required = true)
    public Integer nodeQuota;

    @NameInMap("ask_cluster_quota")
    @Validation(required = true)
    public Integer askClusterQuota;

    @NameInMap("amk_cluster_quota")
    @Validation(required = true)
    public Integer amkClusterQuota;

    public static DescribeUserQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserQuotaResponseBody self = new DescribeUserQuotaResponseBody();
        return TeaModel.build(map, self);
    }

}
