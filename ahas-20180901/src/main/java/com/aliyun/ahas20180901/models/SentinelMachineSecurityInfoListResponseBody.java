// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMachineSecurityInfoListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelMachineSecurityInfoListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelMachineSecurityInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelMachineSecurityInfoListResponseBody self = new SentinelMachineSecurityInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelMachineSecurityInfoListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelMachineSecurityInfoListResponseBody setData(java.util.List<SentinelMachineSecurityInfoListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelMachineSecurityInfoListResponseBodyData> getData() {
        return this.data;
    }

    public SentinelMachineSecurityInfoListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelMachineSecurityInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelMachineSecurityInfoListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelMachineSecurityInfoListResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ParentIp")
        public String parentIp;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("ProcessConfigurationId")
        public String processConfigurationId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SwitchId")
        public String switchId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("VpcId")
        public String vpcId;

        public static SentinelMachineSecurityInfoListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelMachineSecurityInfoListResponseBodyData self = new SentinelMachineSecurityInfoListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelMachineSecurityInfoListResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setParentIp(String parentIp) {
            this.parentIp = parentIp;
            return this;
        }
        public String getParentIp() {
            return this.parentIp;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelMachineSecurityInfoListResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
