// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDeviceServiceResponseBody extends TeaModel {
    /**
     * <p>The basic properties of the application.</p>
     */
    @NameInMap("AppMetaData")
    public DescribeDeviceServiceResponseBodyAppMetaData appMetaData;

    /**
     * <p>The status information of the application.</p>
     */
    @NameInMap("AppStatus")
    public DescribeDeviceServiceResponseBodyAppStatus appStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the devices.</p>
     */
    @NameInMap("ResourceDetailInfos")
    public java.util.List<DescribeDeviceServiceResponseBodyResourceDetailInfos> resourceDetailInfos;

    /**
     * <p>The information about the instances.</p>
     */
    @NameInMap("ResourceInfos")
    public java.util.List<DescribeDeviceServiceResponseBodyResourceInfos> resourceInfos;

    public static DescribeDeviceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceServiceResponseBody self = new DescribeDeviceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceServiceResponseBody setAppMetaData(DescribeDeviceServiceResponseBodyAppMetaData appMetaData) {
        this.appMetaData = appMetaData;
        return this;
    }
    public DescribeDeviceServiceResponseBodyAppMetaData getAppMetaData() {
        return this.appMetaData;
    }

    public DescribeDeviceServiceResponseBody setAppStatus(DescribeDeviceServiceResponseBodyAppStatus appStatus) {
        this.appStatus = appStatus;
        return this;
    }
    public DescribeDeviceServiceResponseBodyAppStatus getAppStatus() {
        return this.appStatus;
    }

    public DescribeDeviceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceServiceResponseBody setResourceDetailInfos(java.util.List<DescribeDeviceServiceResponseBodyResourceDetailInfos> resourceDetailInfos) {
        this.resourceDetailInfos = resourceDetailInfos;
        return this;
    }
    public java.util.List<DescribeDeviceServiceResponseBodyResourceDetailInfos> getResourceDetailInfos() {
        return this.resourceDetailInfos;
    }

    public DescribeDeviceServiceResponseBody setResourceInfos(java.util.List<DescribeDeviceServiceResponseBodyResourceInfos> resourceInfos) {
        this.resourceInfos = resourceInfos;
        return this;
    }
    public java.util.List<DescribeDeviceServiceResponseBodyResourceInfos> getResourceInfos() {
        return this.resourceInfos;
    }

    public static class DescribeDeviceServiceResponseBodyAppMetaData extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The stable version number of the application.</p>
         */
        @NameInMap("AppStableVersion")
        public String appStableVersion;

        /**
         * <p>The type of the application. The value is of the enumeration type. Valid values:</p>
         * <br>
         * <p>*   Common</p>
         * <p>*   Scheduler</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The name of the application cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The time when the application was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("Description")
        public String description;

        public static DescribeDeviceServiceResponseBodyAppMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceServiceResponseBodyAppMetaData self = new DescribeDeviceServiceResponseBodyAppMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceServiceResponseBodyAppMetaData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeDeviceServiceResponseBodyAppMetaData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeDeviceServiceResponseBodyAppMetaData setAppStableVersion(String appStableVersion) {
            this.appStableVersion = appStableVersion;
            return this;
        }
        public String getAppStableVersion() {
            return this.appStableVersion;
        }

        public DescribeDeviceServiceResponseBodyAppMetaData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public DescribeDeviceServiceResponseBodyAppMetaData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeDeviceServiceResponseBodyAppMetaData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDeviceServiceResponseBodyAppMetaData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeDeviceServiceResponseBodyAppStatus extends TeaModel {
        /**
         * <p>The status of the application. The value is of the enumeration type. Valid values:</p>
         * <br>
         * <p>Three intermediate states:</p>
         * <br>
         * <p>*   CREATING</p>
         * <p>*   UPDATING</p>
         * <p>*   DELETING</p>
         * <br>
         * <p>Four final states:</p>
         * <br>
         * <p>*   CREATE_FAILED</p>
         * <p>*   UPDATE_FAILED</p>
         * <p>*   DELETE_FAILED</p>
         * <p>*   RUNNING</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The description of the application status.</p>
         */
        @NameInMap("StatusDescrip")
        public String statusDescrip;

        /**
         * <p>The time when the status was last updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDeviceServiceResponseBodyAppStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceServiceResponseBodyAppStatus self = new DescribeDeviceServiceResponseBodyAppStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceServiceResponseBodyAppStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public DescribeDeviceServiceResponseBodyAppStatus setStatusDescrip(String statusDescrip) {
            this.statusDescrip = statusDescrip;
            return this;
        }
        public String getStatusDescrip() {
            return this.statusDescrip;
        }

        public DescribeDeviceServiceResponseBodyAppStatus setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeDeviceServiceResponseBodyResourceDetailInfos extends TeaModel {
        /**
         * <p>The name of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the cloud device.</p>
         */
        @NameInMap("ID")
        public String ID;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The Internet service provider (ISP).</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageID")
        public String imageID;

        /**
         * <p>The media access control (MAC) address of the device.</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The ID of the ENS node.</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>The server name of the ENS node.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The status of the device.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the device.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDeviceServiceResponseBodyResourceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceServiceResponseBodyResourceDetailInfos self = new DescribeDeviceServiceResponseBodyResourceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setImageID(String imageID) {
            this.imageID = imageID;
            return this;
        }
        public String getImageID() {
            return this.imageID;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork extends TeaModel {
        /**
         * <p>The port of the container.</p>
         */
        @NameInMap("ContainerPorts")
        public String containerPorts;

        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("ExternalIp")
        public String externalIp;

        /**
         * <p>The port range.</p>
         */
        @NameInMap("HostPorts")
        public String hostPorts;

        /**
         * <p>The protocol of the gateway. The value is of the enumeration type. Valid values:</p>
         * <br>
         * <p>*   TCP</p>
         * <p>*   UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork self = new DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork setContainerPorts(String containerPorts) {
            this.containerPorts = containerPorts;
            return this;
        }
        public String getContainerPorts() {
            return this.containerPorts;
        }

        public DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork setHostPorts(String hostPorts) {
            this.hostPorts = hostPorts;
            return this;
        }
        public String getHostPorts() {
            return this.hostPorts;
        }

        public DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos extends TeaModel {
        /**
         * <p>The name of the device.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network information.</p>
         */
        @NameInMap("Network")
        public java.util.List<DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork> network;

        /**
         * <p>The status.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos self = new DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos setNetwork(java.util.List<DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork> network) {
            this.network = network;
            return this;
        }
        public java.util.List<DescribeDeviceServiceResponseBodyResourceInfosDeviceInfosNetwork> getNetwork() {
            return this.network;
        }

        public DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDeviceServiceResponseBodyResourceInfosInternalIps extends TeaModel {
        /**
         * <p>The internal IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeDeviceServiceResponseBodyResourceInfosInternalIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceServiceResponseBodyResourceInfosInternalIps self = new DescribeDeviceServiceResponseBodyResourceInfosInternalIps();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceServiceResponseBodyResourceInfosInternalIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeDeviceServiceResponseBodyResourceInfosPublicIps extends TeaModel {
        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeDeviceServiceResponseBodyResourceInfosPublicIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceServiceResponseBodyResourceInfosPublicIps self = new DescribeDeviceServiceResponseBodyResourceInfosPublicIps();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceServiceResponseBodyResourceInfosPublicIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeDeviceServiceResponseBodyResourceInfos extends TeaModel {
        /**
         * <p>The version of the application.</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The area code.</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>The region name.</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The time when the application was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The information about the devices.</p>
         */
        @NameInMap("DeviceInfos")
        public java.util.List<DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos> deviceInfos;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the instance.</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The internal IP addresses.</p>
         */
        @NameInMap("InternalIps")
        public java.util.List<DescribeDeviceServiceResponseBodyResourceInfosInternalIps> internalIps;

        /**
         * <p>The public IP addresses.</p>
         */
        @NameInMap("PublicIps")
        public java.util.List<DescribeDeviceServiceResponseBodyResourceInfosPublicIps> publicIps;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionCode")
        public String regionCode;

        /**
         * <p>The ID of the ENS node.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static DescribeDeviceServiceResponseBodyResourceInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceServiceResponseBodyResourceInfos self = new DescribeDeviceServiceResponseBodyResourceInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setDeviceInfos(java.util.List<DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos> deviceInfos) {
            this.deviceInfos = deviceInfos;
            return this;
        }
        public java.util.List<DescribeDeviceServiceResponseBodyResourceInfosDeviceInfos> getDeviceInfos() {
            return this.deviceInfos;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setInternalIps(java.util.List<DescribeDeviceServiceResponseBodyResourceInfosInternalIps> internalIps) {
            this.internalIps = internalIps;
            return this;
        }
        public java.util.List<DescribeDeviceServiceResponseBodyResourceInfosInternalIps> getInternalIps() {
            return this.internalIps;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setPublicIps(java.util.List<DescribeDeviceServiceResponseBodyResourceInfosPublicIps> publicIps) {
            this.publicIps = publicIps;
            return this;
        }
        public java.util.List<DescribeDeviceServiceResponseBodyResourceInfosPublicIps> getPublicIps() {
            return this.publicIps;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDeviceServiceResponseBodyResourceInfos setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
