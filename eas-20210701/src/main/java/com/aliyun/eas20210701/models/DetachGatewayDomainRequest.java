// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DetachGatewayDomainRequest extends TeaModel {
    /**
     * <p>The custom domain name information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomDomain")
    public DetachGatewayDomainRequestCustomDomain customDomain;

    public static DetachGatewayDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachGatewayDomainRequest self = new DetachGatewayDomainRequest();
        return TeaModel.build(map, self);
    }

    public DetachGatewayDomainRequest setCustomDomain(DetachGatewayDomainRequestCustomDomain customDomain) {
        this.customDomain = customDomain;
        return this;
    }
    public DetachGatewayDomainRequestCustomDomain getCustomDomain() {
        return this.customDomain;
    }

    public static class DetachGatewayDomainRequestCustomDomain extends TeaModel {
        /**
         * <p>The custom domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The domain name type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>intranet: internal network.</li>
         * <li>internet: public network.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("Type")
        public String type;

        public static DetachGatewayDomainRequestCustomDomain build(java.util.Map<String, ?> map) throws Exception {
            DetachGatewayDomainRequestCustomDomain self = new DetachGatewayDomainRequestCustomDomain();
            return TeaModel.build(map, self);
        }

        public DetachGatewayDomainRequestCustomDomain setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DetachGatewayDomainRequestCustomDomain setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
