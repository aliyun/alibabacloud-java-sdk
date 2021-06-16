// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListDomainsByLogConfigIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Domains")
    public ListDomainsByLogConfigIdResponseBodyDomains domains;

    public static ListDomainsByLogConfigIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsByLogConfigIdResponseBody self = new ListDomainsByLogConfigIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainsByLogConfigIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainsByLogConfigIdResponseBody setDomains(ListDomainsByLogConfigIdResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public ListDomainsByLogConfigIdResponseBodyDomains getDomains() {
        return this.domains;
    }

    public static class ListDomainsByLogConfigIdResponseBodyDomains extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<String> domain;

        public static ListDomainsByLogConfigIdResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsByLogConfigIdResponseBodyDomains self = new ListDomainsByLogConfigIdResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public ListDomainsByLogConfigIdResponseBodyDomains setDomain(java.util.List<String> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<String> getDomain() {
            return this.domain;
        }

    }

}
