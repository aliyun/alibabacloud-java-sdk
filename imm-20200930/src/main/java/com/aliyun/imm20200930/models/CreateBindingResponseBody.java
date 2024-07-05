// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBindingResponseBody extends TeaModel {
    @NameInMap("Binding")
    public Binding binding;

    /**
     * <strong>example:</strong>
     * <p>5F74C5C9-5AC0-49F9-914D-E01589D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingResponseBody self = new CreateBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBindingResponseBody setBinding(Binding binding) {
        this.binding = binding;
        return this;
    }
    public Binding getBinding() {
        return this.binding;
    }

    public CreateBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
