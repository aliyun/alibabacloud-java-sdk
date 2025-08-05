// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class AddToMetaCategoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static AddToMetaCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddToMetaCategoryResponseBody self = new AddToMetaCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddToMetaCategoryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public AddToMetaCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
