// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateCloudResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateCloudResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudResourceResponseBody self = new CreateCloudResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
