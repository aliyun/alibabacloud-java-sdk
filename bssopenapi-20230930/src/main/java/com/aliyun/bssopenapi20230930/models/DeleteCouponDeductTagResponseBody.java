// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteCouponDeductTagResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCouponDeductTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCouponDeductTagResponseBody self = new DeleteCouponDeductTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCouponDeductTagResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteCouponDeductTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
