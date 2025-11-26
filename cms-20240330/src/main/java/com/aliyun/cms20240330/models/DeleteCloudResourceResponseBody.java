// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteCloudResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteCloudResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudResourceResponseBody self = new DeleteCloudResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
