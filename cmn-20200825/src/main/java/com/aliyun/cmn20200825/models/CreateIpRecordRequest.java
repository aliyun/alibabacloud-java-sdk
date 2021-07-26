// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpRecordRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源名称
    @NameInMap("IpRecordName")
    public String ipRecordName;

    // 业务类型uuid
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    // 创建人
    @NameInMap("Creator")
    public String creator;

    // 设备列表
    @NameInMap("Device")
    public java.util.List<CreateIpRecordRequestDevice> device;

    // 工单类型 Apply 申请工单 Recycle 释放工单
    @NameInMap("RecordType")
    public String recordType;

    // IP地址列表
    @NameInMap("IpCode")
    public java.util.List<String> ipCode;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateIpRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpRecordRequest self = new CreateIpRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIpRecordRequest setIpRecordName(String ipRecordName) {
        this.ipRecordName = ipRecordName;
        return this;
    }
    public String getIpRecordName() {
        return this.ipRecordName;
    }

    public CreateIpRecordRequest setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public CreateIpRecordRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateIpRecordRequest setDevice(java.util.List<CreateIpRecordRequestDevice> device) {
        this.device = device;
        return this;
    }
    public java.util.List<CreateIpRecordRequestDevice> getDevice() {
        return this.device;
    }

    public CreateIpRecordRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public CreateIpRecordRequest setIpCode(java.util.List<String> ipCode) {
        this.ipCode = ipCode;
        return this;
    }
    public java.util.List<String> getIpCode() {
        return this.ipCode;
    }

    public CreateIpRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateIpRecordRequestDeviceZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static CreateIpRecordRequestDeviceZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            CreateIpRecordRequestDeviceZoneLayer self = new CreateIpRecordRequestDeviceZoneLayer();
            return TeaModel.build(map, self);
        }

        public CreateIpRecordRequestDeviceZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateIpRecordRequestDeviceZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateIpRecordRequestDevice extends TeaModel {
        // 设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        // 设备端口
        @NameInMap("Port")
        public String port;

        // 对端设备名称
        @NameInMap("RemoteDeviceName")
        public String remoteDeviceName;

        // 对端设备端口
        @NameInMap("RemotePort")
        public String remotePort;

        // 设备MAC
        @NameInMap("DeviceMac")
        public String deviceMac;

        // 园区层级
        @NameInMap("ZoneLayer")
        public java.util.List<CreateIpRecordRequestDeviceZoneLayer> zoneLayer;

        public static CreateIpRecordRequestDevice build(java.util.Map<String, ?> map) throws Exception {
            CreateIpRecordRequestDevice self = new CreateIpRecordRequestDevice();
            return TeaModel.build(map, self);
        }

        public CreateIpRecordRequestDevice setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public CreateIpRecordRequestDevice setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreateIpRecordRequestDevice setRemoteDeviceName(String remoteDeviceName) {
            this.remoteDeviceName = remoteDeviceName;
            return this;
        }
        public String getRemoteDeviceName() {
            return this.remoteDeviceName;
        }

        public CreateIpRecordRequestDevice setRemotePort(String remotePort) {
            this.remotePort = remotePort;
            return this;
        }
        public String getRemotePort() {
            return this.remotePort;
        }

        public CreateIpRecordRequestDevice setDeviceMac(String deviceMac) {
            this.deviceMac = deviceMac;
            return this;
        }
        public String getDeviceMac() {
            return this.deviceMac;
        }

        public CreateIpRecordRequestDevice setZoneLayer(java.util.List<CreateIpRecordRequestDeviceZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }
        public java.util.List<CreateIpRecordRequestDeviceZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

    }

}
