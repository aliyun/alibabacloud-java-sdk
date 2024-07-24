// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateVideoConferenceSettingHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateVideoConferenceSettingHeadersAccountContext accountContext;

    public static UpdateVideoConferenceSettingHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoConferenceSettingHeaders self = new UpdateVideoConferenceSettingHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateVideoConferenceSettingHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateVideoConferenceSettingHeaders setAccountContext(UpdateVideoConferenceSettingHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateVideoConferenceSettingHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateVideoConferenceSettingHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateVideoConferenceSettingHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateVideoConferenceSettingHeadersAccountContext self = new UpdateVideoConferenceSettingHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateVideoConferenceSettingHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
