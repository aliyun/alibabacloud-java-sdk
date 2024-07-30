// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordHistoryConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetPasswordHistoryConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordHistoryConfigurationResponseBody self = new SetPasswordHistoryConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPasswordHistoryConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
