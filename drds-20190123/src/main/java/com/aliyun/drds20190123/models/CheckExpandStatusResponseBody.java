// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckExpandStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CheckExpandStatusResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    public static CheckExpandStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckExpandStatusResponseBody self = new CheckExpandStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckExpandStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckExpandStatusResponseBody setData(CheckExpandStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckExpandStatusResponseBodyData getData() {
        return this.data;
    }

    public CheckExpandStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckExpandStatusResponseBodyData extends TeaModel {
        @NameInMap("Msg")
        public String msg;

        @NameInMap("IsActive")
        public Boolean isActive;

        public static CheckExpandStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckExpandStatusResponseBodyData self = new CheckExpandStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckExpandStatusResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public CheckExpandStatusResponseBodyData setIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Boolean getIsActive() {
            return this.isActive;
        }

    }

}
