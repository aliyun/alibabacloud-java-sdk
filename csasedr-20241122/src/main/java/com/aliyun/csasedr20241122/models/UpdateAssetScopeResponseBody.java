// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class UpdateAssetScopeResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request, used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A157FA-F957-3A5A-A6B8-5BBB8ADB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAssetScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssetScopeResponseBody self = new UpdateAssetScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAssetScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
