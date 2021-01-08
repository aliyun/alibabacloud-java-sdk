// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class CreateSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateSceneResponseBodyResult result;

    public static CreateSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneResponseBody self = new CreateSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSceneResponseBody setResult(CreateSceneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateSceneResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateSceneResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static CreateSceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSceneResponseBodyResult self = new CreateSceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateSceneResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateSceneResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateSceneResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public CreateSceneResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
