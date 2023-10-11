// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UploadMediaHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UploadMediaHeadersAccountContext accountContext;

    public static UploadMediaHeaders build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaHeaders self = new UploadMediaHeaders();
        return TeaModel.build(map, self);
    }

    public UploadMediaHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UploadMediaHeaders setAccountContext(UploadMediaHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UploadMediaHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UploadMediaHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static UploadMediaHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UploadMediaHeadersAccountContext self = new UploadMediaHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UploadMediaHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
