// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateSyntheticTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSyntheticTaskResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSyntheticTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSyntheticTaskResponseBody self = new CreateSyntheticTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSyntheticTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSyntheticTaskResponseBody setData(CreateSyntheticTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSyntheticTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateSyntheticTaskResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateSyntheticTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSyntheticTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public Long taskId;

        public static CreateSyntheticTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskResponseBodyData self = new CreateSyntheticTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
