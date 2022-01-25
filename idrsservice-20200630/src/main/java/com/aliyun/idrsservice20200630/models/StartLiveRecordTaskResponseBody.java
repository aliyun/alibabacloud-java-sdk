// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class StartLiveRecordTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StartLiveRecordTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static StartLiveRecordTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartLiveRecordTaskResponseBody self = new StartLiveRecordTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartLiveRecordTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartLiveRecordTaskResponseBody setData(StartLiveRecordTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartLiveRecordTaskResponseBodyData getData() {
        return this.data;
    }

    public StartLiveRecordTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartLiveRecordTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartLiveRecordTaskResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        public static StartLiveRecordTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartLiveRecordTaskResponseBodyData self = new StartLiveRecordTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartLiveRecordTaskResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public StartLiveRecordTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
