// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class InstanceInfo extends TeaModel {
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
    public java.util.List<InstanceInfoNetworkCards> networkCards;

    // imageID
    @NameInMap("imageID")
    public String imageID;

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
    public java.util.List<InstanceInfoTaints> taints;

    // annotations
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    public static InstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        InstanceInfo self = new InstanceInfo();
        return TeaModel.build(map, self);
    }

    public InstanceInfo setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public InstanceInfo setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
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

    public InstanceInfo setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public InstanceInfo setKernel(String kernel) {
        this.kernel = kernel;
        return this;
    }
    public String getKernel() {
        return this.kernel;
    }

    public InstanceInfo setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public InstanceInfo setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public InstanceInfo setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public InstanceInfo setSystemDisk(java.util.List<Disk> systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public java.util.List<Disk> getSystemDisk() {
        return this.systemDisk;
    }

    public InstanceInfo setDataDisk(java.util.List<Disk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<Disk> getDataDisk() {
        return this.dataDisk;
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

    public InstanceInfo setInternetBandwidth(Integer internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
        return this;
    }
    public Integer getInternetBandwidth() {
        return this.internetBandwidth;
    }

    public InstanceInfo setNetworkCards(java.util.List<InstanceInfoNetworkCards> networkCards) {
        this.networkCards = networkCards;
        return this;
    }
    public java.util.List<InstanceInfoNetworkCards> getNetworkCards() {
        return this.networkCards;
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

    public InstanceInfo setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public String getSystemInfo() {
        return this.systemInfo;
    }

    public InstanceInfo setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

    public InstanceInfo setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public InstanceInfo setTaints(java.util.List<InstanceInfoTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<InstanceInfoTaints> getTaints() {
        return this.taints;
    }

    public InstanceInfo setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    public static class InstanceInfoNetworkCards extends TeaModel {
        // name
        @NameInMap("name")
        public String name;

        // ip
        @NameInMap("ip")
        public String ip;

        public static InstanceInfoNetworkCards build(java.util.Map<String, ?> map) throws Exception {
            InstanceInfoNetworkCards self = new InstanceInfoNetworkCards();
            return TeaModel.build(map, self);
        }

        public InstanceInfoNetworkCards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstanceInfoNetworkCards setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class InstanceInfoTaints extends TeaModel {
        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        // effect
        @NameInMap("effect")
        public String effect;

        public static InstanceInfoTaints build(java.util.Map<String, ?> map) throws Exception {
            InstanceInfoTaints self = new InstanceInfoTaints();
            return TeaModel.build(map, self);
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

        public InstanceInfoTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

    }

}
