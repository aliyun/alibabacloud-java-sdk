// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentNodeResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEnvironmentNodeResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetEnvironmentNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentNodeResponseBody self = new GetEnvironmentNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnvironmentNodeResponseBody setData(GetEnvironmentNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentNodeResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentNodeResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetEnvironmentNodeResponseBodyDataNetworkCards extends TeaModel {
        // ip
        @NameInMap("ip")
        public String ip;

        // name
        @NameInMap("name")
        public String name;

        public static GetEnvironmentNodeResponseBodyDataNetworkCards build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentNodeResponseBodyDataNetworkCards self = new GetEnvironmentNodeResponseBodyDataNetworkCards();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentNodeResponseBodyDataNetworkCards setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetEnvironmentNodeResponseBodyDataNetworkCards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetEnvironmentNodeResponseBodyDataTaints extends TeaModel {
        // effect
        @NameInMap("effect")
        public String effect;

        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static GetEnvironmentNodeResponseBodyDataTaints build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentNodeResponseBodyDataTaints self = new GetEnvironmentNodeResponseBodyDataTaints();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentNodeResponseBodyDataTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public GetEnvironmentNodeResponseBodyDataTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetEnvironmentNodeResponseBodyDataTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEnvironmentNodeResponseBodyData extends TeaModel {
        // arch
        @NameInMap("arch")
        public String arch;

        @NameInMap("clusterUID")
        public String clusterUID;

        // cpu
        @NameInMap("cpu")
        public String cpu;

        @NameInMap("createdAt")
        public String createdAt;

        // dataDisk
        @NameInMap("dataDisk")
        public java.util.List<Disk> dataDisk;

        // hostName
        @NameInMap("hostName")
        public String hostName;

        // identifier
        @NameInMap("identifier")
        public String identifier;

        // imageID
        @NameInMap("imageID")
        public String imageID;

        // instanceType
        @NameInMap("instanceType")
        public String instanceType;

        // internetBandwidth
        @NameInMap("internetBandwidth")
        public Integer internetBandwidth;

        // kernel
        @NameInMap("kernel")
        public String kernel;

        // labels
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        // macAddress
        @NameInMap("macAddress")
        public String macAddress;

        // memory
        @NameInMap("memory")
        public String memory;

        // networkCards
        @NameInMap("networkCards")
        public java.util.List<GetEnvironmentNodeResponseBodyDataNetworkCards> networkCards;

        // os
        @NameInMap("os")
        public String os;

        // osVersion
        @NameInMap("osVersion")
        public String osVersion;

        // privateIP
        @NameInMap("privateIP")
        public String privateIP;

        // publicIP
        @NameInMap("publicIP")
        public String publicIP;

        // rootPassword
        @NameInMap("rootPassword")
        public String rootPassword;

        // systemDisk
        @NameInMap("systemDisk")
        public java.util.List<Disk> systemDisk;

        // systemInfo
        @NameInMap("systemInfo")
        public String systemInfo;

        // taints
        @NameInMap("taints")
        public java.util.List<GetEnvironmentNodeResponseBodyDataTaints> taints;

        @NameInMap("uid")
        public String uid;

        public static GetEnvironmentNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentNodeResponseBodyData self = new GetEnvironmentNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentNodeResponseBodyData setArch(String arch) {
            this.arch = arch;
            return this;
        }
        public String getArch() {
            return this.arch;
        }

        public GetEnvironmentNodeResponseBodyData setClusterUID(String clusterUID) {
            this.clusterUID = clusterUID;
            return this;
        }
        public String getClusterUID() {
            return this.clusterUID;
        }

        public GetEnvironmentNodeResponseBodyData setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public GetEnvironmentNodeResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetEnvironmentNodeResponseBodyData setDataDisk(java.util.List<Disk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<Disk> getDataDisk() {
            return this.dataDisk;
        }

        public GetEnvironmentNodeResponseBodyData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetEnvironmentNodeResponseBodyData setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetEnvironmentNodeResponseBodyData setImageID(String imageID) {
            this.imageID = imageID;
            return this;
        }
        public String getImageID() {
            return this.imageID;
        }

        public GetEnvironmentNodeResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetEnvironmentNodeResponseBodyData setInternetBandwidth(Integer internetBandwidth) {
            this.internetBandwidth = internetBandwidth;
            return this;
        }
        public Integer getInternetBandwidth() {
            return this.internetBandwidth;
        }

        public GetEnvironmentNodeResponseBodyData setKernel(String kernel) {
            this.kernel = kernel;
            return this;
        }
        public String getKernel() {
            return this.kernel;
        }

        public GetEnvironmentNodeResponseBodyData setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public GetEnvironmentNodeResponseBodyData setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public GetEnvironmentNodeResponseBodyData setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetEnvironmentNodeResponseBodyData setNetworkCards(java.util.List<GetEnvironmentNodeResponseBodyDataNetworkCards> networkCards) {
            this.networkCards = networkCards;
            return this;
        }
        public java.util.List<GetEnvironmentNodeResponseBodyDataNetworkCards> getNetworkCards() {
            return this.networkCards;
        }

        public GetEnvironmentNodeResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public GetEnvironmentNodeResponseBodyData setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public GetEnvironmentNodeResponseBodyData setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public GetEnvironmentNodeResponseBodyData setPublicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }
        public String getPublicIP() {
            return this.publicIP;
        }

        public GetEnvironmentNodeResponseBodyData setRootPassword(String rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }
        public String getRootPassword() {
            return this.rootPassword;
        }

        public GetEnvironmentNodeResponseBodyData setSystemDisk(java.util.List<Disk> systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public java.util.List<Disk> getSystemDisk() {
            return this.systemDisk;
        }

        public GetEnvironmentNodeResponseBodyData setSystemInfo(String systemInfo) {
            this.systemInfo = systemInfo;
            return this;
        }
        public String getSystemInfo() {
            return this.systemInfo;
        }

        public GetEnvironmentNodeResponseBodyData setTaints(java.util.List<GetEnvironmentNodeResponseBodyDataTaints> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<GetEnvironmentNodeResponseBodyDataTaints> getTaints() {
            return this.taints;
        }

        public GetEnvironmentNodeResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
