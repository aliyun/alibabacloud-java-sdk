// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("FcAlias")
    public String fcAlias;

    @NameInMap("FcServiceName")
    public String fcServiceName;

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
     * <p>The information about services.</p>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ServiceList")
    public java.util.List<ImportServicesRequestServiceList> serviceList;

    /**
     * <p>The service source. Valid values:</p>
     * <ul>
     * <li>MSE: MSE Nacos instance</li>
     * <li>K8s: ACK cluster</li>
     * <li>VIP: fixed address</li>
     * <li>DNS: DNS domain</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The Transport Layer Security (TLS) settings. Valid values:</p>
     * <ul>
     * <li>mode: TLS mode</li>
     * <li>certId: certificate ID</li>
     * <li>caCertId: CA certificate ID</li>
     * <li>caCertContent: CA certificate public key</li>
     * <li>sni: service name identification</li>
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
         * <p>The group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The IP addresses of the service.</p>
         */
        @NameInMap("Ips")
        public java.util.List<String> ips;

        /**
         * <p>The name of the service.</p>
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
         * <p>The port of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("ServicePort")
        public Long servicePort;

        /**
         * <p>The protocol of the service.</p>
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
