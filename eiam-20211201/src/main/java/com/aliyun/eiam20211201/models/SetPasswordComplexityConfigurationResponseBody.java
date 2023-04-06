// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordComplexityConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPasswordComplexityConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordComplexityConfigurationResponseBody self = new SetPasswordComplexityConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPasswordComplexityConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
