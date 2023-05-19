// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ModifyInstanceResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceResponseBody self = new ModifyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyInstanceResponseBody setData(ModifyInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyInstanceResponseBodyData getData() {
        return this.data;
    }

    public ModifyInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the host.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The ID of the order that was created.</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static ModifyInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceResponseBodyData self = new ModifyInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ModifyInstanceResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
