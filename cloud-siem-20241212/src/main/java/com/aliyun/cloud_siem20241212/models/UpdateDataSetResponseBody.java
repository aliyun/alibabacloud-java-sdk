// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DE7E77A9-BFAD-5EAA-9B48-A96760E9DF0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSetResponseBody self = new UpdateDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
