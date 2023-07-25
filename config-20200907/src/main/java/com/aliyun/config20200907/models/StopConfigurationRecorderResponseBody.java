// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StopConfigurationRecorderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("StopConfigurationRecorderResult")
    public Boolean stopConfigurationRecorderResult;

    public static StopConfigurationRecorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopConfigurationRecorderResponseBody self = new StopConfigurationRecorderResponseBody();
        return TeaModel.build(map, self);
    }

    public StopConfigurationRecorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopConfigurationRecorderResponseBody setStopConfigurationRecorderResult(Boolean stopConfigurationRecorderResult) {
        this.stopConfigurationRecorderResult = stopConfigurationRecorderResult;
        return this;
    }
    public Boolean getStopConfigurationRecorderResult() {
        return this.stopConfigurationRecorderResult;
    }

}
