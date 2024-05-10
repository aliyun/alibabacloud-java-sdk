// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFileDownloadInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetFileDownloadInfoHeadersAccountContext accountContext;

    public static GetFileDownloadInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetFileDownloadInfoHeaders self = new GetFileDownloadInfoHeaders();
        return TeaModel.build(map, self);
    }

    public GetFileDownloadInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetFileDownloadInfoHeaders setAccountContext(GetFileDownloadInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetFileDownloadInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetFileDownloadInfoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetFileDownloadInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetFileDownloadInfoHeadersAccountContext self = new GetFileDownloadInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetFileDownloadInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
