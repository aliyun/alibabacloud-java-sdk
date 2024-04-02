// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateWebSiteInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceIds")
    public CreateWebSiteInstanceResponseBodyInstanceIds instanceIds;

    @NameInMap("Message")
    public String message;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateWebSiteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWebSiteInstanceResponseBody self = new CreateWebSiteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWebSiteInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWebSiteInstanceResponseBody setInstanceIds(CreateWebSiteInstanceResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public CreateWebSiteInstanceResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public CreateWebSiteInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWebSiteInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateWebSiteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateWebSiteInstanceResponseBodyInstanceIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static CreateWebSiteInstanceResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            CreateWebSiteInstanceResponseBodyInstanceIds self = new CreateWebSiteInstanceResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public CreateWebSiteInstanceResponseBodyInstanceIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
