// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("FcServiceName")
    public String fcServiceName;

    @NameInMap("FcVersion")
    public String fcVersion;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("ServiceList")
    public java.util.List<ImportServicesRequestServiceList> serviceList;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("TlsSetting")
    public String tlsSetting;

    public static ImportServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportServicesRequest self = new ImportServicesRequest();
        return TeaModel.build(map, self);
    }

    public ImportServicesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ImportServicesRequest setFcServiceName(String fcServiceName) {
        this.fcServiceName = fcServiceName;
        return this;
    }
    public String getFcServiceName() {
        return this.fcServiceName;
    }

    public ImportServicesRequest setFcVersion(String fcVersion) {
        this.fcVersion = fcVersion;
        return this;
    }
    public String getFcVersion() {
        return this.fcVersion;
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

    public ImportServicesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ImportServicesRequest setTlsSetting(String tlsSetting) {
        this.tlsSetting = tlsSetting;
        return this;
    }
    public String getTlsSetting() {
        return this.tlsSetting;
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

        @NameInMap("ServicePort")
        public Long servicePort;

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
