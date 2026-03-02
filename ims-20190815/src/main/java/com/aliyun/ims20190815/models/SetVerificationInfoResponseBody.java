// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetVerificationInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetVerificationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVerificationInfoResponseBody self = new SetVerificationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVerificationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
