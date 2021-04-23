// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CloseLiveShiftResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CloseLiveShiftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseLiveShiftResponseBody self = new CloseLiveShiftResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseLiveShiftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
