// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteSceneResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteSceneResponseBodyResult result;

    public static DeleteSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneResponseBody self = new DeleteSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        @NameInMap("sceneId")
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
