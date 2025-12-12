// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ElectZookeeperLeaderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7D3ECB0E-98CA-5E08-A9CA-F70C5A1E9BDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ElectZookeeperLeaderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ElectZookeeperLeaderResponseBody self = new ElectZookeeperLeaderResponseBody();
        return TeaModel.build(map, self);
    }

    public ElectZookeeperLeaderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
