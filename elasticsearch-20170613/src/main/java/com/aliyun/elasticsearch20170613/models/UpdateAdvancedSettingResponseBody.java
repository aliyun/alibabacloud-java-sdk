// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAdvancedSettingResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: garbage collector configuration changed successfully</p>
     * <p>*   false: garbage collector configuration changed successfully failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateAdvancedSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdvancedSettingResponseBody self = new UpdateAdvancedSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAdvancedSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAdvancedSettingResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
