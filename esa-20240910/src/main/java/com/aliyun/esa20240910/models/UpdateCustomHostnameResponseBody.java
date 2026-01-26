// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomHostnameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomHostnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomHostnameResponseBody self = new UpdateCustomHostnameResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomHostnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
