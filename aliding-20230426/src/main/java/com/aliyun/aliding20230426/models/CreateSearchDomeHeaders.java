// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSearchDomeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateSearchDomeHeadersAccountContext accountContext;

    public static CreateSearchDomeHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchDomeHeaders self = new CreateSearchDomeHeaders();
        return TeaModel.build(map, self);
    }

    public CreateSearchDomeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateSearchDomeHeaders setAccountContext(CreateSearchDomeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateSearchDomeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateSearchDomeHeadersAccountContext extends TeaModel {
        @NameInMap("userToken")
        public String userToken;

        public static CreateSearchDomeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateSearchDomeHeadersAccountContext self = new CreateSearchDomeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateSearchDomeHeadersAccountContext setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }
        public String getUserToken() {
            return this.userToken;
        }

    }

}
