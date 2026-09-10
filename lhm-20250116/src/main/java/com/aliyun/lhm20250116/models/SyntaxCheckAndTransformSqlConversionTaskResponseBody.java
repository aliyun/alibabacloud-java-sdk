// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SyntaxCheckAndTransformSqlConversionTaskResponseBody extends TeaModel {
    @NameInMap("data")
    public SyntaxCheckAndTransformSqlConversionTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static SyntaxCheckAndTransformSqlConversionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyntaxCheckAndTransformSqlConversionTaskResponseBody self = new SyntaxCheckAndTransformSqlConversionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SyntaxCheckAndTransformSqlConversionTaskResponseBody setData(SyntaxCheckAndTransformSqlConversionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyntaxCheckAndTransformSqlConversionTaskResponseBodyData getData() {
        return this.data;
    }

    public SyntaxCheckAndTransformSqlConversionTaskResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SyntaxCheckAndTransformSqlConversionTaskResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SyntaxCheckAndTransformSqlConversionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyntaxCheckAndTransformSqlConversionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyntaxCheckAndTransformSqlConversionTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        public static SyntaxCheckAndTransformSqlConversionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyntaxCheckAndTransformSqlConversionTaskResponseBodyData self = new SyntaxCheckAndTransformSqlConversionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyntaxCheckAndTransformSqlConversionTaskResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
