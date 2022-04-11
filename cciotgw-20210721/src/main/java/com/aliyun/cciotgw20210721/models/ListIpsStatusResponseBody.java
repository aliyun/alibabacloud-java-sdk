// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListIpsStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Ips")
    public java.util.List<ListIpsStatusResponseBodyIps> ips;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ListIpsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpsStatusResponseBody self = new ListIpsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpsStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIpsStatusResponseBody setIps(java.util.List<ListIpsStatusResponseBodyIps> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<ListIpsStatusResponseBodyIps> getIps() {
        return this.ips;
    }

    public ListIpsStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIpsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpsStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListIpsStatusResponseBodyIps extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Status")
        public String status;

        public static ListIpsStatusResponseBodyIps build(java.util.Map<String, ?> map) throws Exception {
            ListIpsStatusResponseBodyIps self = new ListIpsStatusResponseBodyIps();
            return TeaModel.build(map, self);
        }

        public ListIpsStatusResponseBodyIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListIpsStatusResponseBodyIps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
