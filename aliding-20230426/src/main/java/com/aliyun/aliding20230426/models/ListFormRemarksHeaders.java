// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListFormRemarksHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListFormRemarksHeadersAccountContext accountContext;

    public static ListFormRemarksHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListFormRemarksHeaders self = new ListFormRemarksHeaders();
        return TeaModel.build(map, self);
    }

    public ListFormRemarksHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListFormRemarksHeaders setAccountContext(ListFormRemarksHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListFormRemarksHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListFormRemarksHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListFormRemarksHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListFormRemarksHeadersAccountContext self = new ListFormRemarksHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListFormRemarksHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
