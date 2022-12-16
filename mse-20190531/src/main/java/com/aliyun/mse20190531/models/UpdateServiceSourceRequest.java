// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateServiceSourceRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The address.
    @NameInMap("Address")
    public String address;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The ID of the service source.
    @NameInMap("Id")
    public Long id;

    // The configurations of Ingress resources.
    @NameInMap("IngressOptionsRequest")
    public UpdateServiceSourceRequestIngressOptionsRequest ingressOptionsRequest;

    // The name.
    @NameInMap("Name")
    public String name;

    // An array of service root paths.
    @NameInMap("PathList")
    public java.util.List<String> pathList;

    // The service source. Valid values:
    // 
    // *   K8S: ACK cluster
    // *   MSE: Nacos instance
    @NameInMap("Source")
    public String source;

    // The type of the service source. Valid values:
    // 
    // *   K8S: ACK cluster
    // *   NACOS: Nacos instance
    @NameInMap("Type")
    public String type;

    public static UpdateServiceSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSourceRequest self = new UpdateServiceSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateServiceSourceRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateServiceSourceRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateServiceSourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateServiceSourceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateServiceSourceRequest setIngressOptionsRequest(UpdateServiceSourceRequestIngressOptionsRequest ingressOptionsRequest) {
        this.ingressOptionsRequest = ingressOptionsRequest;
        return this;
    }
    public UpdateServiceSourceRequestIngressOptionsRequest getIngressOptionsRequest() {
        return this.ingressOptionsRequest;
    }

    public UpdateServiceSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateServiceSourceRequest setPathList(java.util.List<String> pathList) {
        this.pathList = pathList;
        return this;
    }
    public java.util.List<String> getPathList() {
        return this.pathList;
    }

    public UpdateServiceSourceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateServiceSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdateServiceSourceRequestIngressOptionsRequest extends TeaModel {
        // Specifies whether to enable Ingress.
        @NameInMap("EnableIngress")
        public Boolean enableIngress;

        // Specifies whether to update the Ingress status.
        @NameInMap("EnableStatus")
        public Boolean enableStatus;

        // Specifies whether to monitor Ingress classes.
        @NameInMap("IngressClass")
        public String ingressClass;

        // The namespace whose resources you want to monitor.
        @NameInMap("WatchNamespace")
        public String watchNamespace;

        public static UpdateServiceSourceRequestIngressOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceSourceRequestIngressOptionsRequest self = new UpdateServiceSourceRequestIngressOptionsRequest();
            return TeaModel.build(map, self);
        }

        public UpdateServiceSourceRequestIngressOptionsRequest setEnableIngress(Boolean enableIngress) {
            this.enableIngress = enableIngress;
            return this;
        }
        public Boolean getEnableIngress() {
            return this.enableIngress;
        }

        public UpdateServiceSourceRequestIngressOptionsRequest setEnableStatus(Boolean enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Boolean getEnableStatus() {
            return this.enableStatus;
        }

        public UpdateServiceSourceRequestIngressOptionsRequest setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public UpdateServiceSourceRequestIngressOptionsRequest setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

}
