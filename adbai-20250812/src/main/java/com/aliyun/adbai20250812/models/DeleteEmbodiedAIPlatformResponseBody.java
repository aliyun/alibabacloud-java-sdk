// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DeleteEmbodiedAIPlatformResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B47EED99-BFA5-529D-8D85-A6642421D390</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEmbodiedAIPlatformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEmbodiedAIPlatformResponseBody self = new DeleteEmbodiedAIPlatformResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEmbodiedAIPlatformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
