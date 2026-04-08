// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiFallbackConfig extends TeaModel {
    @NameInMap("onlyRedirectUpstreamCode")
    public Boolean onlyRedirectUpstreamCode;

    @NameInMap("serviceConfigs")
    public java.util.List<AiFallbackConfigServiceConfigs> serviceConfigs;

    public static AiFallbackConfig build(java.util.Map<String, ?> map) throws Exception {
        AiFallbackConfig self = new AiFallbackConfig();
        return TeaModel.build(map, self);
    }

    public AiFallbackConfig setOnlyRedirectUpstreamCode(Boolean onlyRedirectUpstreamCode) {
        this.onlyRedirectUpstreamCode = onlyRedirectUpstreamCode;
        return this;
    }
    public Boolean getOnlyRedirectUpstreamCode() {
        return this.onlyRedirectUpstreamCode;
    }

    public AiFallbackConfig setServiceConfigs(java.util.List<AiFallbackConfigServiceConfigs> serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public java.util.List<AiFallbackConfigServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public static class AiFallbackConfigServiceConfigs extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("passThroughModelName")
        public Boolean passThroughModelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("targetModelName")
        public String targetModelName;

        public static AiFallbackConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            AiFallbackConfigServiceConfigs self = new AiFallbackConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public AiFallbackConfigServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AiFallbackConfigServiceConfigs setPassThroughModelName(Boolean passThroughModelName) {
            this.passThroughModelName = passThroughModelName;
            return this;
        }
        public Boolean getPassThroughModelName() {
            return this.passThroughModelName;
        }

        public AiFallbackConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public AiFallbackConfigServiceConfigs setTargetModelName(String targetModelName) {
            this.targetModelName = targetModelName;
            return this;
        }
        public String getTargetModelName() {
            return this.targetModelName;
        }

    }

}
