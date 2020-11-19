// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateMyCatEvaluateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskIdList")
    @Validation(required = true)
    public java.util.List<String> taskIdList;

    public static CreateMyCatEvaluateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMyCatEvaluateResponse self = new CreateMyCatEvaluateResponse();
        return TeaModel.build(map, self);
    }

    public CreateMyCatEvaluateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMyCatEvaluateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateMyCatEvaluateResponse setTaskIdList(java.util.List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }
    public java.util.List<String> getTaskIdList() {
        return this.taskIdList;
    }

}
