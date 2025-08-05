// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateTaskScheduleExpressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReturnCode")
    public String returnCode;

    @NameInMap("ReturnErrorSolution")
    public String returnErrorSolution;

    @NameInMap("ReturnMessage")
    public String returnMessage;

    @NameInMap("ReturnValue")
    public Boolean returnValue;

    public static UpdateTaskScheduleExpressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskScheduleExpressResponseBody self = new UpdateTaskScheduleExpressResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTaskScheduleExpressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTaskScheduleExpressResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public UpdateTaskScheduleExpressResponseBody setReturnErrorSolution(String returnErrorSolution) {
        this.returnErrorSolution = returnErrorSolution;
        return this;
    }
    public String getReturnErrorSolution() {
        return this.returnErrorSolution;
    }

    public UpdateTaskScheduleExpressResponseBody setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
        return this;
    }
    public String getReturnMessage() {
        return this.returnMessage;
    }

    public UpdateTaskScheduleExpressResponseBody setReturnValue(Boolean returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public Boolean getReturnValue() {
        return this.returnValue;
    }

}
