// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTableDataByFormInstanceIdTableIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListTableDataByFormInstanceIdTableIdHeadersAccountContext accountContext;

    public static ListTableDataByFormInstanceIdTableIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListTableDataByFormInstanceIdTableIdHeaders self = new ListTableDataByFormInstanceIdTableIdHeaders();
        return TeaModel.build(map, self);
    }

    public ListTableDataByFormInstanceIdTableIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListTableDataByFormInstanceIdTableIdHeaders setAccountContext(ListTableDataByFormInstanceIdTableIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListTableDataByFormInstanceIdTableIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListTableDataByFormInstanceIdTableIdHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static ListTableDataByFormInstanceIdTableIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListTableDataByFormInstanceIdTableIdHeadersAccountContext self = new ListTableDataByFormInstanceIdTableIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListTableDataByFormInstanceIdTableIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
