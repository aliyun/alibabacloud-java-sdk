// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetInstanceInfoResponse extends TeaModel {
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    @NameInMap("arch")
    public String arch;

    @NameInMap("clusterLabels")
    public java.util.Map<String, String> clusterLabels;

    @NameInMap("clusterTaints")
    public java.util.List<GetInstanceInfoResponseClusterTaints> clusterTaints;

    @NameInMap("cpu")
    public String cpu;

    @NameInMap("dataDisk")
    public java.util.List<Disk> dataDisk;

    @NameInMap("hostName")
    public String hostName;

    @NameInMap("identifier")
    public String identifier;

    @NameInMap("imageID")
    public String imageID;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("internetBandwidth")
    public Integer internetBandwidth;

    @NameInMap("kernel")
    public String kernel;

    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    @NameInMap("macAddress")
    public String macAddress;

    @NameInMap("memory")
    public String memory;

    @NameInMap("networkCards")
    public java.util.List<GetInstanceInfoResponseNetworkCards> networkCards;

    @NameInMap("os")
    public String os;

    @NameInMap("osVersion")
    public String osVersion;

    @NameInMap("privateIP")
    public String privateIP;

    @NameInMap("publicIP")
    public String publicIP;

    @NameInMap("rootPassword")
    public String rootPassword;

    @NameInMap("systemDisk")
    public java.util.List<Disk> systemDisk;

    @NameInMap("systemInfo")
    public String systemInfo;

    @NameInMap("taints")
    public java.util.List<GetInstanceInfoResponseTaints> taints;

    @NameInMap("uid")
    public String uid;

    public static GetInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInfoResponse self = new GetInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceInfoResponse setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    public GetInstanceInfoResponse setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public GetInstanceInfoResponse setClusterLabels(java.util.Map<String, String> clusterLabels) {
        this.clusterLabels = clusterLabels;
        return this;
    }
    public java.util.Map<String, String> getClusterLabels() {
        return this.clusterLabels;
    }

    public GetInstanceInfoResponse setClusterTaints(java.util.List<GetInstanceInfoResponseClusterTaints> clusterTaints) {
        this.clusterTaints = clusterTaints;
        return this;
    }
    public java.util.List<GetInstanceInfoResponseClusterTaints> getClusterTaints() {
        return this.clusterTaints;
    }

    public GetInstanceInfoResponse setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public GetInstanceInfoResponse setDataDisk(java.util.List<Disk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<Disk> getDataDisk() {
        return this.dataDisk;
    }

    public GetInstanceInfoResponse setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public GetInstanceInfoResponse setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public GetInstanceInfoResponse setImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }
    public String getImageID() {
        return this.imageID;
    }

    public GetInstanceInfoResponse setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public GetInstanceInfoResponse setInternetBandwidth(Integer internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
        return this;
    }
    public Integer getInternetBandwidth() {
        return this.internetBandwidth;
    }

    public GetInstanceInfoResponse setKernel(String kernel) {
        this.kernel = kernel;
        return this;
    }
    public String getKernel() {
        return this.kernel;
    }

    public GetInstanceInfoResponse setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public GetInstanceInfoResponse setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public GetInstanceInfoResponse setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public GetInstanceInfoResponse setNetworkCards(java.util.List<GetInstanceInfoResponseNetworkCards> networkCards) {
        this.networkCards = networkCards;
        return this;
    }
    public java.util.List<GetInstanceInfoResponseNetworkCards> getNetworkCards() {
        return this.networkCards;
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

    public GetInstanceInfoResponse setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

    public GetInstanceInfoResponse setSystemDisk(java.util.List<Disk> systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public java.util.List<Disk> getSystemDisk() {
        return this.systemDisk;
    }

    public GetInstanceInfoResponse setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public String getSystemInfo() {
        return this.systemInfo;
    }

    public GetInstanceInfoResponse setTaints(java.util.List<GetInstanceInfoResponseTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<GetInstanceInfoResponseTaints> getTaints() {
        return this.taints;
    }

    public GetInstanceInfoResponse setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class GetInstanceInfoResponseClusterTaints extends TeaModel {
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static GetInstanceInfoResponseClusterTaints build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInfoResponseClusterTaints self = new GetInstanceInfoResponseClusterTaints();
            return TeaModel.build(map, self);
        }

        public GetInstanceInfoResponseClusterTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public GetInstanceInfoResponseClusterTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceInfoResponseClusterTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceInfoResponseNetworkCards extends TeaModel {
        @NameInMap("ip")
        public String ip;

        @NameInMap("name")
        public String name;

        public static GetInstanceInfoResponseNetworkCards build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInfoResponseNetworkCards self = new GetInstanceInfoResponseNetworkCards();
            return TeaModel.build(map, self);
        }

        public GetInstanceInfoResponseNetworkCards setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetInstanceInfoResponseNetworkCards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetInstanceInfoResponseTaints extends TeaModel {
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static GetInstanceInfoResponseTaints build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInfoResponseTaints self = new GetInstanceInfoResponseTaints();
            return TeaModel.build(map, self);
        }

        public GetInstanceInfoResponseTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
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

    }

}
