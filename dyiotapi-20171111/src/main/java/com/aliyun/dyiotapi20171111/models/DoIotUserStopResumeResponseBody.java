// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotUserStopResumeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DoIotUserStopResumeResponseBodyResult result;

    public static DoIotUserStopResumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoIotUserStopResumeResponseBody self = new DoIotUserStopResumeResponseBody();
        return TeaModel.build(map, self);
    }

    public DoIotUserStopResumeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoIotUserStopResumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoIotUserStopResumeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DoIotUserStopResumeResponseBody setResult(DoIotUserStopResumeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DoIotUserStopResumeResponseBodyResult getResult() {
        return this.result;
    }

    public static class DoIotUserStopResumeResponseBodyResult extends TeaModel {
        @NameInMap("ControlResult")
        public Boolean controlResult;

        public static DoIotUserStopResumeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DoIotUserStopResumeResponseBodyResult self = new DoIotUserStopResumeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DoIotUserStopResumeResponseBodyResult setControlResult(Boolean controlResult) {
            this.controlResult = controlResult;
            return this;
        }
        public Boolean getControlResult() {
            return this.controlResult;
        }

    }

}
