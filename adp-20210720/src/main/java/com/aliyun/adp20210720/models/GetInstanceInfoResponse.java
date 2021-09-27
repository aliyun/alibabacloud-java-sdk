// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetInstanceInfoResponse extends TeaModel {
    // identifier
    @NameInMap("identifier")
    public String identifier;

    // hostName
    @NameInMap("hostName")
    public String hostName;

    // os
    @NameInMap("os")
    public String os;

    // osVersion
    @NameInMap("osVersion")
    public String osVersion;

    // arch
    @NameInMap("arch")
    public String arch;

    // kernel
    @NameInMap("kernel")
    public String kernel;

    // macAddress
    @NameInMap("macAddress")
    public String macAddress;

    // cpu
    @NameInMap("cpu")
    public String cpu;

    // memory
    @NameInMap("memory")
    public String memory;

    // systemDisk
    @NameInMap("systemDisk")
    public java.util.List<Disk> systemDisk;

    // dataDisk
    @NameInMap("dataDisk")
    public java.util.List<Disk> dataDisk;

    // privateIP
    @NameInMap("privateIP")
    public String privateIP;

    // publicIP
    @NameInMap("publicIP")
    public String publicIP;

    // internetBandwidth
    @NameInMap("internetBandwidth")
    public Integer internetBandwidth;

    // networkCards
    @NameInMap("networkCards")
    public java.util.List<GetInstanceInfoResponseNetworkCards> networkCards;

    // imageID
    @NameInMap("imageID")
    public String imageID;

    // uid
    @NameInMap("uid")
    public String uid;

    // instanceType
    @NameInMap("instanceType")
    public String instanceType;

    // systemInfo
    @NameInMap("systemInfo")
    public String systemInfo;

    // rootPassword
    @NameInMap("rootPassword")
    public String rootPassword;

    // labels
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    // taints
    @NameInMap("taints")
    public java.util.List<GetInstanceInfoResponseTaints> taints;

    // annotations
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    public static GetInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInfoResponse self = new GetInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceInfoResponse setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public GetInstanceInfoResponse setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public GetInstanceInfoResponse setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetInstanceInfoResponse setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public GetInstanceInfoResponse setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public GetInstanceInfoResponse setKernel(String kernel) {
        this.kernel = kernel;
        return this;
    }
    public String getKernel() {
        return this.kernel;
    }

    public GetInstanceInfoResponse setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public GetInstanceInfoResponse setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public GetInstanceInfoResponse setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public GetInstanceInfoResponse setSystemDisk(java.util.List<Disk> systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public java.util.List<Disk> getSystemDisk() {
        return this.systemDisk;
    }

    public GetInstanceInfoResponse setDataDisk(java.util.List<Disk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<Disk> getDataDisk() {
        return this.dataDisk;
    }

    public GetInstanceInfoResponse setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public GetInstanceInfoResponse setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public GetInstanceInfoResponse setInternetBandwidth(Integer internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
        return this;
    }
    public Integer getInternetBandwidth() {
        return this.internetBandwidth;
    }

    public GetInstanceInfoResponse setNetworkCards(java.util.List<GetInstanceInfoResponseNetworkCards> networkCards) {
        this.networkCards = networkCards;
        return this;
    }
    public java.util.List<GetInstanceInfoResponseNetworkCards> getNetworkCards() {
        return this.networkCards;
    }

    public GetInstanceInfoResponse setImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }
    public String getImageID() {
        return this.imageID;
    }

    public GetInstanceInfoResponse setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetInstanceInfoResponse setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public GetInstanceInfoResponse setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public String getSystemInfo() {
        return this.systemInfo;
    }

    public GetInstanceInfoResponse setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

    public GetInstanceInfoResponse setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public GetInstanceInfoResponse setTaints(java.util.List<GetInstanceInfoResponseTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<GetInstanceInfoResponseTaints> getTaints() {
        return this.taints;
    }

    public GetInstanceInfoResponse setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    public static class GetInstanceInfoResponseNetworkCards extends TeaModel {
        // name
        @NameInMap("name")
        public String name;

        // ip
        @NameInMap("ip")
        public String ip;

        public static GetInstanceInfoResponseNetworkCards build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInfoResponseNetworkCards self = new GetInstanceInfoResponseNetworkCards();
            return TeaModel.build(map, self);
        }

        public GetInstanceInfoResponseNetworkCards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInfoResponseNetworkCards setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class GetInstanceInfoResponseTaints extends TeaModel {
        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        // effect
        @NameInMap("effect")
        public String effect;

        public static GetInstanceInfoResponseTaints build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInfoResponseTaints self = new GetInstanceInfoResponseTaints();
            return TeaModel.build(map, self);
        }

        public GetInstanceInfoResponseTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceInfoResponseTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetInstanceInfoResponseTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

    }

}
