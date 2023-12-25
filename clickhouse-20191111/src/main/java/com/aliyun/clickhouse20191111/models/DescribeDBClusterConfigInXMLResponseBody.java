// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigInXMLResponseBody extends TeaModel {
    /**
     * <p>The values of the configuration parameters.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterConfigInXMLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigInXMLResponseBody self = new DescribeDBClusterConfigInXMLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigInXMLResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeDBClusterConfigInXMLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
