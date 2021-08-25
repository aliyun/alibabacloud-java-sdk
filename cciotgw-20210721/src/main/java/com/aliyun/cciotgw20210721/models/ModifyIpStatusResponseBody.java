// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ModifyIpStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("ErrorIpList")
    public java.util.List<ModifyIpStatusResponseBodyErrorIpList> errorIpList;

    public static ModifyIpStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpStatusResponseBody self = new ModifyIpStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyIpStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyIpStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyIpStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ModifyIpStatusResponseBody setErrorIpList(java.util.List<ModifyIpStatusResponseBodyErrorIpList> errorIpList) {
        this.errorIpList = errorIpList;
        return this;
    }
    public java.util.List<ModifyIpStatusResponseBodyErrorIpList> getErrorIpList() {
        return this.errorIpList;
    }

    public static class ModifyIpStatusResponseBodyErrorIpList extends TeaModel {
        @NameInMap("Cause")
        public String cause;

        @NameInMap("Ip")
        public String ip;

        public static ModifyIpStatusResponseBodyErrorIpList build(java.util.Map<String, ?> map) throws Exception {
            ModifyIpStatusResponseBodyErrorIpList self = new ModifyIpStatusResponseBodyErrorIpList();
            return TeaModel.build(map, self);
        }

        public ModifyIpStatusResponseBodyErrorIpList setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public ModifyIpStatusResponseBodyErrorIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
