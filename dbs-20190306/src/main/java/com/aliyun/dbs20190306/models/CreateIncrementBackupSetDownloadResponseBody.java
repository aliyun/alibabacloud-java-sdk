// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateIncrementBackupSetDownloadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackupSetDownloadTaskId")
    public String backupSetDownloadTaskId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrCode")
    public String errCode;

    public static CreateIncrementBackupSetDownloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIncrementBackupSetDownloadResponseBody self = new CreateIncrementBackupSetDownloadResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIncrementBackupSetDownloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIncrementBackupSetDownloadResponseBody setBackupSetDownloadTaskId(String backupSetDownloadTaskId) {
        this.backupSetDownloadTaskId = backupSetDownloadTaskId;
        return this;
    }
    public String getBackupSetDownloadTaskId() {
        return this.backupSetDownloadTaskId;
    }

    public CreateIncrementBackupSetDownloadResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateIncrementBackupSetDownloadResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateIncrementBackupSetDownloadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateIncrementBackupSetDownloadResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
