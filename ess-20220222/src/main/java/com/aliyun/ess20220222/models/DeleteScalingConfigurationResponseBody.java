// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>auditing</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingConfigurationResponseBody self = new DeleteScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
