// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class CreateExecuteSqlConversionResponseBody extends TeaModel {
    /**
     * <p>The data body returned by the operation. For the field structure, see the child field descriptions.</p>
     */
    @NameInMap("data")
    public CreateExecuteSqlConversionResponseBodyData data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true (the call is successful) and false (the call failed). If the call failed, use errCode and errMessage to troubleshoot the issue.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateExecuteSqlConversionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExecuteSqlConversionResponseBody self = new CreateExecuteSqlConversionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExecuteSqlConversionResponseBody setData(CreateExecuteSqlConversionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateExecuteSqlConversionResponseBodyData getData() {
        return this.data;
    }

    public CreateExecuteSqlConversionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateExecuteSqlConversionResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateExecuteSqlConversionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExecuteSqlConversionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateExecuteSqlConversionResponseBodyData extends TeaModel {
        /**
         * <p>The task ID that uniquely identifies a task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        public static CreateExecuteSqlConversionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateExecuteSqlConversionResponseBodyData self = new CreateExecuteSqlConversionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateExecuteSqlConversionResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
