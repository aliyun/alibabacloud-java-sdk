// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardParametersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public ListDashboardParametersResponseBodyResult result;

    public static ListDashboardParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardParametersResponseBody self = new ListDashboardParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardParametersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDashboardParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDashboardParametersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDashboardParametersResponseBody setResult(ListDashboardParametersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListDashboardParametersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListDashboardParametersResponseBodyResult extends TeaModel {
        @NameInMap("SceneId")
        public java.util.List<String> sceneId;

        @NameInMap("TraceId")
        public java.util.List<String> traceId;

        public static ListDashboardParametersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardParametersResponseBodyResult self = new ListDashboardParametersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDashboardParametersResponseBodyResult setSceneId(java.util.List<String> sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public java.util.List<String> getSceneId() {
            return this.sceneId;
        }

        public ListDashboardParametersResponseBodyResult setTraceId(java.util.List<String> traceId) {
            this.traceId = traceId;
            return this;
        }
        public java.util.List<String> getTraceId() {
            return this.traceId;
        }

    }

}
