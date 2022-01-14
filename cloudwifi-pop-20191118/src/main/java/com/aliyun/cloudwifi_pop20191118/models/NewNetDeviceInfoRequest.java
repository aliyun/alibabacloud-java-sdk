// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewNetDeviceInfoRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Devices")
    public java.util.List<NewNetDeviceInfoRequestDevices> devices;

    @NameInMap("RequestId")
    public String requestId;

    public static NewNetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        NewNetDeviceInfoRequest self = new NewNetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public NewNetDeviceInfoRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public NewNetDeviceInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public NewNetDeviceInfoRequest setDevices(java.util.List<NewNetDeviceInfoRequestDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<NewNetDeviceInfoRequestDevices> getDevices() {
        return this.devices;
    }

    public NewNetDeviceInfoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class NewNetDeviceInfoRequestDevices extends TeaModel {
        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Idc")
        public String idc;

        @NameInMap("LogicNetPod")
        public String logicNetPod;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("MgnIp")
        public String mgnIp;

        @NameInMap("Model")
        public String model;

        @NameInMap("NetPod")
        public String netPod;

        @NameInMap("Password")
        public String password;

        @NameInMap("Role")
        public String role;

        @NameInMap("ServiceTag")
        public String serviceTag;

        @NameInMap("Username")
        public String username;

        public static NewNetDeviceInfoRequestDevices build(java.util.Map<String, ?> map) throws Exception {
            NewNetDeviceInfoRequestDevices self = new NewNetDeviceInfoRequestDevices();
            return TeaModel.build(map, self);
        }

        public NewNetDeviceInfoRequestDevices setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public NewNetDeviceInfoRequestDevices setIdc(String idc) {
            this.idc = idc;
            return this;
        }
        public String getIdc() {
            return this.idc;
        }

        public NewNetDeviceInfoRequestDevices setLogicNetPod(String logicNetPod) {
            this.logicNetPod = logicNetPod;
            return this;
        }
        public String getLogicNetPod() {
            return this.logicNetPod;
        }

        public NewNetDeviceInfoRequestDevices setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public NewNetDeviceInfoRequestDevices setMgnIp(String mgnIp) {
            this.mgnIp = mgnIp;
            return this;
        }
        public String getMgnIp() {
            return this.mgnIp;
        }

        public NewNetDeviceInfoRequestDevices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public NewNetDeviceInfoRequestDevices setNetPod(String netPod) {
            this.netPod = netPod;
            return this;
        }
        public String getNetPod() {
            return this.netPod;
        }

        public NewNetDeviceInfoRequestDevices setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public NewNetDeviceInfoRequestDevices setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public NewNetDeviceInfoRequestDevices setServiceTag(String serviceTag) {
            this.serviceTag = serviceTag;
            return this;
        }
        public String getServiceTag() {
            return this.serviceTag;
        }

        public NewNetDeviceInfoRequestDevices setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
