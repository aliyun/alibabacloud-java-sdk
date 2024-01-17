// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ResetAppKeySecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAppKeySecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAppKeySecretResponseBody self = new ResetAppKeySecretResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAppKeySecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
