// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetConferenceHostsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SetConferenceHostsHeadersAccountContext accountContext;

    public static SetConferenceHostsHeaders build(java.util.Map<String, ?> map) throws Exception {
        SetConferenceHostsHeaders self = new SetConferenceHostsHeaders();
        return TeaModel.build(map, self);
    }

    public SetConferenceHostsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SetConferenceHostsHeaders setAccountContext(SetConferenceHostsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SetConferenceHostsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SetConferenceHostsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SetConferenceHostsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SetConferenceHostsHeadersAccountContext self = new SetConferenceHostsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SetConferenceHostsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
