// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateUpstreamAppServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Id")
    public Long id;

    public static CreateUpstreamAppServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUpstreamAppServerResponseBody self = new CreateUpstreamAppServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUpstreamAppServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUpstreamAppServerResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
