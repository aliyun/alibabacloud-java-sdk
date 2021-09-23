// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBindingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Binding")
    public Binding binding;

    public static CreateBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingResponseBody self = new CreateBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBindingResponseBody setBinding(Binding binding) {
        this.binding = binding;
        return this;
    }
    public Binding getBinding() {
        return this.binding;
    }

}
