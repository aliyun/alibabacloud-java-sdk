// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppMachineListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelAppMachineListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelAppMachineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppMachineListResponseBody self = new SentinelAppMachineListResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelAppMachineListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelAppMachineListResponseBody setData(java.util.List<SentinelAppMachineListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelAppMachineListResponseBodyData> getData() {
        return this.data;
    }

    public SentinelAppMachineListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelAppMachineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelAppMachineListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelAppMachineListResponseBodyData extends TeaModel {
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

        public static SentinelAppMachineListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppMachineListResponseBodyData self = new SentinelAppMachineListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelAppMachineListResponseBodyData setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public SentinelAppMachineListResponseBodyData setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public SentinelAppMachineListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelAppMachineListResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SentinelAppMachineListResponseBodyData setPId(String pId) {
            this.pId = pId;
            return this;
        }
        public String getPId() {
            return this.pId;
        }

        public SentinelAppMachineListResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelAppMachineListResponseBodyData setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelAppMachineListResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SentinelAppMachineListResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public SentinelAppMachineListResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
