// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The information about services.
    @NameInMap("ServiceList")
    public java.util.List<ImportServicesRequestServiceList> serviceList;

    // The service source. Valid values:
    // 
    // *   MSE: MSE Nacos instance
    // *   K8s: ACK cluster
    // *   VIP: fixed address
    // *   DNS: DNS domain
    @NameInMap("SourceType")
    public String sourceType;

    // The Transport Layer Security (TLS) settings. Valid values:
    // 
    // *   mode: TLS mode
    // *   certId: certificate ID
    // *   caCertId: CA certificate ID
    // *   caCertContent: CA certificate public key
    // *   sni: service name identification
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
        // The group.
        @NameInMap("GroupName")
        public String groupName;

        // The IP addresses of the service.
        @NameInMap("Ips")
        public java.util.List<String> ips;

        // The name of the service.
        @NameInMap("Name")
        public String name;

        // The namespace.
        @NameInMap("Namespace")
        public String namespace;

        // The port of the service.
        @NameInMap("ServicePort")
        public Long servicePort;

        // The protocol of the service.
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
