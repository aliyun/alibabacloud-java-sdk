// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSetResponseBody extends TeaModel {
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
