// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineStepLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Object")
    public GetPipelineStepLogResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetPipelineStepLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineStepLogResponseBody self = new GetPipelineStepLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineStepLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineStepLogResponseBody setObject(GetPipelineStepLogResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetPipelineStepLogResponseBodyObject getObject() {
        return this.object;
    }

    public GetPipelineStepLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineStepLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineStepLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPipelineStepLogResponseBodyObject extends TeaModel {
        @NameInMap("Logs")
        public String logs;

        @NameInMap("Last")
        public Integer last;

        @NameInMap("More")
        public Boolean more;

        public static GetPipelineStepLogResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineStepLogResponseBodyObject self = new GetPipelineStepLogResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetPipelineStepLogResponseBodyObject setLogs(String logs) {
            this.logs = logs;
            return this;
        }
        public String getLogs() {
            return this.logs;
        }

        public GetPipelineStepLogResponseBodyObject setLast(Integer last) {
            this.last = last;
            return this;
        }
        public Integer getLast() {
            return this.last;
        }

        public GetPipelineStepLogResponseBodyObject setMore(Boolean more) {
            this.more = more;
            return this;
        }
        public Boolean getMore() {
            return this.more;
        }

    }

}
