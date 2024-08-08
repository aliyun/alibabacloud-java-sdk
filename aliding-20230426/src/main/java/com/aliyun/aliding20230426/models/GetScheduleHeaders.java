// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScheduleHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetScheduleHeadersAccountContext accountContext;

    public static GetScheduleHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleHeaders self = new GetScheduleHeaders();
        return TeaModel.build(map, self);
    }

    public GetScheduleHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetScheduleHeaders setAccountContext(GetScheduleHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetScheduleHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetScheduleHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetScheduleHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleHeadersAccountContext self = new GetScheduleHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetScheduleHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
