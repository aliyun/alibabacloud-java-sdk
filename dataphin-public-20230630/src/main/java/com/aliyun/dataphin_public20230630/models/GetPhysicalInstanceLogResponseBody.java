// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalInstanceLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskrunLogList")
    public java.util.List<GetPhysicalInstanceLogResponseBodyTaskrunLogList> taskrunLogList;

    public static GetPhysicalInstanceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalInstanceLogResponseBody self = new GetPhysicalInstanceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalInstanceLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhysicalInstanceLogResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPhysicalInstanceLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhysicalInstanceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhysicalInstanceLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPhysicalInstanceLogResponseBody setTaskrunLogList(java.util.List<GetPhysicalInstanceLogResponseBodyTaskrunLogList> taskrunLogList) {
        this.taskrunLogList = taskrunLogList;
        return this;
    }
    public java.util.List<GetPhysicalInstanceLogResponseBodyTaskrunLogList> getTaskrunLogList() {
        return this.taskrunLogList;
    }

    public static class GetPhysicalInstanceLogResponseBodyTaskrunLogList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30 16:48:13</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("LogContent")
        public String logContent;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>tr_23231</p>
         */
        @NameInMap("TaskrunId")
        public String taskrunId;

        public static GetPhysicalInstanceLogResponseBodyTaskrunLogList build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalInstanceLogResponseBodyTaskrunLogList self = new GetPhysicalInstanceLogResponseBodyTaskrunLogList();
            return TeaModel.build(map, self);
        }

        public GetPhysicalInstanceLogResponseBodyTaskrunLogList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPhysicalInstanceLogResponseBodyTaskrunLogList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetPhysicalInstanceLogResponseBodyTaskrunLogList setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public GetPhysicalInstanceLogResponseBodyTaskrunLogList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetPhysicalInstanceLogResponseBodyTaskrunLogList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPhysicalInstanceLogResponseBodyTaskrunLogList setTaskrunId(String taskrunId) {
            this.taskrunId = taskrunId;
            return this;
        }
        public String getTaskrunId() {
            return this.taskrunId;
        }

    }

}
