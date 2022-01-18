// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesRequest extends TeaModel {
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("ServiceList")
    public java.util.List<ImportServicesRequestServiceList> serviceList;

    @NameInMap("SourceId")
    public String sourceId;

    // 服务来源
    @NameInMap("SourceType")
    public String sourceType;

    public static ImportServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportServicesRequest self = new ImportServicesRequest();
        return TeaModel.build(map, self);
    }

    public ImportServicesRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public ImportServicesRequest setServiceList(java.util.List<ImportServicesRequestServiceList> serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public java.util.List<ImportServicesRequestServiceList> getServiceList() {
        return this.serviceList;
    }

    public ImportServicesRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ImportServicesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class ImportServicesRequestServiceList extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Ips")
        public java.util.List<String> ips;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        // 服务的端口
        @NameInMap("ServicePort")
        public Long servicePort;

        // 服务的协议版本
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        public static ImportServicesRequestServiceList build(java.util.Map<String, ?> map) throws Exception {
            ImportServicesRequestServiceList self = new ImportServicesRequestServiceList();
            return TeaModel.build(map, self);
        }

        public ImportServicesRequestServiceList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ImportServicesRequestServiceList setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public ImportServicesRequestServiceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImportServicesRequestServiceList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ImportServicesRequestServiceList setServicePort(Long servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Long getServicePort() {
            return this.servicePort;
        }

        public ImportServicesRequestServiceList setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

    }

}
