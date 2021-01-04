// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLDAPConfigResponseBody extends TeaModel {
    @NameInMap("Ldap")
    public DescribeLDAPConfigResponseBodyLdap ldap;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLDAPConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLDAPConfigResponseBody self = new DescribeLDAPConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLDAPConfigResponseBody setLdap(DescribeLDAPConfigResponseBodyLdap ldap) {
        this.ldap = ldap;
        return this;
    }
    public DescribeLDAPConfigResponseBodyLdap getLdap() {
        return this.ldap;
    }

    public DescribeLDAPConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLDAPConfigResponseBodyLdap extends TeaModel {
        @NameInMap("BindDN")
        public String bindDN;

        @NameInMap("SearchBase")
        public String searchBase;

        @NameInMap("URI")
        public String URI;

        public static DescribeLDAPConfigResponseBodyLdap build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDAPConfigResponseBodyLdap self = new DescribeLDAPConfigResponseBodyLdap();
            return TeaModel.build(map, self);
        }

        public DescribeLDAPConfigResponseBodyLdap setBindDN(String bindDN) {
            this.bindDN = bindDN;
            return this;
        }
        public String getBindDN() {
            return this.bindDN;
        }

        public DescribeLDAPConfigResponseBodyLdap setSearchBase(String searchBase) {
            this.searchBase = searchBase;
            return this;
        }
        public String getSearchBase() {
            return this.searchBase;
        }

        public DescribeLDAPConfigResponseBodyLdap setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
