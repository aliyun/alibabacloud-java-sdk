// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFileUploadInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetFileUploadInfoHeadersAccountContext accountContext;

    public static GetFileUploadInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetFileUploadInfoHeaders self = new GetFileUploadInfoHeaders();
        return TeaModel.build(map, self);
    }

    public GetFileUploadInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetFileUploadInfoHeaders setAccountContext(GetFileUploadInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetFileUploadInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetFileUploadInfoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetFileUploadInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetFileUploadInfoHeadersAccountContext self = new GetFileUploadInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetFileUploadInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
