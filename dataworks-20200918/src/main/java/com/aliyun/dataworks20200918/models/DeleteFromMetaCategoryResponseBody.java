// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteFromMetaCategoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFromMetaCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFromMetaCategoryResponseBody self = new DeleteFromMetaCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFromMetaCategoryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteFromMetaCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
