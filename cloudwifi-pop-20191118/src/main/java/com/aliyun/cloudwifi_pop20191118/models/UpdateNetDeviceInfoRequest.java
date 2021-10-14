// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class UpdateNetDeviceInfoRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Devices")
    public java.util.List<UpdateNetDeviceInfoRequestDevices> devices;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetDeviceInfoRequest self = new UpdateNetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetDeviceInfoRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public UpdateNetDeviceInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateNetDeviceInfoRequest setDevices(java.util.List<UpdateNetDeviceInfoRequestDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<UpdateNetDeviceInfoRequestDevices> getDevices() {
        return this.devices;
    }

    public UpdateNetDeviceInfoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateNetDeviceInfoRequestDevices extends TeaModel {
        @NameInMap("LogicNetPod")
        public String logicNetPod;

        @NameInMap("ServiceTag")
        public String serviceTag;

        @NameInMap("NetPod")
        public String netPod;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("MgnIp")
        public String mgnIp;

        @NameInMap("Model")
        public String model;

        @NameInMap("Password")
        public String password;

        @NameInMap("Idc")
        public String idc;

        @NameInMap("Role")
        public String role;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Username")
        public String username;

        public static UpdateNetDeviceInfoRequestDevices build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetDeviceInfoRequestDevices self = new UpdateNetDeviceInfoRequestDevices();
            return TeaModel.build(map, self);
        }

        public UpdateNetDeviceInfoRequestDevices setLogicNetPod(String logicNetPod) {
            this.logicNetPod = logicNetPod;
            return this;
        }
        public String getLogicNetPod() {
            return this.logicNetPod;
        }

        public UpdateNetDeviceInfoRequestDevices setServiceTag(String serviceTag) {
            this.serviceTag = serviceTag;
            return this;
        }
        public String getServiceTag() {
            return this.serviceTag;
        }

        public UpdateNetDeviceInfoRequestDevices setNetPod(String netPod) {
            this.netPod = netPod;
            return this;
        }
        public String getNetPod() {
            return this.netPod;
        }

        public UpdateNetDeviceInfoRequestDevices setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public UpdateNetDeviceInfoRequestDevices setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public UpdateNetDeviceInfoRequestDevices setMgnIp(String mgnIp) {
            this.mgnIp = mgnIp;
            return this;
        }
        public String getMgnIp() {
            return this.mgnIp;
        }

        public UpdateNetDeviceInfoRequestDevices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateNetDeviceInfoRequestDevices setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateNetDeviceInfoRequestDevices setIdc(String idc) {
            this.idc = idc;
            return this;
        }
        public String getIdc() {
            return this.idc;
        }

        public UpdateNetDeviceInfoRequestDevices setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UpdateNetDeviceInfoRequestDevices setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateNetDeviceInfoRequestDevices setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
