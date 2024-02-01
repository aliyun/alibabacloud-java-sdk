// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateStreamPushJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateStreamPushJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateStreamPushJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamPushJobResponseBody self = new CreateStreamPushJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStreamPushJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateStreamPushJobResponseBody setData(CreateStreamPushJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateStreamPushJobResponseBodyData getData() {
        return this.data;
    }

    public CreateStreamPushJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateStreamPushJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStreamPushJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateStreamPushJobResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static CreateStreamPushJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateStreamPushJobResponseBodyData self = new CreateStreamPushJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateStreamPushJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
