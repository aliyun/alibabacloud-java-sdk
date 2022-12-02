// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeviceResource extends TeaModel {
    @NameInMap("ArchId")
    public String archId;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    @NameInMap("BusinessTypeParams")
    public String businessTypeParams;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Data")
    public String data;

    @NameInMap("DeviceResource")
    public java.util.List<DeviceResourceDeviceResource> deviceResource;

    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    @NameInMap("DeviceResourceIds")
    public java.util.List<String> deviceResourceIds;

    @NameInMap("DownloadType")
    public String downloadType;

    @NameInMap("IpType")
    public String ipType;

    @NameInMap("ListType")
    public String listType;

    @NameInMap("LoopbackPort")
    public String loopbackPort;

    @NameInMap("NetLocation")
    public String netLocation;

    @NameInMap("SetupProjectId")
    public String setupProjectId;

    @NameInMap("Type")
    public String type;

    public static DeviceResource build(java.util.Map<String, ?> map) throws Exception {
        DeviceResource self = new DeviceResource();
        return TeaModel.build(map, self);
    }

    public DeviceResource setArchId(String archId) {
        this.archId = archId;
        return this;
    }
    public String getArchId() {
        return this.archId;
    }

    public DeviceResource setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public DeviceResource setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public DeviceResource setBusinessTypeParams(String businessTypeParams) {
        this.businessTypeParams = businessTypeParams;
        return this;
    }
    public String getBusinessTypeParams() {
        return this.businessTypeParams;
    }

    public DeviceResource setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DeviceResource setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeviceResource setDeviceResource(java.util.List<DeviceResourceDeviceResource> deviceResource) {
        this.deviceResource = deviceResource;
        return this;
    }
    public java.util.List<DeviceResourceDeviceResource> getDeviceResource() {
        return this.deviceResource;
    }

    public DeviceResource setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    public DeviceResource setDeviceResourceIds(java.util.List<String> deviceResourceIds) {
        this.deviceResourceIds = deviceResourceIds;
        return this;
    }
    public java.util.List<String> getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    public DeviceResource setDownloadType(String downloadType) {
        this.downloadType = downloadType;
        return this;
    }
    public String getDownloadType() {
        return this.downloadType;
    }

    public DeviceResource setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public DeviceResource setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public DeviceResource setLoopbackPort(String loopbackPort) {
        this.loopbackPort = loopbackPort;
        return this;
    }
    public String getLoopbackPort() {
        return this.loopbackPort;
    }

    public DeviceResource setNetLocation(String netLocation) {
        this.netLocation = netLocation;
        return this;
    }
    public String getNetLocation() {
        return this.netLocation;
    }

    public DeviceResource setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public DeviceResource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DeviceResourceDeviceResource extends TeaModel {
        @NameInMap("BlockNumber")
        public String blockNumber;

        @NameInMap("Business")
        public String business;

        @NameInMap("Config")
        public String config;

        @NameInMap("ConfigGenerate")
        public Boolean configGenerate;

        @NameInMap("ConfigTaskStatus")
        public String configTaskStatus;

        @NameInMap("DeliveryIp")
        public String deliveryIp;

        @NameInMap("DeviceNumber")
        public String deviceNumber;

        @NameInMap("DeviceResourceId")
        public String deviceResourceId;

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

        public static DeviceResourceDeviceResource build(java.util.Map<String, ?> map) throws Exception {
            DeviceResourceDeviceResource self = new DeviceResourceDeviceResource();
            return TeaModel.build(map, self);
        }

        public DeviceResourceDeviceResource setBlockNumber(String blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }
        public String getBlockNumber() {
            return this.blockNumber;
        }

        public DeviceResourceDeviceResource setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public DeviceResourceDeviceResource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DeviceResourceDeviceResource setConfigGenerate(Boolean configGenerate) {
            this.configGenerate = configGenerate;
            return this;
        }
        public Boolean getConfigGenerate() {
            return this.configGenerate;
        }

        public DeviceResourceDeviceResource setConfigTaskStatus(String configTaskStatus) {
            this.configTaskStatus = configTaskStatus;
            return this;
        }
        public String getConfigTaskStatus() {
            return this.configTaskStatus;
        }

        public DeviceResourceDeviceResource setDeliveryIp(String deliveryIp) {
            this.deliveryIp = deliveryIp;
            return this;
        }
        public String getDeliveryIp() {
            return this.deliveryIp;
        }

        public DeviceResourceDeviceResource setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public DeviceResourceDeviceResource setDeviceResourceId(String deviceResourceId) {
            this.deviceResourceId = deviceResourceId;
            return this;
        }
        public String getDeviceResourceId() {
            return this.deviceResourceId;
        }

        public DeviceResourceDeviceResource setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DeviceResourceDeviceResource setInterConnection(String interConnection) {
            this.interConnection = interConnection;
            return this;
        }
        public String getInterConnection() {
            return this.interConnection;
        }

        public DeviceResourceDeviceResource setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DeviceResourceDeviceResource setLoopback(String loopback) {
            this.loopback = loopback;
            return this;
        }
        public String getLoopback() {
            return this.loopback;
        }

        public DeviceResourceDeviceResource setManagerIp(String managerIp) {
            this.managerIp = managerIp;
            return this;
        }
        public String getManagerIp() {
            return this.managerIp;
        }

        public DeviceResourceDeviceResource setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DeviceResourceDeviceResource setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DeviceResourceDeviceResource setSetupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        public DeviceResourceDeviceResource setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public DeviceResourceDeviceResource setStack(Boolean stack) {
            this.stack = stack;
            return this;
        }
        public Boolean getStack() {
            return this.stack;
        }

        public DeviceResourceDeviceResource setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
