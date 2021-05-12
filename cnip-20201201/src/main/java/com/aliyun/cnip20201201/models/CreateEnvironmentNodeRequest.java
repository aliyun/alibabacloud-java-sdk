// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentNodeRequest extends TeaModel {
    @NameInMap("cpu")
    public Integer cpu;

    @NameInMap("dataDisk")
    public java.util.List<CreateEnvironmentNodeRequestDataDisk> dataDisk;

    @NameInMap("hostName")
    public String hostName;

    @NameInMap("identifier")
    public String identifier;

    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    @NameInMap("memory")
    public Integer memory;

    @NameInMap("os")
    public String os;

    @NameInMap("privateIP")
    public String privateIP;

    @NameInMap("provider")
    public String provider;

    @NameInMap("rootPassword")
    public String rootPassword;

    @NameInMap("systemDisk")
    public java.util.List<CreateEnvironmentNodeRequestSystemDisk> systemDisk;

    @NameInMap("taints")
    public java.util.List<CreateEnvironmentNodeRequestTaints> taints;

    public static CreateEnvironmentNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentNodeRequest self = new CreateEnvironmentNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentNodeRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateEnvironmentNodeRequest setDataDisk(java.util.List<CreateEnvironmentNodeRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateEnvironmentNodeRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateEnvironmentNodeRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateEnvironmentNodeRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateEnvironmentNodeRequest setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public CreateEnvironmentNodeRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateEnvironmentNodeRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public CreateEnvironmentNodeRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public CreateEnvironmentNodeRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateEnvironmentNodeRequest setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

    public CreateEnvironmentNodeRequest setSystemDisk(java.util.List<CreateEnvironmentNodeRequestSystemDisk> systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public java.util.List<CreateEnvironmentNodeRequestSystemDisk> getSystemDisk() {
        return this.systemDisk;
    }

    public CreateEnvironmentNodeRequest setTaints(java.util.List<CreateEnvironmentNodeRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<CreateEnvironmentNodeRequestTaints> getTaints() {
        return this.taints;
    }

    public static class CreateEnvironmentNodeRequestDataDisk extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("required")
        public Integer required;

        public static CreateEnvironmentNodeRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentNodeRequestDataDisk self = new CreateEnvironmentNodeRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentNodeRequestDataDisk setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEnvironmentNodeRequestDataDisk setRequired(Integer required) {
            this.required = required;
            return this;
        }
        public Integer getRequired() {
            return this.required;
        }

    }

    public static class CreateEnvironmentNodeRequestSystemDisk extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("required")
        public Integer required;

        public static CreateEnvironmentNodeRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentNodeRequestSystemDisk self = new CreateEnvironmentNodeRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentNodeRequestSystemDisk setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEnvironmentNodeRequestSystemDisk setRequired(Integer required) {
            this.required = required;
            return this;
        }
        public Integer getRequired() {
            return this.required;
        }

    }

    public static class CreateEnvironmentNodeRequestTaints extends TeaModel {
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static CreateEnvironmentNodeRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentNodeRequestTaints self = new CreateEnvironmentNodeRequestTaints();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentNodeRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public CreateEnvironmentNodeRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEnvironmentNodeRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
