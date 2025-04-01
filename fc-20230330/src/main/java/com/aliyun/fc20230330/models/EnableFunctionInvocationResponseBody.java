// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EnableFunctionInvocationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static EnableFunctionInvocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableFunctionInvocationResponseBody self = new EnableFunctionInvocationResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableFunctionInvocationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
