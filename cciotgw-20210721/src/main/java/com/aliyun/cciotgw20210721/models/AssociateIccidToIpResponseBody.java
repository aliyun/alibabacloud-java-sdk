// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AssociateIccidToIpResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorIpList")
    public java.util.List<AssociateIccidToIpResponseBodyErrorIpList> errorIpList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static AssociateIccidToIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateIccidToIpResponseBody self = new AssociateIccidToIpResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateIccidToIpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AssociateIccidToIpResponseBody setErrorIpList(java.util.List<AssociateIccidToIpResponseBodyErrorIpList> errorIpList) {
        this.errorIpList = errorIpList;
        return this;
    }
    public java.util.List<AssociateIccidToIpResponseBodyErrorIpList> getErrorIpList() {
        return this.errorIpList;
    }

    public AssociateIccidToIpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssociateIccidToIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociateIccidToIpResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class AssociateIccidToIpResponseBodyErrorIpList extends TeaModel {
        @NameInMap("Cause")
        public String cause;

        @NameInMap("Ip")
        public String ip;

        public static AssociateIccidToIpResponseBodyErrorIpList build(java.util.Map<String, ?> map) throws Exception {
            AssociateIccidToIpResponseBodyErrorIpList self = new AssociateIccidToIpResponseBodyErrorIpList();
            return TeaModel.build(map, self);
        }

        public AssociateIccidToIpResponseBodyErrorIpList setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public AssociateIccidToIpResponseBodyErrorIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

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
