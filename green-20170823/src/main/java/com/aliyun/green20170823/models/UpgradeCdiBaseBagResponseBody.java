// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpgradeCdiBaseBagResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Message")
    public String message;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeCdiBaseBagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeCdiBaseBagResponseBody self = new UpgradeCdiBaseBagResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeCdiBaseBagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeCdiBaseBagResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeCdiBaseBagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeCdiBaseBagResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpgradeCdiBaseBagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
