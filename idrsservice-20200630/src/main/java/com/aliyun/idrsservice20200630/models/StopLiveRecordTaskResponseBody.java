// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class StopLiveRecordTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StopLiveRecordTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static StopLiveRecordTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLiveRecordTaskResponseBody self = new StopLiveRecordTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLiveRecordTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopLiveRecordTaskResponseBody setData(StopLiveRecordTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopLiveRecordTaskResponseBodyData getData() {
        return this.data;
    }

    public StopLiveRecordTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopLiveRecordTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StopLiveRecordTaskResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static StopLiveRecordTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopLiveRecordTaskResponseBodyData self = new StopLiveRecordTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopLiveRecordTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
