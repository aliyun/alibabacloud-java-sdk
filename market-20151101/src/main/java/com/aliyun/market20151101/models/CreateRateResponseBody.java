// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CreateRateResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRateResponseBody self = new CreateRateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRateResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
