// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketAgentConfig extends TeaModel {
    @NameInMap("agentAPIConfig")
    public HiMarketAgentConfigAgentAPIConfig agentAPIConfig;

    public static HiMarketAgentConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketAgentConfig self = new HiMarketAgentConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketAgentConfig setAgentAPIConfig(HiMarketAgentConfigAgentAPIConfig agentAPIConfig) {
        this.agentAPIConfig = agentAPIConfig;
        return this;
    }
    public HiMarketAgentConfigAgentAPIConfig getAgentAPIConfig() {
        return this.agentAPIConfig;
    }

    public static class HiMarketAgentConfigAgentAPIConfig extends TeaModel {
        @NameInMap("agentProtocols")
        public java.util.List<String> agentProtocols;

        @NameInMap("routes")
        public java.util.List<HiMarketHttpRoute> routes;

        public static HiMarketAgentConfigAgentAPIConfig build(java.util.Map<String, ?> map) throws Exception {
            HiMarketAgentConfigAgentAPIConfig self = new HiMarketAgentConfigAgentAPIConfig();
            return TeaModel.build(map, self);
        }

        public HiMarketAgentConfigAgentAPIConfig setAgentProtocols(java.util.List<String> agentProtocols) {
            this.agentProtocols = agentProtocols;
            return this;
        }
        public java.util.List<String> getAgentProtocols() {
            return this.agentProtocols;
        }

        public HiMarketAgentConfigAgentAPIConfig setRoutes(java.util.List<HiMarketHttpRoute> routes) {
            this.routes = routes;
            return this;
        }
        public java.util.List<HiMarketHttpRoute> getRoutes() {
            return this.routes;
        }

    }

}
