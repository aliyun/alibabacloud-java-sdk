// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AddIpToConnectionPoolFromExcelResponseBody extends TeaModel {
    @NameInMap("AsynToken")
    public String asynToken;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static AddIpToConnectionPoolFromExcelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIpToConnectionPoolFromExcelResponseBody self = new AddIpToConnectionPoolFromExcelResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIpToConnectionPoolFromExcelResponseBody setAsynToken(String asynToken) {
        this.asynToken = asynToken;
        return this;
    }
    public String getAsynToken() {
        return this.asynToken;
    }

    public AddIpToConnectionPoolFromExcelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddIpToConnectionPoolFromExcelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddIpToConnectionPoolFromExcelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddIpToConnectionPoolFromExcelResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
