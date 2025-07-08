// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateCardMessageCallbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TestFailCode")
    public String testFailCode;

    @NameInMap("TestResponse")
    public String testResponse;

    @NameInMap("TestSuccess")
    public Boolean testSuccess;

    public static CreateCardMessageCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCardMessageCallbackResponseBody self = new CreateCardMessageCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCardMessageCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCardMessageCallbackResponseBody setTestFailCode(String testFailCode) {
        this.testFailCode = testFailCode;
        return this;
    }
    public String getTestFailCode() {
        return this.testFailCode;
    }

    public CreateCardMessageCallbackResponseBody setTestResponse(String testResponse) {
        this.testResponse = testResponse;
        return this;
    }
    public String getTestResponse() {
        return this.testResponse;
    }

    public CreateCardMessageCallbackResponseBody setTestSuccess(Boolean testSuccess) {
        this.testSuccess = testSuccess;
        return this;
    }
    public Boolean getTestSuccess() {
        return this.testSuccess;
    }

}
