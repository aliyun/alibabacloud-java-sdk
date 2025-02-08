// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSitePauseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6abd807e-ed2a-44de-ac54-ac38a62472e6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSitePauseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSitePauseResponseBody self = new UpdateSitePauseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSitePauseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
