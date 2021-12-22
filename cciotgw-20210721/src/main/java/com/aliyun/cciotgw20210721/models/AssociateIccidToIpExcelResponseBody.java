// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AssociateIccidToIpExcelResponseBody extends TeaModel {
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

    public static AssociateIccidToIpExcelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateIccidToIpExcelResponseBody self = new AssociateIccidToIpExcelResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateIccidToIpExcelResponseBody setAsynToken(String asynToken) {
        this.asynToken = asynToken;
        return this;
    }
    public String getAsynToken() {
        return this.asynToken;
    }

    public AssociateIccidToIpExcelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AssociateIccidToIpExcelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssociateIccidToIpExcelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociateIccidToIpExcelResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
