// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRoutineBuildConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3558df77-8a7a-4060-a900-2d7949403836</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRoutineBuildConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoutineBuildConfigurationResponseBody self = new UpdateRoutineBuildConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRoutineBuildConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
