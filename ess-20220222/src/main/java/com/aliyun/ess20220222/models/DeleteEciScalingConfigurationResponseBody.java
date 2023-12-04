// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteEciScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. This request ID is returned regardless of whether the request is successful.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEciScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEciScalingConfigurationResponseBody self = new DeleteEciScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEciScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
