// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryRecordMinutesUrlShrinkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public String accountContextShrink;

    public static QueryRecordMinutesUrlShrinkHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordMinutesUrlShrinkHeaders self = new QueryRecordMinutesUrlShrinkHeaders();
        return TeaModel.build(map, self);
    }

    public QueryRecordMinutesUrlShrinkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryRecordMinutesUrlShrinkHeaders setAccountContextShrink(String accountContextShrink) {
        this.accountContextShrink = accountContextShrink;
        return this;
    }
    public String getAccountContextShrink() {
        return this.accountContextShrink;
    }

}
