// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateRangeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateRangeHeadersAccountContext accountContext;

    public static UpdateRangeHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateRangeHeaders self = new UpdateRangeHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateRangeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateRangeHeaders setAccountContext(UpdateRangeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateRangeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateRangeHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static UpdateRangeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateRangeHeadersAccountContext self = new UpdateRangeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateRangeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
