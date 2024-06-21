// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateServiceSourceRequest extends TeaModel {
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
     * <p>The address.</p>
     * 
     * <strong>example:</strong>
     * <p>c9ad2a0717032427e920754e25b49e3b5</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>429</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cdd1bb9bfb8341e9805f931a3ba1f4c6</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the service source.</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The configurations of Ingress resources.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("IngressOptionsRequest")
    public UpdateServiceSourceRequestIngressOptionsRequest ingressOptionsRequest;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>istio</p>
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
     * <ul>
     * <li>K8s: ACK cluster.</li>
     * <li>MSE: Nacos instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>K8s</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the service source. Valid values:</p>
     * <ul>
     * <li>K8s: ACK cluster.</li>
     * <li>NACOS: Nacos instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>K8s</p>
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIngress")
        public Boolean enableIngress;

        /**
         * <p>Specifies whether to update the Ingress status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableStatus")
        public Boolean enableStatus;

        /**
         * <p>Specifies whether to monitor Ingress classes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.test.xxx</p>
         */
        @NameInMap("IngressClass")
        public String ingressClass;

        /**
         * <p>The namespace whose resources you want to monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
