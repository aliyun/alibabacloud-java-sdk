// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScencegroupFileDownloadurlHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetScencegroupFileDownloadurlHeadersAccountContext accountContext;

    public static GetScencegroupFileDownloadurlHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetScencegroupFileDownloadurlHeaders self = new GetScencegroupFileDownloadurlHeaders();
        return TeaModel.build(map, self);
    }

    public GetScencegroupFileDownloadurlHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetScencegroupFileDownloadurlHeaders setAccountContext(GetScencegroupFileDownloadurlHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetScencegroupFileDownloadurlHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetScencegroupFileDownloadurlHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetScencegroupFileDownloadurlHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetScencegroupFileDownloadurlHeadersAccountContext self = new GetScencegroupFileDownloadurlHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetScencegroupFileDownloadurlHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
