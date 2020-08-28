// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLDAPConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ldap")
    @Validation(required = true)
    public DescribeLDAPConfigResponseLdap ldap;

    public static DescribeLDAPConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLDAPConfigResponse self = new DescribeLDAPConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLDAPConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLDAPConfigResponse setLdap(DescribeLDAPConfigResponseLdap ldap) {
        this.ldap = ldap;
        return this;
    }
    public DescribeLDAPConfigResponseLdap getLdap() {
        return this.ldap;
    }

    public static class DescribeLDAPConfigResponseLdap extends TeaModel {
        @NameInMap("BindDN")
        @Validation(required = true)
        public String bindDN;

        @NameInMap("URI")
        @Validation(required = true)
        public String URI;

        @NameInMap("SearchBase")
        @Validation(required = true)
        public String searchBase;

        public static DescribeLDAPConfigResponseLdap build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDAPConfigResponseLdap self = new DescribeLDAPConfigResponseLdap();
            return TeaModel.build(map, self);
        }

        public DescribeLDAPConfigResponseLdap setBindDN(String bindDN) {
            this.bindDN = bindDN;
            return this;
        }
        public String getBindDN() {
            return this.bindDN;
        }

        public DescribeLDAPConfigResponseLdap setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public DescribeLDAPConfigResponseLdap setSearchBase(String searchBase) {
            this.searchBase = searchBase;
            return this;
        }
        public String getSearchBase() {
            return this.searchBase;
        }

    }

}
