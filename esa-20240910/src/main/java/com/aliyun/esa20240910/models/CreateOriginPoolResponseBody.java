// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginPoolResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOriginPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOriginPoolResponseBody self = new CreateOriginPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOriginPoolResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOriginPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
