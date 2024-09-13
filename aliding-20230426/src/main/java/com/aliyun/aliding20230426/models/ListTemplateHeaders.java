// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTemplateHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListTemplateHeadersAccountContext accountContext;

    public static ListTemplateHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateHeaders self = new ListTemplateHeaders();
        return TeaModel.build(map, self);
    }

    public ListTemplateHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListTemplateHeaders setAccountContext(ListTemplateHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListTemplateHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListTemplateHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListTemplateHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateHeadersAccountContext self = new ListTemplateHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListTemplateHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
