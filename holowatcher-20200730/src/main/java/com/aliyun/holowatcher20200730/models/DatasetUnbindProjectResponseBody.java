// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUnbindProjectResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DatasetUnbindProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetUnbindProjectResponseBody self = new DatasetUnbindProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetUnbindProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
