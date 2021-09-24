// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFolderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public GetFolderResponseData data;

    public static GetFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFolderResponse self = new GetFolderResponse();
        return TeaModel.build(map, self);
    }

    public GetFolderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFolderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetFolderResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFolderResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFolderResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFolderResponse setData(GetFolderResponseData data) {
        this.data = data;
        return this;
    }
    public GetFolderResponseData getData() {
        return this.data;
    }

    public static class GetFolderResponseData extends TeaModel {
        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("FolderPath")
        @Validation(required = true)
        public String folderPath;

        public static GetFolderResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetFolderResponseData self = new GetFolderResponseData();
            return TeaModel.build(map, self);
        }

        public GetFolderResponseData setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetFolderResponseData setFolderPath(String folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public String getFolderPath() {
            return this.folderPath;
        }

    }

}
