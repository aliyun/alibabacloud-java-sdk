// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentDevicesResponseBody extends TeaModel {
    @NameInMap("AgentDeviceList")
    public ListAgentDevicesResponseBodyAgentDeviceList agentDeviceList;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAgentDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentDevicesResponseBody self = new ListAgentDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentDevicesResponseBody setAgentDeviceList(ListAgentDevicesResponseBodyAgentDeviceList agentDeviceList) {
        this.agentDeviceList = agentDeviceList;
        return this;
    }
    public ListAgentDevicesResponseBodyAgentDeviceList getAgentDeviceList() {
        return this.agentDeviceList;
    }

    public ListAgentDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentDevicesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentDevicesResponseBodyAgentDeviceListAgentDevice extends TeaModel {
        @NameInMap("BrowserVersion")
        public String browserVersion;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ClientPort")
        public String clientPort;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsLogin")
        public Integer isLogin;

        @NameInMap("LoginTime")
        public Long loginTime;

        @NameInMap("RamId")
        public Long ramId;

        @NameInMap("Remark")
        public String remark;

        public static ListAgentDevicesResponseBodyAgentDeviceListAgentDevice build(java.util.Map<String, ?> map) throws Exception {
            ListAgentDevicesResponseBodyAgentDeviceListAgentDevice self = new ListAgentDevicesResponseBodyAgentDeviceListAgentDevice();
            return TeaModel.build(map, self);
        }

        public ListAgentDevicesResponseBodyAgentDeviceListAgentDevice setBrowserVersion(String browserVersion) {
            this.browserVersion = browserVersion;
            return this;
        }
        public String getBrowserVersion() {
            return this.browserVersion;
        }

        public ListAgentDevicesResponseBodyAgentDeviceListAgentDevice setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public ListAgentDevicesResponseBodyAgentDeviceListAgentDevice setClientPort(String clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public String getClientPort() {
            return this.clientPort;
        }

        public ListAgentDevicesResponseBodyAgentDeviceListAgentDevice setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentDevicesResponseBodyAgentDeviceListAgentDevice setIsLogin(Integer isLogin) {
            this.isLogin = isLogin;
            return this;
        }
        public Integer getIsLogin() {
            return this.isLogin;
        }

        public ListAgentDevicesResponseBodyAgentDeviceListAgentDevice setLoginTime(Long loginTime) {
            this.loginTime = loginTime;
            return this;
        }
        public Long getLoginTime() {
            return this.loginTime;
        }

        public ListAgentDevicesResponseBodyAgentDeviceListAgentDevice setRamId(Long ramId) {
            this.ramId = ramId;
            return this;
        }
        public Long getRamId() {
            return this.ramId;
        }

        public ListAgentDevicesResponseBodyAgentDeviceListAgentDevice setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class ListAgentDevicesResponseBodyAgentDeviceList extends TeaModel {
        @NameInMap("AgentDevice")
        public java.util.List<ListAgentDevicesResponseBodyAgentDeviceListAgentDevice> agentDevice;

        public static ListAgentDevicesResponseBodyAgentDeviceList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentDevicesResponseBodyAgentDeviceList self = new ListAgentDevicesResponseBodyAgentDeviceList();
            return TeaModel.build(map, self);
        }

        public ListAgentDevicesResponseBodyAgentDeviceList setAgentDevice(java.util.List<ListAgentDevicesResponseBodyAgentDeviceListAgentDevice> agentDevice) {
            this.agentDevice = agentDevice;
            return this;
        }
        public java.util.List<ListAgentDevicesResponseBodyAgentDeviceListAgentDevice> getAgentDevice() {
            return this.agentDevice;
        }

    }

}
