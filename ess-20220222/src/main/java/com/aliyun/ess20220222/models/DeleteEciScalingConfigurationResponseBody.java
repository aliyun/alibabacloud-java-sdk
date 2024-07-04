// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteEciScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * <p>The request ID is consistently returned in the response, irrespective of whether the request is executed successfully or encounters an error.</p>
     * 
     * <strong>example:</strong>
     * <p>45D5B0AD-3B00-4A9B-9911-6D5303B06712</p>
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
