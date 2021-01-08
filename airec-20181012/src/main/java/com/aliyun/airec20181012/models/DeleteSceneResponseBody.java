// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DeleteSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteSceneResponseBodyResult result;

    public static DeleteSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneResponseBody self = new DeleteSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSceneResponseBody setResult(DeleteSceneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteSceneResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteSceneResponseBodyResult extends TeaModel {
        @NameInMap("SceneId")
        public String sceneId;

        public static DeleteSceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteSceneResponseBodyResult self = new DeleteSceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteSceneResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

    }

}
