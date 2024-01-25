// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestBackgroundResponseBody extends TeaModel {
    @NameInMap("Data")
    public RequestBackgroundResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RequestBackgroundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestBackgroundResponseBody self = new RequestBackgroundResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestBackgroundResponseBody setData(RequestBackgroundResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestBackgroundResponseBodyData getData() {
        return this.data;
    }

    public RequestBackgroundResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestBackgroundResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestBackgroundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestBackgroundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestBackgroundResponseBodyData extends TeaModel {
        @NameInMap("BgConfig")
        public java.util.Map<String, ?> bgConfig;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Open")
        public Boolean open;

        @NameInMap("ResourceUuid")
        public String resourceUuid;

        @NameInMap("Scope")
        public String scope;

        public static RequestBackgroundResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestBackgroundResponseBodyData self = new RequestBackgroundResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestBackgroundResponseBodyData setBgConfig(java.util.Map<String, ?> bgConfig) {
            this.bgConfig = bgConfig;
            return this;
        }
        public java.util.Map<String, ?> getBgConfig() {
            return this.bgConfig;
        }

        public RequestBackgroundResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public RequestBackgroundResponseBodyData setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public RequestBackgroundResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public RequestBackgroundResponseBodyData setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public RequestBackgroundResponseBodyData setResourceUuid(String resourceUuid) {
            this.resourceUuid = resourceUuid;
            return this;
        }
        public String getResourceUuid() {
            return this.resourceUuid;
        }

        public RequestBackgroundResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
