// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class UnAssociateIccidToIpResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorIpList")
    public java.util.List<UnAssociateIccidToIpResponseBodyErrorIpList> errorIpList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static UnAssociateIccidToIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateIccidToIpResponseBody self = new UnAssociateIccidToIpResponseBody();
        return TeaModel.build(map, self);
    }

    public UnAssociateIccidToIpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnAssociateIccidToIpResponseBody setErrorIpList(java.util.List<UnAssociateIccidToIpResponseBodyErrorIpList> errorIpList) {
        this.errorIpList = errorIpList;
        return this;
    }
    public java.util.List<UnAssociateIccidToIpResponseBodyErrorIpList> getErrorIpList() {
        return this.errorIpList;
    }

    public UnAssociateIccidToIpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnAssociateIccidToIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnAssociateIccidToIpResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UnAssociateIccidToIpResponseBodyErrorIpList extends TeaModel {
        @NameInMap("Cause")
        public String cause;

        @NameInMap("Ip")
        public String ip;

        public static UnAssociateIccidToIpResponseBodyErrorIpList build(java.util.Map<String, ?> map) throws Exception {
            UnAssociateIccidToIpResponseBodyErrorIpList self = new UnAssociateIccidToIpResponseBodyErrorIpList();
            return TeaModel.build(map, self);
        }

        public UnAssociateIccidToIpResponseBodyErrorIpList setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public UnAssociateIccidToIpResponseBodyErrorIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
