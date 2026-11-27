// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectLogResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task logs of the quality inspection node.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetQualityProjectLogResponseBodyData> data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQualityProjectLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectLogResponseBody self = new GetQualityProjectLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityProjectLogResponseBody setData(java.util.List<GetQualityProjectLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQualityProjectLogResponseBodyData> getData() {
        return this.data;
    }

    public GetQualityProjectLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityProjectLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityProjectLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityProjectLogResponseBodyData extends TeaModel {
        /**
         * <p>The execution data of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Sampling quality inspection details: Total number of eligible samples=0</p>
         */
        @NameInMap("ActionData")
        public String actionData;

        /**
         * <p>The time when the task was executed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-16 08:44:26</p>
         */
        @NameInMap("ActionTime")
        public String actionTime;

        /**
         * <p>The execution type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sampling quality inspection</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The time when the quality inspection task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-07 18:07:18</p>
         */
        @NameInMap("ProjectCreateTime")
        public String projectCreateTime;

        /**
         * <p>The ID of the quality inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>15977801</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetQualityProjectLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityProjectLogResponseBodyData self = new GetQualityProjectLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityProjectLogResponseBodyData setActionData(String actionData) {
            this.actionData = actionData;
            return this;
        }
        public String getActionData() {
            return this.actionData;
        }

        public GetQualityProjectLogResponseBodyData setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public GetQualityProjectLogResponseBodyData setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public GetQualityProjectLogResponseBodyData setProjectCreateTime(String projectCreateTime) {
            this.projectCreateTime = projectCreateTime;
            return this;
        }
        public String getProjectCreateTime() {
            return this.projectCreateTime;
        }

        public GetQualityProjectLogResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
