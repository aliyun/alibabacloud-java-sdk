// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListCorsDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<ListCorsDomainsResponseBodyDomains> domains;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCorsDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCorsDomainsResponseBody self = new ListCorsDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCorsDomainsResponseBody setDomains(java.util.List<ListCorsDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<ListCorsDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public ListCorsDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCorsDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("DomainId")
        public String domainId;

        public static ListCorsDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            ListCorsDomainsResponseBodyDomains self = new ListCorsDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public ListCorsDomainsResponseBodyDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListCorsDomainsResponseBodyDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

    }

}
