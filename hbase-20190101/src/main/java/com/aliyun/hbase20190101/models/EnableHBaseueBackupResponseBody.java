// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EnableHBaseueBackupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>bds-m5e54q06ceyhxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>1449xxx</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>15272D5D-46E8-4400-9CC8-A7E7B589F575</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableHBaseueBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableHBaseueBackupResponseBody self = new EnableHBaseueBackupResponseBody();
        return TeaModel.build(map, self);
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

    public EnableHBaseueBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
