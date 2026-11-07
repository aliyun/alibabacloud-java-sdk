// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceRequest extends TeaModel {
    /**
     * <p>The supported languages. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese. This is the default value.</li>
     * <li>en-US: English.</li>
     * <li>ja: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The access address. This parameter is required.</p>
     * <ul>
     * <li>Container Service: the ID of the Container Service cluster.</li>
     * <li>MSE Nacos: the internal endpoint of the instance.</li>
     * <li>MSE ZooKeeper: the internal endpoint of the instance.</li>
     * <li>SAE registry: the namespace TID.</li>
     * <li>EDAS registry: the microservice namespace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse-********-nacos-ans.mse.aliyuncs.com:8848</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-c70622ff52fe49beb29bea9a6f52****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The list of service groups.</p>
     */
    @NameInMap("GroupList")
    public java.util.List<String> groupList;

    /**
     * <p>The Ingress configurations. This parameter is used when the service source type is K8s.</p>
     */
    @NameInMap("IngressOptionsRequest")
    public AddServiceSourceRequestIngressOptionsRequest ingressOptionsRequest;

    /**
     * <p>The name.</p>
     * <blockquote>
     * <p>Descriptions for different source types.</p>
     * </blockquote>
     * <ul>
     * <li>When the type is K8s, the input parameter is the name.</li>
     * <li>When the type is NACOS, the input parameter is the instance ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nacos</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The array of service root paths.</p>
     */
    @NameInMap("PathList")
    public java.util.List<String> pathList;

    /**
     * <p>The service source type:</p>
     * <ul>
     * <li>Container Service: K8S</li>
     * <li>MSE Nacos: MSE</li>
     * <li>MSE ZooKeeper: MSE_ZK</li>
     * <li>SAE registry: SAE</li>
     * <li>EDAS registry: EDAS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MSE</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The list of security groups to be authorized. This parameter is used to remove security group restrictions for backend services when creating a source.</p>
     */
    @NameInMap("ToAuthorizeSecurityGroups")
    public java.util.List<AddServiceSourceRequestToAuthorizeSecurityGroups> toAuthorizeSecurityGroups;

    /**
     * <p>The service registration type. Specify the corresponding value based on the source type:</p>
     * <ul>
     * <li>Container Service: K8S</li>
     * <li>MSE Nacos: NACOS</li>
     * <li>MSE ZooKeeper: ZOOKEEPER</li>
     * <li>SAE registry: NACOS</li>
     * <li>EDAS registry: NACOS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NACOS</p>
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
         * <p>The Ingress class to listen on.</p>
         * 
         * <strong>example:</strong>
         * <p>com.test.xxx</p>
         */
        @NameInMap("IngressClass")
        public String ingressClass;

        /**
         * <p>The target namespace to watch.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
        /**
         * <p>The description of the authorization record.</p>
         * 
         * <strong>example:</strong>
         * <p>rule for xxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The authorized port range of the security group. You can specify multiple port ranges separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>8080/8080,9000/10000</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1acepclex0vmi1****</p>
         */
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
