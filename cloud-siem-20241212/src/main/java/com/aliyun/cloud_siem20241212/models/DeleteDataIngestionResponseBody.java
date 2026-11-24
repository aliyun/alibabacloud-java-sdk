// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteDataIngestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataIngestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataIngestionResponseBody self = new DeleteDataIngestionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataIngestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
