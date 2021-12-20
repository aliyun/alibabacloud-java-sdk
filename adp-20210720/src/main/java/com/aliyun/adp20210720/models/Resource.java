// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    // cpu
    @NameInMap("cpu")
    public ResourceCpu cpu;

    // 实例hostname
    @NameInMap("hostname")
    public String hostname;

    // 资源分组名
    @NameInMap("identifier")
    public String identifier;

    // 镜像
    @NameInMap("image")
    public ResourceImage image;

    // 实例类型
    @NameInMap("instanceType")
    public String instanceType;

    // memory
    @NameInMap("memory")
    public ResourceMemory memory;

    // 需要开放的端口
    @NameInMap("ports")
    public java.util.List<ExportPort> ports;

    // 公网IP 需求
    @NameInMap("publicIP")
    public ResourcePublicIP publicIP;

    // 数量
    @NameInMap("replica")
    public Integer replica;

    // 存储需求
    @NameInMap("storage")
    public java.util.List<ResourceStorage> storage;

    public static Resource build(java.util.Map<String, ?> map) throws Exception {
        Resource self = new Resource();
        return TeaModel.build(map, self);
    }

    public Resource setCpu(ResourceCpu cpu) {
        this.cpu = cpu;
        return this;
    }
    public ResourceCpu getCpu() {
        return this.cpu;
    }

    public Resource setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public Resource setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public Resource setImage(ResourceImage image) {
        this.image = image;
        return this;
    }
    public ResourceImage getImage() {
        return this.image;
    }

    public Resource setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public Resource setMemory(ResourceMemory memory) {
        this.memory = memory;
        return this;
    }
    public ResourceMemory getMemory() {
        return this.memory;
    }

    public Resource setPorts(java.util.List<ExportPort> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<ExportPort> getPorts() {
        return this.ports;
    }

    public Resource setPublicIP(ResourcePublicIP publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public ResourcePublicIP getPublicIP() {
        return this.publicIP;
    }

    public Resource setReplica(Integer replica) {
        this.replica = replica;
        return this;
    }
    public Integer getReplica() {
        return this.replica;
    }

    public Resource setStorage(java.util.List<ResourceStorage> storage) {
        this.storage = storage;
        return this;
    }
    public java.util.List<ResourceStorage> getStorage() {
        return this.storage;
    }

    public static class ResourceCpu extends TeaModel {
        // 需要的数量
        @NameInMap("required")
        public Integer required;

        public static ResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            ResourceCpu self = new ResourceCpu();
            return TeaModel.build(map, self);
        }

        public ResourceCpu setRequired(Integer required) {
            this.required = required;
            return this;
        }
        public Integer getRequired() {
            return this.required;
        }

    }

    public static class ResourceImage extends TeaModel {
        // image id
        @NameInMap("id")
        public String id;

        // 名称正则
        @NameInMap("nameRegex")
        public String nameRegex;

        public static ResourceImage build(java.util.Map<String, ?> map) throws Exception {
            ResourceImage self = new ResourceImage();
            return TeaModel.build(map, self);
        }

        public ResourceImage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ResourceImage setNameRegex(String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public String getNameRegex() {
            return this.nameRegex;
        }

    }

    public static class ResourceMemory extends TeaModel {
        // 需要的内存，单位 G
        @NameInMap("required")
        public Integer required;

        public static ResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            ResourceMemory self = new ResourceMemory();
            return TeaModel.build(map, self);
        }

        public ResourceMemory setRequired(Integer required) {
            this.required = required;
            return this;
        }
        public Integer getRequired() {
            return this.required;
        }

    }

    public static class ResourcePublicIP extends TeaModel {
        // 带宽
        @NameInMap("bandwidth")
        public Integer bandwidth;

        // 需要的数量
        @NameInMap("required")
        public Integer required;

        public static ResourcePublicIP build(java.util.Map<String, ?> map) throws Exception {
            ResourcePublicIP self = new ResourcePublicIP();
            return TeaModel.build(map, self);
        }

        public ResourcePublicIP setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ResourcePublicIP setRequired(Integer required) {
            this.required = required;
            return this;
        }
        public Integer getRequired() {
            return this.required;
        }

    }

    public static class ResourceStorage extends TeaModel {
        // 磁盘大小
        @NameInMap("required")
        public Integer required;

        public static ResourceStorage build(java.util.Map<String, ?> map) throws Exception {
            ResourceStorage self = new ResourceStorage();
            return TeaModel.build(map, self);
        }

        public ResourceStorage setRequired(Integer required) {
            this.required = required;
            return this;
        }
        public Integer getRequired() {
            return this.required;
        }

    }

}
