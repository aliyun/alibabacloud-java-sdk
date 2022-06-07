// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class InstanceInfo extends TeaModel {
    // annotations
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    // arch
    @NameInMap("arch")
    public String arch;

    // clusterLabels
    @NameInMap("clusterLabels")
    public java.util.Map<String, String> clusterLabels;

    // clusterTaints
    @NameInMap("clusterTaints")
    public java.util.List<InstanceInfoClusterTaints> clusterTaints;

    // clusterUID
    @NameInMap("clusterUID")
    public String clusterUID;

    // cpu
    @NameInMap("cpu")
    public String cpu;

    // createdAt
    @NameInMap("createdAt")
    public String createdAt;

    // dataDisk
    @NameInMap("dataDisk")
    public java.util.List<Disk> dataDisk;

    // diskConfigAnnotations
    @NameInMap("diskConfigAnnotations")
    public java.util.Map<String, String> diskConfigAnnotations;

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
    public java.util.List<InstanceInfoNetworkCards> networkCards;

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
    public java.util.List<InstanceInfoTaints> taints;

    // uid
    @NameInMap("uid")
    public String uid;

    public static InstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        InstanceInfo self = new InstanceInfo();
        return TeaModel.build(map, self);
    }

    public InstanceInfo setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    public InstanceInfo setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public InstanceInfo setClusterLabels(java.util.Map<String, String> clusterLabels) {
        this.clusterLabels = clusterLabels;
        return this;
    }
    public java.util.Map<String, String> getClusterLabels() {
        return this.clusterLabels;
    }

    public InstanceInfo setClusterTaints(java.util.List<InstanceInfoClusterTaints> clusterTaints) {
        this.clusterTaints = clusterTaints;
        return this;
    }
    public java.util.List<InstanceInfoClusterTaints> getClusterTaints() {
        return this.clusterTaints;
    }

    public InstanceInfo setClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
        return this;
    }
    public String getClusterUID() {
        return this.clusterUID;
    }

    public InstanceInfo setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public InstanceInfo setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public InstanceInfo setDataDisk(java.util.List<Disk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<Disk> getDataDisk() {
        return this.dataDisk;
    }

    public InstanceInfo setDiskConfigAnnotations(java.util.Map<String, String> diskConfigAnnotations) {
        this.diskConfigAnnotations = diskConfigAnnotations;
        return this;
    }
    public java.util.Map<String, String> getDiskConfigAnnotations() {
        return this.diskConfigAnnotations;
    }

    public InstanceInfo setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public InstanceInfo setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public InstanceInfo setImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }
    public String getImageID() {
        return this.imageID;
    }

    public InstanceInfo setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public InstanceInfo setInternetBandwidth(Integer internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
        return this;
    }
    public Integer getInternetBandwidth() {
        return this.internetBandwidth;
    }

    public InstanceInfo setKernel(String kernel) {
        this.kernel = kernel;
        return this;
    }
    public String getKernel() {
        return this.kernel;
    }

    public InstanceInfo setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public InstanceInfo setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public InstanceInfo setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public InstanceInfo setNetworkCards(java.util.List<InstanceInfoNetworkCards> networkCards) {
        this.networkCards = networkCards;
        return this;
    }
    public java.util.List<InstanceInfoNetworkCards> getNetworkCards() {
        return this.networkCards;
    }

    public InstanceInfo setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public InstanceInfo setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public InstanceInfo setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public InstanceInfo setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public InstanceInfo setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

    public InstanceInfo setSystemDisk(java.util.List<Disk> systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public java.util.List<Disk> getSystemDisk() {
        return this.systemDisk;
    }

    public InstanceInfo setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public String getSystemInfo() {
        return this.systemInfo;
    }

    public InstanceInfo setTaints(java.util.List<InstanceInfoTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<InstanceInfoTaints> getTaints() {
        return this.taints;
    }

    public InstanceInfo setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class InstanceInfoClusterTaints extends TeaModel {
        // effect
        @NameInMap("effect")
        public String effect;

        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static InstanceInfoClusterTaints build(java.util.Map<String, ?> map) throws Exception {
            InstanceInfoClusterTaints self = new InstanceInfoClusterTaints();
            return TeaModel.build(map, self);
        }

        public InstanceInfoClusterTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public InstanceInfoClusterTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InstanceInfoClusterTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InstanceInfoNetworkCards extends TeaModel {
        // ip
        @NameInMap("ip")
        public String ip;

        // name
        @NameInMap("name")
        public String name;

        public static InstanceInfoNetworkCards build(java.util.Map<String, ?> map) throws Exception {
            InstanceInfoNetworkCards self = new InstanceInfoNetworkCards();
            return TeaModel.build(map, self);
        }

        public InstanceInfoNetworkCards setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public InstanceInfoNetworkCards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class InstanceInfoTaints extends TeaModel {
        // effect
        @NameInMap("effect")
        public String effect;

        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static InstanceInfoTaints build(java.util.Map<String, ?> map) throws Exception {
            InstanceInfoTaints self = new InstanceInfoTaints();
            return TeaModel.build(map, self);
        }

        public InstanceInfoTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public InstanceInfoTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InstanceInfoTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
