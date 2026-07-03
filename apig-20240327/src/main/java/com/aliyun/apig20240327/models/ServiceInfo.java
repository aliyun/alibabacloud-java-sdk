// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ServiceInfo extends TeaModel {
    @NameInMap("expressType")
    public String expressType;

    @NameInMap("groupName")
    public String groupName;

    @NameInMap("name")
    public String name;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("paiWorkspaceId")
    public String paiWorkspaceId;

    @NameInMap("paiWorkspaceName")
    public String paiWorkspaceName;

    @NameInMap("ports")
    public java.util.List<ServiceInfoPorts> ports;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("serviceId")
    public String serviceId;

    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("status")
    public String status;

    @NameInMap("versions")
    public java.util.List<ServiceInfoVersions> versions;

    public static ServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        ServiceInfo self = new ServiceInfo();
        return TeaModel.build(map, self);
    }

    public ServiceInfo setExpressType(String expressType) {
        this.expressType = expressType;
        return this;
    }
    public String getExpressType() {
        return this.expressType;
    }

    public ServiceInfo setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ServiceInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ServiceInfo setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ServiceInfo setPaiWorkspaceId(String paiWorkspaceId) {
        this.paiWorkspaceId = paiWorkspaceId;
        return this;
    }
    public String getPaiWorkspaceId() {
        return this.paiWorkspaceId;
    }

    public ServiceInfo setPaiWorkspaceName(String paiWorkspaceName) {
        this.paiWorkspaceName = paiWorkspaceName;
        return this;
    }
    public String getPaiWorkspaceName() {
        return this.paiWorkspaceName;
    }

    public ServiceInfo setPorts(java.util.List<ServiceInfoPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<ServiceInfoPorts> getPorts() {
        return this.ports;
    }

    public ServiceInfo setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ServiceInfo setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ServiceInfo setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ServiceInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ServiceInfo setVersions(java.util.List<ServiceInfoVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ServiceInfoVersions> getVersions() {
        return this.versions;
    }

    public static class ServiceInfoPorts extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("port")
        public Integer port;

        @NameInMap("protocol")
        public String protocol;

        public static ServiceInfoPorts build(java.util.Map<String, ?> map) throws Exception {
            ServiceInfoPorts self = new ServiceInfoPorts();
            return TeaModel.build(map, self);
        }

        public ServiceInfoPorts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ServiceInfoPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ServiceInfoPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ServiceInfoVersionsLabels extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ServiceInfoVersionsLabels build(java.util.Map<String, ?> map) throws Exception {
            ServiceInfoVersionsLabels self = new ServiceInfoVersionsLabels();
            return TeaModel.build(map, self);
        }

        public ServiceInfoVersionsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ServiceInfoVersionsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ServiceInfoVersions extends TeaModel {
        @NameInMap("labels")
        public java.util.List<ServiceInfoVersionsLabels> labels;

        @NameInMap("name")
        public String name;

        public static ServiceInfoVersions build(java.util.Map<String, ?> map) throws Exception {
            ServiceInfoVersions self = new ServiceInfoVersions();
            return TeaModel.build(map, self);
        }

        public ServiceInfoVersions setLabels(java.util.List<ServiceInfoVersionsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ServiceInfoVersionsLabels> getLabels() {
            return this.labels;
        }

        public ServiceInfoVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
