// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateResourceCategoryResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>700683DE-0154-56D4-8D76-3B7A2C2C7DF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourceCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceCategoryResponseBody self = new UpdateResourceCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
