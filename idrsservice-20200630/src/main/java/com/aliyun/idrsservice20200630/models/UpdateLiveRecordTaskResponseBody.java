// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateLiveRecordTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveRecordTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTaskResponseBody self = new UpdateLiveRecordTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateLiveRecordTaskResponseBody setData(UpdateLiveRecordTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLiveRecordTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateLiveRecordTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLiveRecordTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLiveRecordTaskResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        public static UpdateLiveRecordTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTaskResponseBodyData self = new UpdateLiveRecordTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTaskResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLiveRecordTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
