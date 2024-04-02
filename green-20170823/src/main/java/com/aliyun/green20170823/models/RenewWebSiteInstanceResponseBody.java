// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RenewWebSiteInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceIds")
    public RenewWebSiteInstanceResponseBodyInstanceIds instanceIds;

    @NameInMap("Message")
    public String message;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static RenewWebSiteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewWebSiteInstanceResponseBody self = new RenewWebSiteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewWebSiteInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewWebSiteInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewWebSiteInstanceResponseBody setInstanceIds(RenewWebSiteInstanceResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public RenewWebSiteInstanceResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public RenewWebSiteInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenewWebSiteInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewWebSiteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RenewWebSiteInstanceResponseBodyInstanceIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static RenewWebSiteInstanceResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            RenewWebSiteInstanceResponseBodyInstanceIds self = new RenewWebSiteInstanceResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public RenewWebSiteInstanceResponseBodyInstanceIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
