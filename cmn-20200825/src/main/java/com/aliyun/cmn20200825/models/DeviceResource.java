// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeviceResource extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 资源一级ID
    @NameInMap("DeviceResourceIds")
    public java.util.List<String> deviceResourceIds;

    // 设备资源id
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    // 建设项目id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 操作类型
    @NameInMap("Type")
    public String type;

    // 更新数据
    @NameInMap("Data")
    public String data;

    // 操作类型
    @NameInMap("DownloadType")
    public String downloadType;

    // 业务类型
    @NameInMap("BusinessType")
    public String businessType;

    // list类型
    @NameInMap("ListType")
    public String listType;

    // 架构资源ID
    @NameInMap("ArchId")
    public String archId;

    // 设备资源
    @NameInMap("DeviceResource")
    public java.util.List<DeviceResourceDeviceResource> deviceResource;

    // ip类型
    @NameInMap("IpType")
    public String ipType;

    // 位置
    @NameInMap("NetLocation")
    public String netLocation;

    // 业务参数
    @NameInMap("BusinessTypeParams")
    public String businessTypeParams;

    // Loopback口
    @NameInMap("LoopbackPort")
    public String loopbackPort;

    // 业务类型id
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    public static DeviceResource build(java.util.Map<String, ?> map) throws Exception {
        DeviceResource self = new DeviceResource();
        return TeaModel.build(map, self);
    }

    public DeviceResource setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DeviceResource setDeviceResourceIds(java.util.List<String> deviceResourceIds) {
        this.deviceResourceIds = deviceResourceIds;
        return this;
    }
    public java.util.List<String> getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    public DeviceResource setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
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

    public DeviceResource setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeviceResource setDownloadType(String downloadType) {
        this.downloadType = downloadType;
        return this;
    }
    public String getDownloadType() {
        return this.downloadType;
    }

    public DeviceResource setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public DeviceResource setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public DeviceResource setArchId(String archId) {
        this.archId = archId;
        return this;
    }
    public String getArchId() {
        return this.archId;
    }

    public DeviceResource setDeviceResource(java.util.List<DeviceResourceDeviceResource> deviceResource) {
        this.deviceResource = deviceResource;
        return this;
    }
    public java.util.List<DeviceResourceDeviceResource> getDeviceResource() {
        return this.deviceResource;
    }

    public DeviceResource setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public DeviceResource setNetLocation(String netLocation) {
        this.netLocation = netLocation;
        return this;
    }
    public String getNetLocation() {
        return this.netLocation;
    }

    public DeviceResource setBusinessTypeParams(String businessTypeParams) {
        this.businessTypeParams = businessTypeParams;
        return this;
    }
    public String getBusinessTypeParams() {
        return this.businessTypeParams;
    }

    public DeviceResource setLoopbackPort(String loopbackPort) {
        this.loopbackPort = loopbackPort;
        return this;
    }
    public String getLoopbackPort() {
        return this.loopbackPort;
    }

    public DeviceResource setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public static class DeviceResourceDeviceResource extends TeaModel {
        // 设备资源ID
        @NameInMap("DeviceResourceId")
        public String deviceResourceId;

        // 建设项目id
        @NameInMap("SetupProjectId")
        public String setupProjectId;

        // 角色
        @NameInMap("Role")
        public String role;

        // 组号
        @NameInMap("BlockNumber")
        public String blockNumber;

        // 设备号
        @NameInMap("DeviceNumber")
        public String deviceNumber;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 模型
        @NameInMap("Model")
        public String model;

        // 主机名
        @NameInMap("HostName")
        public String hostName;

        // 设备sn号
        @NameInMap("Sn")
        public String sn;

        // 物理空间位置
        @NameInMap("Location")
        public String location;

        // 带内管理地址
        @NameInMap("ManagerIp")
        public String managerIp;

        // 交付登录地址
        @NameInMap("DeliveryIp")
        public String deliveryIp;

        // 配置生成
        @NameInMap("ConfigGenerate")
        public Boolean configGenerate;

        // 配置下发状态
        @NameInMap("ConfigTaskStatus")
        public String configTaskStatus;

        // 设备配置
        @NameInMap("Config")
        public String config;

        // loopback地址
        @NameInMap("Loopback")
        public String loopback;

        // 设备互联地址
        @NameInMap("InterConnection")
        public String interConnection;

        // 设备业务地址
        @NameInMap("Business")
        public String business;

        // 堆叠状态
        @NameInMap("Stack")
        public Boolean stack;

        public static DeviceResourceDeviceResource build(java.util.Map<String, ?> map) throws Exception {
            DeviceResourceDeviceResource self = new DeviceResourceDeviceResource();
            return TeaModel.build(map, self);
        }

        public DeviceResourceDeviceResource setDeviceResourceId(String deviceResourceId) {
            this.deviceResourceId = deviceResourceId;
            return this;
        }
        public String getDeviceResourceId() {
            return this.deviceResourceId;
        }

        public DeviceResourceDeviceResource setSetupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        public DeviceResourceDeviceResource setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DeviceResourceDeviceResource setBlockNumber(String blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }
        public String getBlockNumber() {
            return this.blockNumber;
        }

        public DeviceResourceDeviceResource setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public DeviceResourceDeviceResource setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DeviceResourceDeviceResource setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DeviceResourceDeviceResource setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DeviceResourceDeviceResource setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public DeviceResourceDeviceResource setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DeviceResourceDeviceResource setManagerIp(String managerIp) {
            this.managerIp = managerIp;
            return this;
        }
        public String getManagerIp() {
            return this.managerIp;
        }

        public DeviceResourceDeviceResource setDeliveryIp(String deliveryIp) {
            this.deliveryIp = deliveryIp;
            return this;
        }
        public String getDeliveryIp() {
            return this.deliveryIp;
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

        public DeviceResourceDeviceResource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DeviceResourceDeviceResource setLoopback(String loopback) {
            this.loopback = loopback;
            return this;
        }
        public String getLoopback() {
            return this.loopback;
        }

        public DeviceResourceDeviceResource setInterConnection(String interConnection) {
            this.interConnection = interConnection;
            return this;
        }
        public String getInterConnection() {
            return this.interConnection;
        }

        public DeviceResourceDeviceResource setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public DeviceResourceDeviceResource setStack(Boolean stack) {
            this.stack = stack;
            return this;
        }
        public Boolean getStack() {
            return this.stack;
        }

    }

}
