// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordExpirationConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPasswordExpirationConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordExpirationConfigurationResponseBody self = new SetPasswordExpirationConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPasswordExpirationConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
