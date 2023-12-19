// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh-CN (default): Chinese</p>
     * <p>*   en-US: English</p>
     * <p>*   ja: Japanese</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to monitor Ingress classes.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>Specifies whether to update the Ingress status.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("GroupList")
    public java.util.List<String> groupList;

    /**
     * <p>The list of service groups.</p>
     */
    @NameInMap("IngressOptionsRequest")
    public AddServiceSourceRequestIngressOptionsRequest ingressOptionsRequest;

    /**
     * <p>The namespace whose resources you want to monitor.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("PathList")
    public java.util.List<String> pathList;

    /**
     * <p>The service source.</p>
     * <br>
     * <p>*   K8s: ACK cluster</p>
     * <p>*   NACOS: MSE Nacos instance</p>
     */
    @NameInMap("Source")
    public String source;

    @NameInMap("ToAuthorizeSecurityGroups")
    public java.util.List<AddServiceSourceRequestToAuthorizeSecurityGroups> toAuthorizeSecurityGroups;

    /**
     * <p>The type of the service source.</p>
     * <br>
     * <p>*   K8s: Container Service for Kubernetes (ACK) cluster</p>
     * <p>*   NACOS: Nacos instance</p>
     */
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

    public AddServiceSourceRequest setToAuthorizeSecurityGroups(java.util.List<AddServiceSourceRequestToAuthorizeSecurityGroups> toAuthorizeSecurityGroups) {
        this.toAuthorizeSecurityGroups = toAuthorizeSecurityGroups;
        return this;
    }
    public java.util.List<AddServiceSourceRequestToAuthorizeSecurityGroups> getToAuthorizeSecurityGroups() {
        return this.toAuthorizeSecurityGroups;
    }

    public AddServiceSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AddServiceSourceRequestIngressOptionsRequest extends TeaModel {
        /**
         * <p>The group to which the service belongs.</p>
         */
        @NameInMap("EnableIngress")
        public Boolean enableIngress;

        /**
         * <p>The language of the response. Valid values:</p>
         * <br>
         * <p>*   zh-CN: Chinese. This is the default value.</p>
         * <p>*   en-US: English.</p>
         * <p>*   ja: Japanese.</p>
         */
        @NameInMap("EnableStatus")
        public Boolean enableStatus;

        /**
         * <p>An array of service root paths.</p>
         */
        @NameInMap("IngressClass")
        public String ingressClass;

        /**
         * <p>The root path of the service.</p>
         */
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

    public static class AddServiceSourceRequestToAuthorizeSecurityGroups extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static AddServiceSourceRequestToAuthorizeSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            AddServiceSourceRequestToAuthorizeSecurityGroups self = new AddServiceSourceRequestToAuthorizeSecurityGroups();
            return TeaModel.build(map, self);
        }

        public AddServiceSourceRequestToAuthorizeSecurityGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddServiceSourceRequestToAuthorizeSecurityGroups setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public AddServiceSourceRequestToAuthorizeSecurityGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

}
