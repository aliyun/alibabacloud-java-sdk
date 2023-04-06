// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordHistoryConfigurationResponseBody extends TeaModel {
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
