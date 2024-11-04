// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class AttachGatewayDomainRequest extends TeaModel {
    /**
     * <p>The custom domain name information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomDomain")
    public AttachGatewayDomainRequestCustomDomain customDomain;

    public static AttachGatewayDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachGatewayDomainRequest self = new AttachGatewayDomainRequest();
        return TeaModel.build(map, self);
    }

    public AttachGatewayDomainRequest setCustomDomain(AttachGatewayDomainRequestCustomDomain customDomain) {
        this.customDomain = customDomain;
        return this;
    }
    public AttachGatewayDomainRequestCustomDomain getCustomDomain() {
        return this.customDomain;
    }

    public static class AttachGatewayDomainRequestCustomDomain extends TeaModel {
        /**
         * <p>The ID of the SSL certificate bound to the domain name. Obtain the certificate ID after you upload or purchase a certificate in the <a href="https://yundunnext.console.aliyun.com/?spm=5176.2020520163.console-base_help.2.4b3baJixaJixOc%5C&p=cas">Certificate Management Service</a> console.</p>
         * 
         * <strong>example:</strong>
         * <p>1473**25</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

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

        public static AttachGatewayDomainRequestCustomDomain build(java.util.Map<String, ?> map) throws Exception {
            AttachGatewayDomainRequestCustomDomain self = new AttachGatewayDomainRequestCustomDomain();
            return TeaModel.build(map, self);
        }

        public AttachGatewayDomainRequestCustomDomain setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public AttachGatewayDomainRequestCustomDomain setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public AttachGatewayDomainRequestCustomDomain setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
