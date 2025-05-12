// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A******C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigsResponseBody self = new UpdateConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
