// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFolderResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetFolderResponseBodyData data;

    public static GetFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFolderResponseBody self = new GetFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFolderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFolderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFolderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFolderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetFolderResponseBody setData(GetFolderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFolderResponseBodyData getData() {
        return this.data;
    }

    public static class GetFolderResponseBodyData extends TeaModel {
        @NameInMap("FolderPath")
        public String folderPath;

        @NameInMap("FolderId")
        public String folderId;

        public static GetFolderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFolderResponseBodyData self = new GetFolderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFolderResponseBodyData setFolderPath(String folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public String getFolderPath() {
            return this.folderPath;
        }

        public GetFolderResponseBodyData setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

    }

}
