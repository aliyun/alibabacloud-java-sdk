// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ServiceInfo extends TeaModel {
    /**
     * <p>The service routing type.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("expressType")
    public String expressType;

    /**
     * <p>The service group name.</p>
     * 
     * <strong>example:</strong>
     * <p>default-group</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-openai-service</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The service namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The PAI workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-xxx****</p>
     */
    @NameInMap("paiWorkspaceId")
    public String paiWorkspaceId;

    /**
     * <p>The PAI workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-workspace</p>
     */
    @NameInMap("paiWorkspaceName")
    public String paiWorkspaceName;

    /**
     * <p>The list of service ports.</p>
     */
    @NameInMap("ports")
    public java.util.List<ServiceInfoPorts> ports;

    /**
     * <p>The service version qualifier.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>svc-xxx****</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The service source type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The service status.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The list of service versions.</p>
     */
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
        /**
         * <p>The port name.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The port protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
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
        /**
         * <p>The label key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The label value.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
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
        /**
         * <p>The list of version labels.</p>
         */
        @NameInMap("labels")
        public java.util.List<ServiceInfoVersionsLabels> labels;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
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
