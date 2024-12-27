// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginPoolResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOriginPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginPoolResponseBody self = new UpdateOriginPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOriginPoolResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateOriginPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
