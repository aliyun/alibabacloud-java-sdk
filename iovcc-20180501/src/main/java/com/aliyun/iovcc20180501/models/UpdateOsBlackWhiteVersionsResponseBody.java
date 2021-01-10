// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsBlackWhiteVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOsBlackWhiteVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsBlackWhiteVersionsResponseBody self = new UpdateOsBlackWhiteVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOsBlackWhiteVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
