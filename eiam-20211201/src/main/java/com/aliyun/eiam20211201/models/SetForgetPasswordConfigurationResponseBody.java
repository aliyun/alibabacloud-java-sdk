// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetForgetPasswordConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetForgetPasswordConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetForgetPasswordConfigurationResponseBody self = new SetForgetPasswordConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public SetForgetPasswordConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
