// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceRequest extends TeaModel {
    // The language in which the returned information is displayed. Valid values:
    // 
    // *   zh-CN: Chinese. This is the default value.
    // *   en-US: English.
    // *   ja: Japanese.
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The endpoint.
    @NameInMap("Address")
    public String address;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The list of service groups.
    @NameInMap("GroupList")
    public java.util.List<String> groupList;

    // The Ingress configuration.
    @NameInMap("IngressOptionsRequest")
    public AddServiceSourceRequestIngressOptionsRequest ingressOptionsRequest;

    // The name.
    // 
    // >  The parameter value varies based on the source type.
    // 
    // *   If Type is set to K8S, this parameter specifies the name of the ACK cluster.
    // 
    // *   If Type is set to NACOS, this parameter specifies the ID of the instance.
    @NameInMap("Name")
    public String name;

    // An array of service root paths.
    @NameInMap("PathList")
    public java.util.List<String> pathList;

    // The service source.
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

    public AddServiceSourceRequest setGroupList(java.util.List<String> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<String> getGroupList() {
        return this.groupList;
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

    public AddServiceSourceRequest setPathList(java.util.List<String> pathList) {
        this.pathList = pathList;
        return this;
    }
    public java.util.List<String> getPathList() {
        return this.pathList;
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

        public AddServiceSourceRequestIngressOptionsRequest setEnableStatus(Boolean enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Boolean getEnableStatus() {
            return this.enableStatus;
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
