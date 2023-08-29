// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartCloudRecordHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public StartCloudRecordHeadersAccountContext accountContext;

    public static StartCloudRecordHeaders build(java.util.Map<String, ?> map) throws Exception {
        StartCloudRecordHeaders self = new StartCloudRecordHeaders();
        return TeaModel.build(map, self);
    }

    public StartCloudRecordHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public StartCloudRecordHeaders setAccountContext(StartCloudRecordHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public StartCloudRecordHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class StartCloudRecordHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static StartCloudRecordHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordHeadersAccountContext self = new StartCloudRecordHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
