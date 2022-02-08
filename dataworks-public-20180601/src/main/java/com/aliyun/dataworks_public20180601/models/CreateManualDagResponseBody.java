// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CreateManualDagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReturnCode")
    public String returnCode;

    @NameInMap("ReturnErrorSolution")
    public String returnErrorSolution;

    @NameInMap("ReturnMessage")
    public String returnMessage;

    @NameInMap("ReturnValue")
    public Long returnValue;

    public static CreateManualDagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateManualDagResponseBody self = new CreateManualDagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateManualDagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateManualDagResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public CreateManualDagResponseBody setReturnErrorSolution(String returnErrorSolution) {
        this.returnErrorSolution = returnErrorSolution;
        return this;
    }
    public String getReturnErrorSolution() {
        return this.returnErrorSolution;
    }

    public CreateManualDagResponseBody setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
        return this;
    }
    public String getReturnMessage() {
        return this.returnMessage;
    }

    public CreateManualDagResponseBody setReturnValue(Long returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public Long getReturnValue() {
        return this.returnValue;
    }

}
