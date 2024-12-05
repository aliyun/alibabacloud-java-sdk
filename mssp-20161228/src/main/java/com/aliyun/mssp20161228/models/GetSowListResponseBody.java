// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSowListResponseBody extends TeaModel {
    /**
     * <p>Interface response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetSowListResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt information for the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FA8883BC-CB18-5E28-A113-8249917CA05E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful. - <strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSowListResponseBody self = new GetSowListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSowListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSowListResponseBody setData(java.util.List<GetSowListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSowListResponseBodyData> getData() {
        return this.data;
    }

    public GetSowListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSowListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSowListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSowListResponseBodyData extends TeaModel {
        /**
         * <p>Completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-28 16:19:35</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>Operation remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>新建</p>
         */
        @NameInMap("OperateRemark")
        public String operateRemark;

        /**
         * <p>Progress.</p>
         * 
         * <strong>example:</strong>
         * <p>IN_PREPARATION</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>Record count.</p>
         * 
         * <strong>example:</strong>
         * <p>173</p>
         */
        @NameInMap("RecordCount")
        public Integer recordCount;

        /**
         * <p>Start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-24 16:51:26</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Task type.</p>
         * 
         * <strong>example:</strong>
         * <p>安全风险评估</p>
         */
        @NameInMap("TaskTypeName")
        public String taskTypeName;

        /**
         * <p>Work order name.</p>
         * 
         * <strong>example:</strong>
         * <p>安全产品配置问题与超量提醒</p>
         */
        @NameInMap("WorkOrderName")
        public String workOrderName;

        public static GetSowListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSowListResponseBodyData self = new GetSowListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSowListResponseBodyData setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetSowListResponseBodyData setOperateRemark(String operateRemark) {
            this.operateRemark = operateRemark;
            return this;
        }
        public String getOperateRemark() {
            return this.operateRemark;
        }

        public GetSowListResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetSowListResponseBodyData setRecordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Integer getRecordCount() {
            return this.recordCount;
        }

        public GetSowListResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetSowListResponseBodyData setTaskTypeName(String taskTypeName) {
            this.taskTypeName = taskTypeName;
            return this;
        }
        public String getTaskTypeName() {
            return this.taskTypeName;
        }

        public GetSowListResponseBodyData setWorkOrderName(String workOrderName) {
            this.workOrderName = workOrderName;
            return this;
        }
        public String getWorkOrderName() {
            return this.workOrderName;
        }

    }

}
