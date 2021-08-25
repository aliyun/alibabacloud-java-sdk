// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AllocateIpsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("AsynToken")
    public String asynToken;

    public static AllocateIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpsResponseBody self = new AllocateIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateIpsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AllocateIpsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AllocateIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateIpsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public AllocateIpsResponseBody setAsynToken(String asynToken) {
        this.asynToken = asynToken;
        return this;
    }
    public String getAsynToken() {
        return this.asynToken;
    }

}
