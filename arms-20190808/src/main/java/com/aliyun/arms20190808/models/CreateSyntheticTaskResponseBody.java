// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateSyntheticTaskResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * <br>
     * <p>*   1001: The request was successful.</p>
     * <p>*   1002: The request failed.</p>
     * <p>*   1003: Parameter errors occurred.</p>
     * <p>*   1004: Authentication failed.</p>
     * <p>*   1006: The task does not exist.</p>
     * <p>*   1099: Internal errors occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the synthetic monitoring task.</p>
     */
    @NameInMap("Data")
    public CreateSyntheticTaskResponseBodyData data;

    /**
     * <p>The message that is returned when the task failed to be created.</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the synthetic monitoring task.</p>
         */
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
