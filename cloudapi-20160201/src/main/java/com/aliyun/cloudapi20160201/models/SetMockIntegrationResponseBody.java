// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetMockIntegrationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetMockIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMockIntegrationResponseBody self = new SetMockIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMockIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
