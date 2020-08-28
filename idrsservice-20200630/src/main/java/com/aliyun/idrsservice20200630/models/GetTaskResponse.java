// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTaskResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetTaskResponseData data;

    public static GetTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponse self = new GetTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponse setData(GetTaskResponseData data) {
        this.data = data;
        return this;
    }
    public GetTaskResponseData getData() {
        return this.data;
    }

    public static class GetTaskResponseData extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static GetTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseData self = new GetTaskResponseData();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetTaskResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTaskResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskResponseData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
