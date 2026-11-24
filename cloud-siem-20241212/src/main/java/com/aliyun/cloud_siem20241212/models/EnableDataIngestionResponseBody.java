// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class EnableDataIngestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDataIngestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDataIngestionResponseBody self = new EnableDataIngestionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDataIngestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
