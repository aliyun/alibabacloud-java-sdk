// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifySceneResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ModifySceneResponseBodyResult result;

    public static ModifySceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySceneResponseBody self = new ModifySceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("sceneId")
        public String sceneId;

        @NameInMap("status")
        public String status;

        public static ModifySceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifySceneResponseBodyResult self = new ModifySceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifySceneResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifySceneResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifySceneResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ModifySceneResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
