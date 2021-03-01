// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadFileJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("JobKey")
    public String jobKey;

    public static CreateUploadFileJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadFileJobResponseBody self = new CreateUploadFileJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadFileJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadFileJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateUploadFileJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateUploadFileJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateUploadFileJobResponseBody setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

}
