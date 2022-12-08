// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateEventRecordPlanResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateEventRecordPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventRecordPlanResponseBody self = new UpdateEventRecordPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEventRecordPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateEventRecordPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateEventRecordPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEventRecordPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
