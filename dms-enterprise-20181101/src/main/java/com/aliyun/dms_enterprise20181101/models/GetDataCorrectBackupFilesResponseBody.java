// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectBackupFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("DataCorrectBackupFiles")
    public GetDataCorrectBackupFilesResponseBodyDataCorrectBackupFiles dataCorrectBackupFiles;

    public static GetDataCorrectBackupFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectBackupFilesResponseBody self = new GetDataCorrectBackupFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectBackupFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCorrectBackupFilesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataCorrectBackupFilesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataCorrectBackupFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataCorrectBackupFilesResponseBody setDataCorrectBackupFiles(GetDataCorrectBackupFilesResponseBodyDataCorrectBackupFiles dataCorrectBackupFiles) {
        this.dataCorrectBackupFiles = dataCorrectBackupFiles;
        return this;
    }
    public GetDataCorrectBackupFilesResponseBodyDataCorrectBackupFiles getDataCorrectBackupFiles() {
        return this.dataCorrectBackupFiles;
    }

    public static class GetDataCorrectBackupFilesResponseBodyDataCorrectBackupFiles extends TeaModel {
        @NameInMap("FileUrl")
        public java.util.List<String> fileUrl;

        public static GetDataCorrectBackupFilesResponseBodyDataCorrectBackupFiles build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectBackupFilesResponseBodyDataCorrectBackupFiles self = new GetDataCorrectBackupFilesResponseBodyDataCorrectBackupFiles();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectBackupFilesResponseBodyDataCorrectBackupFiles setFileUrl(java.util.List<String> fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public java.util.List<String> getFileUrl() {
            return this.fileUrl;
        }

    }

}
