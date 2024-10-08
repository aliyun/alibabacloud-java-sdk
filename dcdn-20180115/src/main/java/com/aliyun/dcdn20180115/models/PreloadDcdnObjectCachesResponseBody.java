// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PreloadDcdnObjectCachesResponseBody extends TeaModel {
    /**
     * <p>The ID of the prefetch task. Multiple IDs are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>95248880</p>
     */
    @NameInMap("PreloadTaskId")
    public String preloadTaskId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E5BD4B50-7A02-493A-AE0B-97B9024B4135</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PreloadDcdnObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreloadDcdnObjectCachesResponseBody self = new PreloadDcdnObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public PreloadDcdnObjectCachesResponseBody setPreloadTaskId(String preloadTaskId) {
        this.preloadTaskId = preloadTaskId;
        return this;
    }
    public String getPreloadTaskId() {
        return this.preloadTaskId;
    }

    public PreloadDcdnObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
