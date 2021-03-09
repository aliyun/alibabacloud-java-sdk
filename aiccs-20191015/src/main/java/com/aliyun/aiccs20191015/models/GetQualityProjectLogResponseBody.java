// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectLogResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetQualityProjectLogResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetQualityProjectLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectLogResponseBody self = new GetQualityProjectLogResponseBody();
        return TeaModel.build(map, self);
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

    public GetQualityProjectLogResponseBody setData(java.util.List<GetQualityProjectLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQualityProjectLogResponseBodyData> getData() {
        return this.data;
    }

    public GetQualityProjectLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityProjectLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityProjectLogResponseBodyData extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("ActionData")
        public String actionData;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectCreateTime")
        public String projectCreateTime;

        @NameInMap("ActionTime")
        public String actionTime;

        public static GetQualityProjectLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityProjectLogResponseBodyData self = new GetQualityProjectLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityProjectLogResponseBodyData setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public GetQualityProjectLogResponseBodyData setActionData(String actionData) {
            this.actionData = actionData;
            return this;
        }
        public String getActionData() {
            return this.actionData;
        }

        public GetQualityProjectLogResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetQualityProjectLogResponseBodyData setProjectCreateTime(String projectCreateTime) {
            this.projectCreateTime = projectCreateTime;
            return this;
        }
        public String getProjectCreateTime() {
            return this.projectCreateTime;
        }

        public GetQualityProjectLogResponseBodyData setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

    }

}
