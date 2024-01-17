// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ResetSecretByAppKeyForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetSecretByAppKeyForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetSecretByAppKeyForInnerResponseBody self = new ResetSecretByAppKeyForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetSecretByAppKeyForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
