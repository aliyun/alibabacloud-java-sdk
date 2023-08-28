// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskExecutorStatusShrinkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public String accountContextShrink;

    public static UpdateTodoTaskExecutorStatusShrinkHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateTodoTaskExecutorStatusShrinkHeaders self = new UpdateTodoTaskExecutorStatusShrinkHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateTodoTaskExecutorStatusShrinkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateTodoTaskExecutorStatusShrinkHeaders setAccountContextShrink(String accountContextShrink) {
        this.accountContextShrink = accountContextShrink;
        return this;
    }
    public String getAccountContextShrink() {
        return this.accountContextShrink;
    }

}
