// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultipartFileUploadInfosHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetMultipartFileUploadInfosHeadersAccountContext accountContext;

    public static GetMultipartFileUploadInfosHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetMultipartFileUploadInfosHeaders self = new GetMultipartFileUploadInfosHeaders();
        return TeaModel.build(map, self);
    }

    public GetMultipartFileUploadInfosHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetMultipartFileUploadInfosHeaders setAccountContext(GetMultipartFileUploadInfosHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetMultipartFileUploadInfosHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetMultipartFileUploadInfosHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetMultipartFileUploadInfosHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultipartFileUploadInfosHeadersAccountContext self = new GetMultipartFileUploadInfosHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetMultipartFileUploadInfosHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
