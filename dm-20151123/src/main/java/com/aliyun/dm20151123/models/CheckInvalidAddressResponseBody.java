// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckInvalidAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CheckInvalidAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInvalidAddressResponseBody self = new CheckInvalidAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInvalidAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
