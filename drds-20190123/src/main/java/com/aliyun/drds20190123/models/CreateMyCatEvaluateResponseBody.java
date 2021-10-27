// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateMyCatEvaluateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskIdList")
    public java.util.List<String> taskIdList;

    public static CreateMyCatEvaluateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMyCatEvaluateResponseBody self = new CreateMyCatEvaluateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMyCatEvaluateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMyCatEvaluateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateMyCatEvaluateResponseBody setTaskIdList(java.util.List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }
    public java.util.List<String> getTaskIdList() {
        return this.taskIdList;
    }

}
