// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateUpstreamAppKeyRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Id")
    public Long id;

    public static CreateUpstreamAppKeyRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUpstreamAppKeyRelationResponseBody self = new CreateUpstreamAppKeyRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUpstreamAppKeyRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUpstreamAppKeyRelationResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
