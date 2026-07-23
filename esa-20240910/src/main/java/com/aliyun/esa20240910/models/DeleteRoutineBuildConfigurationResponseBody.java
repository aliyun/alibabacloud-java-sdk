// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineBuildConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F32C57AA-7BF8-49AE-A2CC-9F42390F5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRoutineBuildConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineBuildConfigurationResponseBody self = new DeleteRoutineBuildConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineBuildConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
