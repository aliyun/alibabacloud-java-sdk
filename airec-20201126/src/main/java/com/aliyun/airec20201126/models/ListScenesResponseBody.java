// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListScenesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListScenesResponseBodyResult> result;

    public static ListScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScenesResponseBody self = new ListScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScenesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScenesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScenesResponseBody setResult(java.util.List<ListScenesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListScenesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListScenesResponseBodyResult extends TeaModel {
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("sceneId")
        public String sceneId;

        @NameInMap("status")
        public String status;

        public static ListScenesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListScenesResponseBodyResult self = new ListScenesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListScenesResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListScenesResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListScenesResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListScenesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
