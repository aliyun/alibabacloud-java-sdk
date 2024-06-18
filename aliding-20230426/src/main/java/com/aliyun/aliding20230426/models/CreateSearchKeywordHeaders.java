// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSearchKeywordHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateSearchKeywordHeadersAccountContext accountContext;

    public static CreateSearchKeywordHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchKeywordHeaders self = new CreateSearchKeywordHeaders();
        return TeaModel.build(map, self);
    }

    public CreateSearchKeywordHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateSearchKeywordHeaders setAccountContext(CreateSearchKeywordHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateSearchKeywordHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateSearchKeywordHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ba3a9b612345678d8fedf544ef69d19e</p>
         */
        @NameInMap("userToken")
        public String userToken;

        public static CreateSearchKeywordHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateSearchKeywordHeadersAccountContext self = new CreateSearchKeywordHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateSearchKeywordHeadersAccountContext setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }
        public String getUserToken() {
            return this.userToken;
        }

    }

}
