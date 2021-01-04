// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190403.models;

import com.aliyun.tea.*;

public class UploadIdentifyRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Success")
    public Boolean success;

    public static UploadIdentifyRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadIdentifyRecordResponseBody self = new UploadIdentifyRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadIdentifyRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadIdentifyRecordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UploadIdentifyRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
