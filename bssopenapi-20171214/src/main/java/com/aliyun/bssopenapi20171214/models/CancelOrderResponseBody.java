// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CancelOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CancelOrderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CancelOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderResponseBody self = new CancelOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelOrderResponseBody setData(CancelOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelOrderResponseBodyData getData() {
        return this.data;
    }

    public CancelOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelOrderResponseBodyData extends TeaModel {
        @NameInMap("HostId")
        public String hostId;

        public static CancelOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelOrderResponseBodyData self = new CancelOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelOrderResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
