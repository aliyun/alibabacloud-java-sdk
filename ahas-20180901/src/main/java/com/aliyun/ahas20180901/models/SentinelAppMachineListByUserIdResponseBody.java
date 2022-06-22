// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppMachineListByUserIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelAppMachineListByUserIdResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelAppMachineListByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppMachineListByUserIdResponseBody self = new SentinelAppMachineListByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelAppMachineListByUserIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelAppMachineListByUserIdResponseBody setData(java.util.List<SentinelAppMachineListByUserIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelAppMachineListByUserIdResponseBodyData> getData() {
        return this.data;
    }

    public SentinelAppMachineListByUserIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelAppMachineListByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelAppMachineListByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelAppMachineListByUserIdResponseBodyData extends TeaModel {
        @NameInMap("health")
        public Boolean health;

        @NameInMap("hostname")
        public String hostname;

        @NameInMap("id")
        public Long id;

        @NameInMap("ip")
        public String ip;

        @NameInMap("pId")
        public String pId;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("processConfigurationId")
        public String processConfigurationId;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("version")
        public String version;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelAppMachineListByUserIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppMachineListByUserIdResponseBodyData self = new SentinelAppMachineListByUserIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelAppMachineListByUserIdResponseBodyData setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public SentinelAppMachineListByUserIdResponseBodyData setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public SentinelAppMachineListByUserIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelAppMachineListByUserIdResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SentinelAppMachineListByUserIdResponseBodyData setPId(String pId) {
            this.pId = pId;
            return this;
        }
        public String getPId() {
            return this.pId;
        }

        public SentinelAppMachineListByUserIdResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelAppMachineListByUserIdResponseBodyData setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelAppMachineListByUserIdResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SentinelAppMachineListByUserIdResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public SentinelAppMachineListByUserIdResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
