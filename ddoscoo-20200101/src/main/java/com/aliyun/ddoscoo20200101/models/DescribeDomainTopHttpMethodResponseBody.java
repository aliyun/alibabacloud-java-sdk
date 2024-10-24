// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopHttpMethodResponseBody extends TeaModel {
    @NameInMap("DomainTopMethod")
    public java.util.List<DescribeDomainTopHttpMethodResponseBodyDomainTopMethod> domainTopMethod;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainTopHttpMethodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopHttpMethodResponseBody self = new DescribeDomainTopHttpMethodResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopHttpMethodResponseBody setDomainTopMethod(java.util.List<DescribeDomainTopHttpMethodResponseBodyDomainTopMethod> domainTopMethod) {
        this.domainTopMethod = domainTopMethod;
        return this;
    }
    public java.util.List<DescribeDomainTopHttpMethodResponseBodyDomainTopMethod> getDomainTopMethod() {
        return this.domainTopMethod;
    }

    public DescribeDomainTopHttpMethodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainTopHttpMethodResponseBodyDomainTopMethod extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <strong>example:</strong>
         * <p>22121</p>
         */
        @NameInMap("Pv")
        public Long pv;

        public static DescribeDomainTopHttpMethodResponseBodyDomainTopMethod build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopHttpMethodResponseBodyDomainTopMethod self = new DescribeDomainTopHttpMethodResponseBodyDomainTopMethod();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopHttpMethodResponseBodyDomainTopMethod setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainTopHttpMethodResponseBodyDomainTopMethod setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DescribeDomainTopHttpMethodResponseBodyDomainTopMethod setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

    }

}
