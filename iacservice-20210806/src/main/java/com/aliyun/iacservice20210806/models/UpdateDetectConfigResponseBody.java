// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateDetectConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>valueA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateDetectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectConfigResponseBody self = new UpdateDetectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDetectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
