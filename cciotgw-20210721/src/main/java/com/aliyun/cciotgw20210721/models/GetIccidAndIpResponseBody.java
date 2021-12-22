// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetIccidAndIpResponseBody extends TeaModel {
    @NameInMap("CciotId")
    public String cciotId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public String success;

    public static GetIccidAndIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIccidAndIpResponseBody self = new GetIccidAndIpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIccidAndIpResponseBody setCciotId(String cciotId) {
        this.cciotId = cciotId;
        return this;
    }
    public String getCciotId() {
        return this.cciotId;
    }

    public GetIccidAndIpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIccidAndIpResponseBody setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public GetIccidAndIpResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetIccidAndIpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIccidAndIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIccidAndIpResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetIccidAndIpResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
