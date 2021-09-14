// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class AttachHostsToBastionUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BastionInstanceId")
    public String bastionInstanceId;

    @NameInMap("BastionUser")
    public String bastionUser;

    @NameInMap("Hosts")
    public java.util.List<AttachHostsToBastionUserResponseBodyHosts> hosts;

    public static AttachHostsToBastionUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostsToBastionUserResponseBody self = new AttachHostsToBastionUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostsToBastionUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostsToBastionUserResponseBody setBastionInstanceId(String bastionInstanceId) {
        this.bastionInstanceId = bastionInstanceId;
        return this;
    }
    public String getBastionInstanceId() {
        return this.bastionInstanceId;
    }

    public AttachHostsToBastionUserResponseBody setBastionUser(String bastionUser) {
        this.bastionUser = bastionUser;
        return this;
    }
    public String getBastionUser() {
        return this.bastionUser;
    }

    public AttachHostsToBastionUserResponseBody setHosts(java.util.List<AttachHostsToBastionUserResponseBodyHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<AttachHostsToBastionUserResponseBodyHosts> getHosts() {
        return this.hosts;
    }

    public static class AttachHostsToBastionUserResponseBodyHosts extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Message")
        public String message;

        public static AttachHostsToBastionUserResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            AttachHostsToBastionUserResponseBodyHosts self = new AttachHostsToBastionUserResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public AttachHostsToBastionUserResponseBodyHosts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostsToBastionUserResponseBodyHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public AttachHostsToBastionUserResponseBodyHosts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
