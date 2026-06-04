// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MeetingFlashMinutesTextHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public MeetingFlashMinutesTextHeadersAccountContext accountContext;

    public static MeetingFlashMinutesTextHeaders build(java.util.Map<String, ?> map) throws Exception {
        MeetingFlashMinutesTextHeaders self = new MeetingFlashMinutesTextHeaders();
        return TeaModel.build(map, self);
    }

    public MeetingFlashMinutesTextHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public MeetingFlashMinutesTextHeaders setAccountContext(MeetingFlashMinutesTextHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public MeetingFlashMinutesTextHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class MeetingFlashMinutesTextHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static MeetingFlashMinutesTextHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesTextHeadersAccountContext self = new MeetingFlashMinutesTextHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesTextHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
