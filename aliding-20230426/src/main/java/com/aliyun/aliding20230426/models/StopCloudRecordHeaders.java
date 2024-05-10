// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StopCloudRecordHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public StopCloudRecordHeadersAccountContext accountContext;

    public static StopCloudRecordHeaders build(java.util.Map<String, ?> map) throws Exception {
        StopCloudRecordHeaders self = new StopCloudRecordHeaders();
        return TeaModel.build(map, self);
    }

    public StopCloudRecordHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public StopCloudRecordHeaders setAccountContext(StopCloudRecordHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public StopCloudRecordHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class StopCloudRecordHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static StopCloudRecordHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            StopCloudRecordHeadersAccountContext self = new StopCloudRecordHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public StopCloudRecordHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
