// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateAntCloudAuthSceneResponseBody extends TeaModel {
    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>A07D5838-2BE0-5D2E-B864-D05ADAA5EDE3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAntCloudAuthSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntCloudAuthSceneResponseBody self = new UpdateAntCloudAuthSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAntCloudAuthSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
