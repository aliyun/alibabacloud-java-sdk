// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachApiProductResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98E4A7DC-1EA6-5E6A-ACFE-91B60CE7D4BB</p>
     */
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
