// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayLogConfig extends TeaModel {
    /**
     * <p>The Simple Log Service configurations.</p>
     */
    @NameInMap("slsConfig")
    public GatewayLogConfigSlsConfig slsConfig;

    public static GatewayLogConfig build(java.util.Map<String, ?> map) throws Exception {
        GatewayLogConfig self = new GatewayLogConfig();
        return TeaModel.build(map, self);
    }

    public GatewayLogConfig setSlsConfig(GatewayLogConfigSlsConfig slsConfig) {
        this.slsConfig = slsConfig;
        return this;
    }
    public GatewayLogConfigSlsConfig getSlsConfig() {
        return this.slsConfig;
    }

    public static class GatewayLogConfigSlsConfig extends TeaModel {
        /**
         * <p>Specifies whether to activate Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static GatewayLogConfigSlsConfig build(java.util.Map<String, ?> map) throws Exception {
            GatewayLogConfigSlsConfig self = new GatewayLogConfigSlsConfig();
            return TeaModel.build(map, self);
        }

        public GatewayLogConfigSlsConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
