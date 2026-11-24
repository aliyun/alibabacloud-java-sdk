// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataIngestionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDataIngestionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataIngestionTemplateResponseBody self = new UpdateDataIngestionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataIngestionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
