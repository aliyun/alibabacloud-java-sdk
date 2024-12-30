// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAdHocTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ExecuteResult")
    public GetAdHocTaskResultResponseBodyExecuteResult executeResult;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAdHocTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdHocTaskResultResponseBody self = new GetAdHocTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdHocTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAdHocTaskResultResponseBody setExecuteResult(GetAdHocTaskResultResponseBodyExecuteResult executeResult) {
        this.executeResult = executeResult;
        return this;
    }
    public GetAdHocTaskResultResponseBodyExecuteResult getExecuteResult() {
        return this.executeResult;
    }

    public GetAdHocTaskResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAdHocTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAdHocTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdHocTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAdHocTaskResultResponseBodyExecuteResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>t_2242892326444990464_20210125_2242892326444990465</p>
         */
        @NameInMap("ScheduleTaskId")
        public String scheduleTaskId;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute_SQL_300000843_1611548758327</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetAdHocTaskResultResponseBodyExecuteResult build(java.util.Map<String, ?> map) throws Exception {
            GetAdHocTaskResultResponseBodyExecuteResult self = new GetAdHocTaskResultResponseBodyExecuteResult();
            return TeaModel.build(map, self);
        }

        public GetAdHocTaskResultResponseBodyExecuteResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAdHocTaskResultResponseBodyExecuteResult setScheduleTaskId(String scheduleTaskId) {
            this.scheduleTaskId = scheduleTaskId;
            return this;
        }
        public String getScheduleTaskId() {
            return this.scheduleTaskId;
        }

        public GetAdHocTaskResultResponseBodyExecuteResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
