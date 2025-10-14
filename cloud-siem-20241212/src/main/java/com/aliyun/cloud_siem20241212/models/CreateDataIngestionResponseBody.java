// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataIngestionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>di-yxtm3l2rwa7fr5uvxtc7。</p>
     */
    @NameInMap("DataIngestionId")
    public String dataIngestionId;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataIngestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataIngestionResponseBody self = new CreateDataIngestionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataIngestionResponseBody setDataIngestionId(String dataIngestionId) {
        this.dataIngestionId = dataIngestionId;
        return this;
    }
    public String getDataIngestionId() {
        return this.dataIngestionId;
    }

    public CreateDataIngestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
