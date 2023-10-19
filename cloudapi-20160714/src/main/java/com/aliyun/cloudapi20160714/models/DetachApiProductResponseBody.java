// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachApiProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachApiProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachApiProductResponseBody self = new DetachApiProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachApiProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
