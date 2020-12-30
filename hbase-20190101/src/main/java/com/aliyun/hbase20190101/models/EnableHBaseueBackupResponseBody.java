// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EnableHBaseueBackupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("OrderId")
    public String orderId;

    public static EnableHBaseueBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableHBaseueBackupResponseBody self = new EnableHBaseueBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableHBaseueBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableHBaseueBackupResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public EnableHBaseueBackupResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
