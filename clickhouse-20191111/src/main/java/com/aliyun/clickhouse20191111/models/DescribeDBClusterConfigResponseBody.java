// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigResponseBody extends TeaModel {
    /**
     * <p>The information about the parameter settings of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;name&quot;: &quot;keep_alive_timeout&quot;, &quot;defaultValue&quot;: 300, &quot;currentValue&quot;: 300, &quot;restart&quot;: true, &quot;valueRange&quot;: &quot;&gt;0&quot;, &quot;desc&quot;: &quot;The number of seconds that ClickHouse waits for incoming requests before closing the connection.&quot; }, ... ,{ &quot;name&quot;: &quot;max_partition_size_to_drop&quot;, &quot;defaultValue&quot;: 0, &quot;currentValue&quot;: 0, &quot;restart&quot;: true, &quot;valueRange&quot;: &quot;&gt;=0&quot;, &quot;desc&quot;: &quot;If the size of a MergeTree partition exceeds max_partition_size_to_drop (in bytes), you can’t delete it using a DROP query.&quot; } ]</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigResponseBody self = new DescribeDBClusterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeDBClusterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
