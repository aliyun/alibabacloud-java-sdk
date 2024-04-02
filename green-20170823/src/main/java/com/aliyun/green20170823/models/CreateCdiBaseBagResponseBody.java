// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateCdiBaseBagResponseBody extends TeaModel {
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

    public static CreateCdiBaseBagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdiBaseBagResponseBody self = new CreateCdiBaseBagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdiBaseBagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCdiBaseBagResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCdiBaseBagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCdiBaseBagResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateCdiBaseBagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
