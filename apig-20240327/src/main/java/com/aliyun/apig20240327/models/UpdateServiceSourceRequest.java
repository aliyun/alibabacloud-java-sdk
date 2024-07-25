// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateServiceSourceRequest extends TeaModel {
    @NameInMap("k8sServiceSourceConfig")
    public UpdateServiceSourceRequestK8sServiceSourceConfig k8sServiceSourceConfig;

    public static UpdateServiceSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSourceRequest self = new UpdateServiceSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSourceRequest setK8sServiceSourceConfig(UpdateServiceSourceRequestK8sServiceSourceConfig k8sServiceSourceConfig) {
        this.k8sServiceSourceConfig = k8sServiceSourceConfig;
        return this;
    }
    public UpdateServiceSourceRequestK8sServiceSourceConfig getK8sServiceSourceConfig() {
        return this.k8sServiceSourceConfig;
    }

    public static class UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig extends TeaModel {
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

        public static UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig self = new UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig setOverrideIngressIp(Boolean overrideIngressIp) {
            this.overrideIngressIp = overrideIngressIp;
            return this;
        }
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        public UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

    public static class UpdateServiceSourceRequestK8sServiceSourceConfig extends TeaModel {
        @NameInMap("ingressConfig")
        public UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig ingressConfig;

        public static UpdateServiceSourceRequestK8sServiceSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceSourceRequestK8sServiceSourceConfig self = new UpdateServiceSourceRequestK8sServiceSourceConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServiceSourceRequestK8sServiceSourceConfig setIngressConfig(UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig ingressConfig) {
            this.ingressConfig = ingressConfig;
            return this;
        }
        public UpdateServiceSourceRequestK8sServiceSourceConfigIngressConfig getIngressConfig() {
            return this.ingressConfig;
        }

    }

}
