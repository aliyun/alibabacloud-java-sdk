// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetTaskResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setData(GetTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskResponseBodyData getData() {
        return this.data;
    }

    public GetTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetTaskResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GetTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyData self = new GetTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTaskResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
