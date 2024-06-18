// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateScheduleConfSettingsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateScheduleConfSettingsHeadersAccountContext accountContext;

    public static UpdateScheduleConfSettingsHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleConfSettingsHeaders self = new UpdateScheduleConfSettingsHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleConfSettingsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateScheduleConfSettingsHeaders setAccountContext(UpdateScheduleConfSettingsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateScheduleConfSettingsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateScheduleConfSettingsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateScheduleConfSettingsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleConfSettingsHeadersAccountContext self = new UpdateScheduleConfSettingsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleConfSettingsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
