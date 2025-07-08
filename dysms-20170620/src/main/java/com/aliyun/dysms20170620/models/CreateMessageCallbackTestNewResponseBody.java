// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateMessageCallbackTestNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TestFailCode")
    public String testFailCode;

    @NameInMap("TestResponse")
    public String testResponse;

    @NameInMap("TestSuccess")
    public Boolean testSuccess;

    public static CreateMessageCallbackTestNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageCallbackTestNewResponseBody self = new CreateMessageCallbackTestNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMessageCallbackTestNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMessageCallbackTestNewResponseBody setTestFailCode(String testFailCode) {
        this.testFailCode = testFailCode;
        return this;
    }
    public String getTestFailCode() {
        return this.testFailCode;
    }

    public CreateMessageCallbackTestNewResponseBody setTestResponse(String testResponse) {
        this.testResponse = testResponse;
        return this;
    }
    public String getTestResponse() {
        return this.testResponse;
    }

    public CreateMessageCallbackTestNewResponseBody setTestSuccess(Boolean testSuccess) {
        this.testSuccess = testSuccess;
        return this;
    }
    public Boolean getTestSuccess() {
        return this.testSuccess;
    }

}
