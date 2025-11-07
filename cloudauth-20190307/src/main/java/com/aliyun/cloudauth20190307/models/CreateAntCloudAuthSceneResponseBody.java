// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAntCloudAuthSceneResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01D3BDC6-64C0-58E2-8760-3F1B56AAE299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000015112</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    public static CreateAntCloudAuthSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntCloudAuthSceneResponseBody self = new CreateAntCloudAuthSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntCloudAuthSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntCloudAuthSceneResponseBody setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
