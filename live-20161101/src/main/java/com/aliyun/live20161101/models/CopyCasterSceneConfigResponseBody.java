// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterSceneConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF60DB6A-7FD6-426E-9288-122CC1A5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyCasterSceneConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterSceneConfigResponseBody self = new CopyCasterSceneConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyCasterSceneConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
