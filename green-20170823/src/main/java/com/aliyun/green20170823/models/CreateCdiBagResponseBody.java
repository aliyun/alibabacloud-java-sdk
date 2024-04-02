// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateCdiBagResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceIds")
    public CreateCdiBagResponseBodyInstanceIds instanceIds;

    @NameInMap("Message")
    public String message;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCdiBagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdiBagResponseBody self = new CreateCdiBagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdiBagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCdiBagResponseBody setInstanceIds(CreateCdiBagResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public CreateCdiBagResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public CreateCdiBagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCdiBagResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateCdiBagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCdiBagResponseBodyInstanceIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static CreateCdiBagResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            CreateCdiBagResponseBodyInstanceIds self = new CreateCdiBagResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public CreateCdiBagResponseBodyInstanceIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
