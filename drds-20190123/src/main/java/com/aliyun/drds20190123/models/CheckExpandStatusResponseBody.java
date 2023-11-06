// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckExpandStatusResponseBody extends TeaModel {
    /**
     * <p>The result of the verification.</p>
     */
    @NameInMap("Data")
    public CheckExpandStatusResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckExpandStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckExpandStatusResponseBody self = new CheckExpandStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckExpandStatusResponseBody setData(CheckExpandStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckExpandStatusResponseBodyData getData() {
        return this.data;
    }

    public CheckExpandStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckExpandStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckExpandStatusResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether scale-out operations can be performed on the database.</p>
         */
        @NameInMap("IsActive")
        public Boolean isActive;

        /**
         * <p>The additional information.</p>
         */
        @NameInMap("Msg")
        public String msg;

        public static CheckExpandStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckExpandStatusResponseBodyData self = new CheckExpandStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckExpandStatusResponseBodyData setIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Boolean getIsActive() {
            return this.isActive;
        }

        public CheckExpandStatusResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

    }

}
