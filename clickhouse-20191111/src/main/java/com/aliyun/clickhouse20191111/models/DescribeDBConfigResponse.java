// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Config")
    @Validation(required = true)
    public String config;

    public static DescribeDBConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBConfigResponse self = new DescribeDBConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBConfigResponse setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
