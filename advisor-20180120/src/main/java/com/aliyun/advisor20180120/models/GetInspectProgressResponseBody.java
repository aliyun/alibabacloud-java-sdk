// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetInspectProgressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInspectProgressResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>566331F9-****-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInspectProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInspectProgressResponseBody self = new GetInspectProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInspectProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInspectProgressResponseBody setData(GetInspectProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInspectProgressResponseBodyData getData() {
        return this.data;
    }

    public GetInspectProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInspectProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInspectProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInspectProgressResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AllSubtaskCount")
        public Integer allSubtaskCount;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Finish")
        public Boolean finish;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FinishRate")
        public Double finishRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FinishSubtaskCount")
        public Integer finishSubtaskCount;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("LastInspectDate")
        public Long lastInspectDate;

        /**
         * <strong>example:</strong>
         * <p>95***135</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsedTime")
        public Long usedTime;

        public static GetInspectProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInspectProgressResponseBodyData self = new GetInspectProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInspectProgressResponseBodyData setAllSubtaskCount(Integer allSubtaskCount) {
            this.allSubtaskCount = allSubtaskCount;
            return this;
        }
        public Integer getAllSubtaskCount() {
            return this.allSubtaskCount;
        }

        public GetInspectProgressResponseBodyData setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public GetInspectProgressResponseBodyData setFinishRate(Double finishRate) {
            this.finishRate = finishRate;
            return this;
        }
        public Double getFinishRate() {
            return this.finishRate;
        }

        public GetInspectProgressResponseBodyData setFinishSubtaskCount(Integer finishSubtaskCount) {
            this.finishSubtaskCount = finishSubtaskCount;
            return this;
        }
        public Integer getFinishSubtaskCount() {
            return this.finishSubtaskCount;
        }

        public GetInspectProgressResponseBodyData setLastInspectDate(Long lastInspectDate) {
            this.lastInspectDate = lastInspectDate;
            return this;
        }
        public Long getLastInspectDate() {
            return this.lastInspectDate;
        }

        public GetInspectProgressResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetInspectProgressResponseBodyData setUsedTime(Long usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public Long getUsedTime() {
            return this.usedTime;
        }

    }

}
