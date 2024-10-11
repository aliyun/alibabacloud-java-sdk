// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListSceneParametersResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ListSceneParametersResponseBodyResult result;

    public static ListSceneParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSceneParametersResponseBody self = new ListSceneParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSceneParametersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSceneParametersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSceneParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSceneParametersResponseBody setResult(ListSceneParametersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSceneParametersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListSceneParametersResponseBodyResult extends TeaModel {
        @NameInMap("sceneId")
        public java.util.List<String> sceneId;

        @NameInMap("traceId")
        public java.util.List<String> traceId;

        public static ListSceneParametersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSceneParametersResponseBodyResult self = new ListSceneParametersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSceneParametersResponseBodyResult setSceneId(java.util.List<String> sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public java.util.List<String> getSceneId() {
            return this.sceneId;
        }

        public ListSceneParametersResponseBodyResult setTraceId(java.util.List<String> traceId) {
            this.traceId = traceId;
            return this;
        }
        public java.util.List<String> getTraceId() {
            return this.traceId;
        }

    }

}
