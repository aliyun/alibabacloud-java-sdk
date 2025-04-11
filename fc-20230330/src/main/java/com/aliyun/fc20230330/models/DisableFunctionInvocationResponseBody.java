// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DisableFunctionInvocationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DisableFunctionInvocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableFunctionInvocationResponseBody self = new DisableFunctionInvocationResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableFunctionInvocationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
