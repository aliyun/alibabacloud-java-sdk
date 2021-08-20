// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckEngineMetaPartitionResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckEngineMetaPartitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckEngineMetaPartitionResponseBody self = new CheckEngineMetaPartitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckEngineMetaPartitionResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckEngineMetaPartitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
