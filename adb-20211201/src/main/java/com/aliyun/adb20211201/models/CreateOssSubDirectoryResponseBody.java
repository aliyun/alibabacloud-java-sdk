// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateOssSubDirectoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateOssSubDirectoryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateOssSubDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOssSubDirectoryResponseBody self = new CreateOssSubDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOssSubDirectoryResponseBody setData(CreateOssSubDirectoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOssSubDirectoryResponseBodyData getData() {
        return this.data;
    }

    public CreateOssSubDirectoryResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateOssSubDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOssSubDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOssSubDirectoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOssSubDirectoryResponseBodyData extends TeaModel {
        @NameInMap("ClientCRC")
        public Long clientCRC;

        @NameInMap("ETag")
        public String ETag;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ServerCRC")
        public Long serverCRC;

        public static CreateOssSubDirectoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOssSubDirectoryResponseBodyData self = new CreateOssSubDirectoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOssSubDirectoryResponseBodyData setClientCRC(Long clientCRC) {
            this.clientCRC = clientCRC;
            return this;
        }
        public Long getClientCRC() {
            return this.clientCRC;
        }

        public CreateOssSubDirectoryResponseBodyData setETag(String ETag) {
            this.ETag = ETag;
            return this;
        }
        public String getETag() {
            return this.ETag;
        }

        public CreateOssSubDirectoryResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateOssSubDirectoryResponseBodyData setServerCRC(Long serverCRC) {
            this.serverCRC = serverCRC;
            return this;
        }
        public Long getServerCRC() {
            return this.serverCRC;
        }

    }

}
