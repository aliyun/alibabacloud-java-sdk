// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluateTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateEvaluateTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateEvaluateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluateTaskResponseBody self = new CreateEvaluateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEvaluateTaskResponseBody setData(CreateEvaluateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEvaluateTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateEvaluateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEvaluateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEvaluateTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskIds")
        public java.util.List<String> taskIds;

        public static CreateEvaluateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEvaluateTaskResponseBodyData self = new CreateEvaluateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEvaluateTaskResponseBodyData setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

    }

}
