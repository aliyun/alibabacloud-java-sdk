// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListMultiDimTableRecordsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListMultiDimTableRecordsHeadersAccountContext accountContext;

    public static ListMultiDimTableRecordsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListMultiDimTableRecordsHeaders self = new ListMultiDimTableRecordsHeaders();
        return TeaModel.build(map, self);
    }

    public ListMultiDimTableRecordsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListMultiDimTableRecordsHeaders setAccountContext(ListMultiDimTableRecordsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListMultiDimTableRecordsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListMultiDimTableRecordsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListMultiDimTableRecordsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListMultiDimTableRecordsHeadersAccountContext self = new ListMultiDimTableRecordsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListMultiDimTableRecordsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
