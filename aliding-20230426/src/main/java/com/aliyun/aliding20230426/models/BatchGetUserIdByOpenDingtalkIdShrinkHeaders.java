// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetUserIdByOpenDingtalkIdShrinkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public String accountContextShrink;

    public static BatchGetUserIdByOpenDingtalkIdShrinkHeaders build(java.util.Map<String, ?> map) throws Exception {
        BatchGetUserIdByOpenDingtalkIdShrinkHeaders self = new BatchGetUserIdByOpenDingtalkIdShrinkHeaders();
        return TeaModel.build(map, self);
    }

    public BatchGetUserIdByOpenDingtalkIdShrinkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public BatchGetUserIdByOpenDingtalkIdShrinkHeaders setAccountContextShrink(String accountContextShrink) {
        this.accountContextShrink = accountContextShrink;
        return this;
    }
    public String getAccountContextShrink() {
        return this.accountContextShrink;
    }

}
