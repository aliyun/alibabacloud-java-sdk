// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Address")
    public String address;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("IngressOptionsRequest")
    public AddServiceSourceRequestIngressOptionsRequest ingressOptionsRequest;

    @NameInMap("Name")
    public String name;

    @NameInMap("Source")
    public String source;

    @NameInMap("Type")
    public String type;

    public static AddServiceSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddServiceSourceRequest self = new AddServiceSourceRequest();
        return TeaModel.build(map, self);
    }

    public AddServiceSourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddServiceSourceRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AddServiceSourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddServiceSourceRequest setIngressOptionsRequest(AddServiceSourceRequestIngressOptionsRequest ingressOptionsRequest) {
        this.ingressOptionsRequest = ingressOptionsRequest;
        return this;
    }
    public AddServiceSourceRequestIngressOptionsRequest getIngressOptionsRequest() {
        return this.ingressOptionsRequest;
    }

    public AddServiceSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddServiceSourceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddServiceSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AddServiceSourceRequestIngressOptionsRequest extends TeaModel {
        @NameInMap("EnableIngress")
        public Boolean enableIngress;

        @NameInMap("IngressClass")
        public String ingressClass;

        @NameInMap("WatchNamespace")
        public String watchNamespace;

        public static AddServiceSourceRequestIngressOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
            AddServiceSourceRequestIngressOptionsRequest self = new AddServiceSourceRequestIngressOptionsRequest();
            return TeaModel.build(map, self);
        }

        public AddServiceSourceRequestIngressOptionsRequest setEnableIngress(Boolean enableIngress) {
            this.enableIngress = enableIngress;
            return this;
        }
        public Boolean getEnableIngress() {
            return this.enableIngress;
        }

        public AddServiceSourceRequestIngressOptionsRequest setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public AddServiceSourceRequestIngressOptionsRequest setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

}
