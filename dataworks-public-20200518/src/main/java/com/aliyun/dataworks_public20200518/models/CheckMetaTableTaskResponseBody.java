// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckMetaTableTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckMetaTableTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaTableTaskResponseBody self = new CheckMetaTableTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMetaTableTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckMetaTableTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
