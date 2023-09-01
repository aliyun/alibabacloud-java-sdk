// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateServiceSourceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese.</p>
     * <p>*   en: English.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The address.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the gateway.</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the service source.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The configurations of Ingress resources.</p>
     */
    @NameInMap("IngressOptionsRequest")
    public UpdateServiceSourceRequestIngressOptionsRequest ingressOptionsRequest;

    /**
     * <p>The name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>An array of service root paths.</p>
     */
    @NameInMap("PathList")
    public java.util.List<String> pathList;

    /**
     * <p>The service source. Valid values:</p>
     * <br>
     * <p>*   K8s: ACK cluster.</p>
     * <p>*   MSE: Nacos instance.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the service source. Valid values:</p>
     * <br>
     * <p>*   K8s: ACK cluster.</p>
     * <p>*   NACOS: Nacos instance.</p>
     */
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
        /**
         * <p>Specifies whether to enable Ingress.</p>
         */
        @NameInMap("EnableIngress")
        public Boolean enableIngress;

        /**
         * <p>Specifies whether to update the Ingress status.</p>
         */
        @NameInMap("EnableStatus")
        public Boolean enableStatus;

        /**
         * <p>Specifies whether to monitor Ingress classes.</p>
         */
        @NameInMap("IngressClass")
        public String ingressClass;

        /**
         * <p>The namespace whose resources you want to monitor.</p>
         */
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
