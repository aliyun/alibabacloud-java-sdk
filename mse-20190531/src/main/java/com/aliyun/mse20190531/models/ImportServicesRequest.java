// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The Function Compute service alias. This parameter is required when the service source is Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>test-alias</p>
     */
    @NameInMap("FcAlias")
    public String fcAlias;

    /**
     * <p>The Function Compute service name. This parameter is required when the service source is Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>guide</p>
     */
    @NameInMap("FcServiceName")
    public String fcServiceName;

    /**
     * <p>The Function Compute service version. This parameter is required when the service source is Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("FcVersion")
    public String fcVersion;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-77e1153db6e14c0a8b1fae20bcb89ca5</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The service list.</p>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ServiceList")
    public java.util.List<ImportServicesRequestServiceList> serviceList;

    /**
     * <p>The service source ID. This parameter is used when you add a service from a specified source.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SourceId")
    public Long sourceId;

    /**
     * <p>The service source. Valid values:</p>
     * <ul>
     * <li>MSE: Microservices Engine (MSE Nacos).</li>
     * <li>K8s: Container Service for Kubernetes (ACK).</li>
     * <li>VIP: Fixed address.</li>
     * <li>DNS: DNS domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The TLS settings.</p>
     * <ul>
     * <li><p>TLS pattern: mode</p>
     * </li>
     * <li><p>Certificate ID: certId</p>
     * </li>
     * <li><p>CA certificate ID: caCertId</p>
     * </li>
     * <li><p>CA certificate public key: caCertContent</p>
     * </li>
     * <li><p>Service name identity: sni</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;mode&quot;: &quot;MUTUAL&quot;,
     *       &quot;certId&quot;: &quot;1*****-cn-hangzhou&quot;,
     *       &quot;caCertContent&quot;: &quot;123&quot;,
     *       &quot;sni&quot;: &quot;ceshi&quot;
     * }</p>
     */
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

    public ImportServicesRequest setFcAlias(String fcAlias) {
        this.fcAlias = fcAlias;
        return this;
    }
    public String getFcAlias() {
        return this.fcAlias;
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

    public ImportServicesRequest setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
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
        /**
         * <p>The list of DNS servers (for DNS domain name services only).</p>
         */
        @NameInMap("DnsServerList")
        public java.util.List<String> dnsServerList;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The list of IP addresses.</p>
         */
        @NameInMap("Ips")
        public java.util.List<String> ips;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The SAE application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("SaeAppId")
        public String saeAppId;

        /**
         * <p>The service port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("ServicePort")
        public Long servicePort;

        /**
         * <p>The service protocol version.</p>
         * 
         * <strong>example:</strong>
         * <p>GRPC, HTTP</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        public static ImportServicesRequestServiceList build(java.util.Map<String, ?> map) throws Exception {
            ImportServicesRequestServiceList self = new ImportServicesRequestServiceList();
            return TeaModel.build(map, self);
        }

        public ImportServicesRequestServiceList setDnsServerList(java.util.List<String> dnsServerList) {
            this.dnsServerList = dnsServerList;
            return this;
        }
        public java.util.List<String> getDnsServerList() {
            return this.dnsServerList;
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

        public ImportServicesRequestServiceList setSaeAppId(String saeAppId) {
            this.saeAppId = saeAppId;
            return this;
        }
        public String getSaeAppId() {
            return this.saeAppId;
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
