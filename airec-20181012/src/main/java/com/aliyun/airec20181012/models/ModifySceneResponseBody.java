// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifySceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ModifySceneResponseBodyResult result;

    public static ModifySceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySceneResponseBody self = new ModifySceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySceneResponseBody setResult(ModifySceneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifySceneResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifySceneResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static ModifySceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifySceneResponseBodyResult self = new ModifySceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifySceneResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifySceneResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifySceneResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ModifySceneResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
