// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateSceneResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateSceneResponseBodyResult result;

    public static CreateSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneResponseBody self = new CreateSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("sceneId")
        public String sceneId;

        @NameInMap("status")
        public String status;

        public static CreateSceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSceneResponseBodyResult self = new CreateSceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateSceneResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateSceneResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateSceneResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public CreateSceneResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
