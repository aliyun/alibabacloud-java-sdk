// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterLogsResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("cluster_log")
    @Validation(required = true)
    public String clusterLog;

    @NameInMap("log_level")
    @Validation(required = true)
    public String logLevel;

    @NameInMap("created")
    @Validation(required = true)
    public String created;

    public static DescribeClusterLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterLogsResponseBody self = new DescribeClusterLogsResponseBody();
        return TeaModel.build(map, self);
    }

}
