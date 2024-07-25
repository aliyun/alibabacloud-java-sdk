// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayServiceSource extends TeaModel {
    @NameInMap("bound")
    public Boolean bound;

    @NameInMap("createTimestamp")
    public Long createTimestamp;

    @NameInMap("k8sServiceSourceInfo")
    public GatewayServiceSourceK8sServiceSourceInfo k8sServiceSourceInfo;

    @NameInMap("nacosServiceSourceInfo")
    public GatewayServiceSourceNacosServiceSourceInfo nacosServiceSourceInfo;

    @NameInMap("name")
    public String name;

    @NameInMap("serviceSourceId")
    public String serviceSourceId;

    @NameInMap("type")
    public String type;

    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static GatewayServiceSource build(java.util.Map<String, ?> map) throws Exception {
        GatewayServiceSource self = new GatewayServiceSource();
        return TeaModel.build(map, self);
    }

    public GatewayServiceSource setBound(Boolean bound) {
        this.bound = bound;
        return this;
    }
    public Boolean getBound() {
        return this.bound;
    }

    public GatewayServiceSource setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public GatewayServiceSource setK8sServiceSourceInfo(GatewayServiceSourceK8sServiceSourceInfo k8sServiceSourceInfo) {
        this.k8sServiceSourceInfo = k8sServiceSourceInfo;
        return this;
    }
    public GatewayServiceSourceK8sServiceSourceInfo getK8sServiceSourceInfo() {
        return this.k8sServiceSourceInfo;
    }

    public GatewayServiceSource setNacosServiceSourceInfo(GatewayServiceSourceNacosServiceSourceInfo nacosServiceSourceInfo) {
        this.nacosServiceSourceInfo = nacosServiceSourceInfo;
        return this;
    }
    public GatewayServiceSourceNacosServiceSourceInfo getNacosServiceSourceInfo() {
        return this.nacosServiceSourceInfo;
    }

    public GatewayServiceSource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GatewayServiceSource setServiceSourceId(String serviceSourceId) {
        this.serviceSourceId = serviceSourceId;
        return this;
    }
    public String getServiceSourceId() {
        return this.serviceSourceId;
    }

    public GatewayServiceSource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GatewayServiceSource setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class GatewayServiceSourceK8sServiceSourceInfoIngressConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overrideIngressIp")
        public Boolean overrideIngressIp;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("watchNamespace")
        public String watchNamespace;

        public static GatewayServiceSourceK8sServiceSourceInfoIngressConfig build(java.util.Map<String, ?> map) throws Exception {
            GatewayServiceSourceK8sServiceSourceInfoIngressConfig self = new GatewayServiceSourceK8sServiceSourceInfoIngressConfig();
            return TeaModel.build(map, self);
        }

        public GatewayServiceSourceK8sServiceSourceInfoIngressConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GatewayServiceSourceK8sServiceSourceInfoIngressConfig setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public GatewayServiceSourceK8sServiceSourceInfoIngressConfig setOverrideIngressIp(Boolean overrideIngressIp) {
            this.overrideIngressIp = overrideIngressIp;
            return this;
        }
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        public GatewayServiceSourceK8sServiceSourceInfoIngressConfig setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

    public static class GatewayServiceSourceK8sServiceSourceInfo extends TeaModel {
        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("ingressConfig")
        public GatewayServiceSourceK8sServiceSourceInfoIngressConfig ingressConfig;

        public static GatewayServiceSourceK8sServiceSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GatewayServiceSourceK8sServiceSourceInfo self = new GatewayServiceSourceK8sServiceSourceInfo();
            return TeaModel.build(map, self);
        }

        public GatewayServiceSourceK8sServiceSourceInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GatewayServiceSourceK8sServiceSourceInfo setIngressConfig(GatewayServiceSourceK8sServiceSourceInfoIngressConfig ingressConfig) {
            this.ingressConfig = ingressConfig;
            return this;
        }
        public GatewayServiceSourceK8sServiceSourceInfoIngressConfig getIngressConfig() {
            return this.ingressConfig;
        }

    }

    public static class GatewayServiceSourceNacosServiceSourceInfo extends TeaModel {
        @NameInMap("address")
        public String address;

        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("instanceId")
        public String instanceId;

        public static GatewayServiceSourceNacosServiceSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GatewayServiceSourceNacosServiceSourceInfo self = new GatewayServiceSourceNacosServiceSourceInfo();
            return TeaModel.build(map, self);
        }

        public GatewayServiceSourceNacosServiceSourceInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GatewayServiceSourceNacosServiceSourceInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GatewayServiceSourceNacosServiceSourceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
