// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateResourceFileResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceFileResponseBody self = new CreateResourceFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceFileResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateResourceFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
