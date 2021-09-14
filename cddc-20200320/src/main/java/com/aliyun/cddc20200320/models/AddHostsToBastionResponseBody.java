// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class AddHostsToBastionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BastionInstanceId")
    public String bastionInstanceId;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("Hosts")
    public java.util.List<AddHostsToBastionResponseBodyHosts> hosts;

    public static AddHostsToBastionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddHostsToBastionResponseBody self = new AddHostsToBastionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddHostsToBastionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddHostsToBastionResponseBody setBastionInstanceId(String bastionInstanceId) {
        this.bastionInstanceId = bastionInstanceId;
        return this;
    }
    public String getBastionInstanceId() {
        return this.bastionInstanceId;
    }

    public AddHostsToBastionResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public AddHostsToBastionResponseBody setHosts(java.util.List<AddHostsToBastionResponseBodyHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<AddHostsToBastionResponseBodyHosts> getHosts() {
        return this.hosts;
    }

    public static class AddHostsToBastionResponseBodyHosts extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostPrivateIp")
        public String hostPrivateIp;

        public static AddHostsToBastionResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            AddHostsToBastionResponseBodyHosts self = new AddHostsToBastionResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public AddHostsToBastionResponseBodyHosts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddHostsToBastionResponseBodyHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public AddHostsToBastionResponseBodyHosts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddHostsToBastionResponseBodyHosts setHostPrivateIp(String hostPrivateIp) {
            this.hostPrivateIp = hostPrivateIp;
            return this;
        }
        public String getHostPrivateIp() {
            return this.hostPrivateIp;
        }

    }

}
