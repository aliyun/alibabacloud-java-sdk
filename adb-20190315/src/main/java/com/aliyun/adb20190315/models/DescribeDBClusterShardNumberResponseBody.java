// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterShardNumberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CBE843D8-964D-5EA3-9D31-822125611B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ShardNumber")
    public Integer shardNumber;

    public static DescribeDBClusterShardNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterShardNumberResponseBody self = new DescribeDBClusterShardNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterShardNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterShardNumberResponseBody setShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
        return this;
    }
    public Integer getShardNumber() {
        return this.shardNumber;
    }

}
