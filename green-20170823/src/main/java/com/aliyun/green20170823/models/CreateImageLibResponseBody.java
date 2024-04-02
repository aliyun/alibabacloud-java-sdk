// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateImageLibResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateImageLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageLibResponseBody self = new CreateImageLibResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageLibResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateImageLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
