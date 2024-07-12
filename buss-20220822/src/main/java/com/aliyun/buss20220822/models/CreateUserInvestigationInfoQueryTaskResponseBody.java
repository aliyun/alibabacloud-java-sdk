// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class CreateUserInvestigationInfoQueryTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateUserInvestigationInfoQueryTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static CreateUserInvestigationInfoQueryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserInvestigationInfoQueryTaskResponseBody self = new CreateUserInvestigationInfoQueryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserInvestigationInfoQueryTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateUserInvestigationInfoQueryTaskResponseBody setData(CreateUserInvestigationInfoQueryTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateUserInvestigationInfoQueryTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateUserInvestigationInfoQueryTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUserInvestigationInfoQueryTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateUserInvestigationInfoQueryTaskResponseBodyData extends TeaModel {
        @NameInMap("taskId")
        public String taskId;

        public static CreateUserInvestigationInfoQueryTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateUserInvestigationInfoQueryTaskResponseBodyData self = new CreateUserInvestigationInfoQueryTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateUserInvestigationInfoQueryTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
