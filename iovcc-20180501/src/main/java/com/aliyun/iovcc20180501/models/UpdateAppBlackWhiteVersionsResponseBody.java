// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppBlackWhiteVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppBlackWhiteVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppBlackWhiteVersionsResponseBody self = new UpdateAppBlackWhiteVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppBlackWhiteVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
