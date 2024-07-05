// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetBindingResponseBody extends TeaModel {
    @NameInMap("Binding")
    public Binding binding;

    /**
     * <strong>example:</strong>
     * <p>AEFCD467-C928-4A36-951A-6EB5A592****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBindingResponseBody self = new GetBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBindingResponseBody setBinding(Binding binding) {
        this.binding = binding;
        return this;
    }
    public Binding getBinding() {
        return this.binding;
    }

    public GetBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
