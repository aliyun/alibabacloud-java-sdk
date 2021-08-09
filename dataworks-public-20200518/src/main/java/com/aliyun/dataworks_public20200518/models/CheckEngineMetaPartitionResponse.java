// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckEngineMetaPartitionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    public static CheckEngineMetaPartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckEngineMetaPartitionResponse self = new CheckEngineMetaPartitionResponse();
        return TeaModel.build(map, self);
    }

    public CheckEngineMetaPartitionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckEngineMetaPartitionResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
