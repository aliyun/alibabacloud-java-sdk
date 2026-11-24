// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataIngestionResponseBody extends TeaModel {
    @NameInMap("DataIngestionId")
    public String dataIngestionId;

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
