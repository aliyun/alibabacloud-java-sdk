// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayDomainsResponseBody extends TeaModel {
    /**
     * <p>The list of custom domain names.</p>
     */
    @NameInMap("CustomDomains")
    public java.util.List<ListGatewayDomainsResponseBodyCustomDomains> customDomains;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successfully get custom domains</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGatewayDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayDomainsResponseBody self = new ListGatewayDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayDomainsResponseBody setCustomDomains(java.util.List<ListGatewayDomainsResponseBodyCustomDomains> customDomains) {
        this.customDomains = customDomains;
        return this;
    }
    public java.util.List<ListGatewayDomainsResponseBodyCustomDomains> getCustomDomains() {
        return this.customDomains;
    }

    public ListGatewayDomainsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayDomainsResponseBodyCustomDomains extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGatewayDomainsResponseBodyCustomDomains build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayDomainsResponseBodyCustomDomains self = new ListGatewayDomainsResponseBodyCustomDomains();
            return TeaModel.build(map, self);
        }

        public ListGatewayDomainsResponseBodyCustomDomains setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public ListGatewayDomainsResponseBodyCustomDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListGatewayDomainsResponseBodyCustomDomains setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
