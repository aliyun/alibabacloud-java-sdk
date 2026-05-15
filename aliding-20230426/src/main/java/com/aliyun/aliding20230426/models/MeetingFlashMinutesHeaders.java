// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MeetingFlashMinutesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public MeetingFlashMinutesHeadersAccountContext accountContext;

    public static MeetingFlashMinutesHeaders build(java.util.Map<String, ?> map) throws Exception {
        MeetingFlashMinutesHeaders self = new MeetingFlashMinutesHeaders();
        return TeaModel.build(map, self);
    }

    public MeetingFlashMinutesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public MeetingFlashMinutesHeaders setAccountContext(MeetingFlashMinutesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public MeetingFlashMinutesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class MeetingFlashMinutesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static MeetingFlashMinutesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesHeadersAccountContext self = new MeetingFlashMinutesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
