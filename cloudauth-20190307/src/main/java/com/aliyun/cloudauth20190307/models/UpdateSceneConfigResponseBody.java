// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateSceneConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSceneConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneConfigResponseBody self = new UpdateSceneConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSceneConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
