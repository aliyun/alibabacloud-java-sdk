// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListUserAuthorizedResourcesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListUserAuthorizedResourcesHeadersAccountContext accountContext;

    public static ListUserAuthorizedResourcesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListUserAuthorizedResourcesHeaders self = new ListUserAuthorizedResourcesHeaders();
        return TeaModel.build(map, self);
    }

    public ListUserAuthorizedResourcesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListUserAuthorizedResourcesHeaders setAccountContext(ListUserAuthorizedResourcesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListUserAuthorizedResourcesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListUserAuthorizedResourcesHeadersAccountContext extends TeaModel {
        @NameInMap("AlidingSsoTicket")
        public String alidingSsoTicket;

        @NameInMap("SsoTicket")
        public String ssoTicket;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListUserAuthorizedResourcesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListUserAuthorizedResourcesHeadersAccountContext self = new ListUserAuthorizedResourcesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListUserAuthorizedResourcesHeadersAccountContext setAlidingSsoTicket(String alidingSsoTicket) {
            this.alidingSsoTicket = alidingSsoTicket;
            return this;
        }
        public String getAlidingSsoTicket() {
            return this.alidingSsoTicket;
        }

        public ListUserAuthorizedResourcesHeadersAccountContext setSsoTicket(String ssoTicket) {
            this.ssoTicket = ssoTicket;
            return this;
        }
        public String getSsoTicket() {
            return this.ssoTicket;
        }

        public ListUserAuthorizedResourcesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
