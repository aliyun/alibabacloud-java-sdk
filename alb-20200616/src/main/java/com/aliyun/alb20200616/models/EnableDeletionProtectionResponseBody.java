// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableDeletionProtectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDeletionProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDeletionProtectionResponseBody self = new EnableDeletionProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDeletionProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
