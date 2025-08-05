// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CheckMetaPartitionResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckMetaPartitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaPartitionResponseBody self = new CheckMetaPartitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMetaPartitionResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckMetaPartitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
