// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteAntCloudAuthSceneResponseBody extends TeaModel {
    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>80D1ACD4-1C7D-53CB-8C54-3758FF03C762</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAntCloudAuthSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntCloudAuthSceneResponseBody self = new DeleteAntCloudAuthSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAntCloudAuthSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
