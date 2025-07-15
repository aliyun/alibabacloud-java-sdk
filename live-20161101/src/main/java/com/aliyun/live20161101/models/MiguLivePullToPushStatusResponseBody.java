// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MiguLivePullToPushStatusResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public MiguLivePullToPushStatusResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("timestamp")
    public String timestamp;

    public static MiguLivePullToPushStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MiguLivePullToPushStatusResponseBody self = new MiguLivePullToPushStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public MiguLivePullToPushStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MiguLivePullToPushStatusResponseBody setData(MiguLivePullToPushStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MiguLivePullToPushStatusResponseBodyData getData() {
        return this.data;
    }

    public MiguLivePullToPushStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MiguLivePullToPushStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MiguLivePullToPushStatusResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public static class MiguLivePullToPushStatusResponseBodyData extends TeaModel {
        @NameInMap("message")
        public String message;

        @NameInMap("status")
        public String status;

        public static MiguLivePullToPushStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MiguLivePullToPushStatusResponseBodyData self = new MiguLivePullToPushStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MiguLivePullToPushStatusResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MiguLivePullToPushStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
