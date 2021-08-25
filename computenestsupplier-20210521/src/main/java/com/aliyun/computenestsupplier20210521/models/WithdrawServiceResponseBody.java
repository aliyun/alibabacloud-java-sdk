// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class WithdrawServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static WithdrawServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WithdrawServiceResponseBody self = new WithdrawServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public WithdrawServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
