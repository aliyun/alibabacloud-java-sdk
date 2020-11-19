// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckExpandStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public CheckExpandStatusResponseData data;

    public static CheckExpandStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckExpandStatusResponse self = new CheckExpandStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckExpandStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckExpandStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckExpandStatusResponse setData(CheckExpandStatusResponseData data) {
        this.data = data;
        return this;
    }
    public CheckExpandStatusResponseData getData() {
        return this.data;
    }

    public static class CheckExpandStatusResponseData extends TeaModel {
        @NameInMap("IsActive")
        @Validation(required = true)
        public Boolean isActive;

        @NameInMap("Msg")
        @Validation(required = true)
        public String msg;

        public static CheckExpandStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            CheckExpandStatusResponseData self = new CheckExpandStatusResponseData();
            return TeaModel.build(map, self);
        }

        public CheckExpandStatusResponseData setIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Boolean getIsActive() {
            return this.isActive;
        }

        public CheckExpandStatusResponseData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

    }

}
