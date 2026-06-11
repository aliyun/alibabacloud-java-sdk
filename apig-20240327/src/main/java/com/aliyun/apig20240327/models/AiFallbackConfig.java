// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiFallbackConfig extends TeaModel {
    /**
     * <p>Determines whether fallback is triggered solely by the upstream service\&quot;s status code. If <code>true</code>, fallback occurs only if the upstream service returns an error code. If <code>false</code>, other conditions, such as timeouts, can also trigger the fallback.</p>
     */
    @NameInMap("onlyRedirectUpstreamCode")
    public Boolean onlyRedirectUpstreamCode;

    /**
     * <p>A list of fallback service configurations.</p>
     */
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
        /**
         * <p>The name of the fallback service.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Determines whether to pass the original model name to the fallback service. If <code>true</code>, the model name from the original request is used. If <code>false</code>, the value of <code>targetModelName</code> is used instead.</p>
         */
        @NameInMap("passThroughModelName")
        public Boolean passThroughModelName;

        /**
         * <p>The unique ID of the fallback service.</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The name of the model to use for the fallback request.</p>
         */
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
