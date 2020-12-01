// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Config")
    @Validation(required = true)
    public String config;

    public static DescribeDBClusterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigResponse self = new DescribeDBClusterConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterConfigResponse setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
