// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceResourceResponseBody extends TeaModel {
    @NameInMap("DeviceResource")
    public GetDeviceResourceResponseBodyDeviceResource deviceResource;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceResourceResponseBody self = new GetDeviceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceResourceResponseBody setDeviceResource(GetDeviceResourceResponseBodyDeviceResource deviceResource) {
        this.deviceResource = deviceResource;
        return this;
    }
    public GetDeviceResourceResponseBodyDeviceResource getDeviceResource() {
        return this.deviceResource;
    }

    public GetDeviceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceResourceResponseBodyDeviceResource extends TeaModel {
        @NameInMap("BlockNumber")
        public String blockNumber;

        @NameInMap("Business")
        public String business;

        @NameInMap("Config")
        public String config;

        @NameInMap("ConfigTaskStatus")
        public String configTaskStatus;

        @NameInMap("DeliveryIp")
        public String deliveryIp;

        @NameInMap("DeviceNum")
        public String deviceNum;

        @NameInMap("DeviceResourceId")
        public String deviceResourceId;

        @NameInMap("GenerateConfig")
        public String generateConfig;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InterConnection")
        public String interConnection;

        @NameInMap("Location")
        public String location;

        @NameInMap("Loopback")
        public String loopback;

        @NameInMap("ManagerIp")
        public String managerIp;

        @NameInMap("Model")
        public String model;

        @NameInMap("Role")
        public String role;

        @NameInMap("SetupProjectId")
        public String setupProjectId;

        @NameInMap("Sn")
        public String sn;

        @NameInMap("Stack")
        public Boolean stack;

        @NameInMap("Vendor")
        public String vendor;

        public static GetDeviceResourceResponseBodyDeviceResource build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceResourceResponseBodyDeviceResource self = new GetDeviceResourceResponseBodyDeviceResource();
            return TeaModel.build(map, self);
        }

        public GetDeviceResourceResponseBodyDeviceResource setBlockNumber(String blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }
        public String getBlockNumber() {
            return this.blockNumber;
        }

        public GetDeviceResourceResponseBodyDeviceResource setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public GetDeviceResourceResponseBodyDeviceResource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetDeviceResourceResponseBodyDeviceResource setConfigTaskStatus(String configTaskStatus) {
            this.configTaskStatus = configTaskStatus;
            return this;
        }
        public String getConfigTaskStatus() {
            return this.configTaskStatus;
        }

        public GetDeviceResourceResponseBodyDeviceResource setDeliveryIp(String deliveryIp) {
            this.deliveryIp = deliveryIp;
            return this;
        }
        public String getDeliveryIp() {
            return this.deliveryIp;
        }

        public GetDeviceResourceResponseBodyDeviceResource setDeviceNum(String deviceNum) {
            this.deviceNum = deviceNum;
            return this;
        }
        public String getDeviceNum() {
            return this.deviceNum;
        }

        public GetDeviceResourceResponseBodyDeviceResource setDeviceResourceId(String deviceResourceId) {
            this.deviceResourceId = deviceResourceId;
            return this;
        }
        public String getDeviceResourceId() {
            return this.deviceResourceId;
        }

        public GetDeviceResourceResponseBodyDeviceResource setGenerateConfig(String generateConfig) {
            this.generateConfig = generateConfig;
            return this;
        }
        public String getGenerateConfig() {
            return this.generateConfig;
        }

        public GetDeviceResourceResponseBodyDeviceResource setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetDeviceResourceResponseBodyDeviceResource setInterConnection(String interConnection) {
            this.interConnection = interConnection;
            return this;
        }
        public String getInterConnection() {
            return this.interConnection;
        }

        public GetDeviceResourceResponseBodyDeviceResource setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetDeviceResourceResponseBodyDeviceResource setLoopback(String loopback) {
            this.loopback = loopback;
            return this;
        }
        public String getLoopback() {
            return this.loopback;
        }

        public GetDeviceResourceResponseBodyDeviceResource setManagerIp(String managerIp) {
            this.managerIp = managerIp;
            return this;
        }
        public String getManagerIp() {
            return this.managerIp;
        }

        public GetDeviceResourceResponseBodyDeviceResource setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetDeviceResourceResponseBodyDeviceResource setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetDeviceResourceResponseBodyDeviceResource setSetupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        public GetDeviceResourceResponseBodyDeviceResource setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public GetDeviceResourceResponseBodyDeviceResource setStack(Boolean stack) {
            this.stack = stack;
            return this;
        }
        public Boolean getStack() {
            return this.stack;
        }

        public GetDeviceResourceResponseBodyDeviceResource setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
