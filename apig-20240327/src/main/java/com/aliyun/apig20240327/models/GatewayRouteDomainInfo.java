// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayRouteDomainInfo extends TeaModel {
    @NameInMap("domains")
    public java.util.List<GatewayRouteDomainInfoDomains> domains;

    public static GatewayRouteDomainInfo build(java.util.Map<String, ?> map) throws Exception {
        GatewayRouteDomainInfo self = new GatewayRouteDomainInfo();
        return TeaModel.build(map, self);
    }

    public GatewayRouteDomainInfo setDomains(java.util.List<GatewayRouteDomainInfoDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<GatewayRouteDomainInfoDomains> getDomains() {
        return this.domains;
    }

    public static class GatewayRouteDomainInfoDomains extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d-cp82or5l***</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <strong>example:</strong>
         * <p>item.dev</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static GatewayRouteDomainInfoDomains build(java.util.Map<String, ?> map) throws Exception {
            GatewayRouteDomainInfoDomains self = new GatewayRouteDomainInfoDomains();
            return TeaModel.build(map, self);
        }

        public GatewayRouteDomainInfoDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public GatewayRouteDomainInfoDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GatewayRouteDomainInfoDomains setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
