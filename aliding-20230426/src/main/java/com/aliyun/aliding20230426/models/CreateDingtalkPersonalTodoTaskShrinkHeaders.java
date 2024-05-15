// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDingtalkPersonalTodoTaskShrinkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public String accountContextShrink;

    public static CreateDingtalkPersonalTodoTaskShrinkHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateDingtalkPersonalTodoTaskShrinkHeaders self = new CreateDingtalkPersonalTodoTaskShrinkHeaders();
        return TeaModel.build(map, self);
    }

    public CreateDingtalkPersonalTodoTaskShrinkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateDingtalkPersonalTodoTaskShrinkHeaders setAccountContextShrink(String accountContextShrink) {
        this.accountContextShrink = accountContextShrink;
        return this;
    }
    public String getAccountContextShrink() {
        return this.accountContextShrink;
    }

}
