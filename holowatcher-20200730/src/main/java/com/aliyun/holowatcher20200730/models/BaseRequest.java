// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BaseRequest extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public java.io.InputStream requestId;

    public static BaseRequest build(java.util.Map<String, ?> map) throws Exception {
        BaseRequest self = new BaseRequest();
        return TeaModel.build(map, self);
    }

    public BaseRequest setRequestId(java.io.InputStream requestId) {
        this.requestId = requestId;
        return this;
    }
    public java.io.InputStream getRequestId() {
        return this.requestId;
    }

}
