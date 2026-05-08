// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateContextStoreResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateContextStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextStoreResponseBody self = new UpdateContextStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
