// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetYunQiTaskByRecordIdResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetYunQiTaskByRecordIdResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetYunQiTaskByRecordIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYunQiTaskByRecordIdResponseBody self = new GetYunQiTaskByRecordIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYunQiTaskByRecordIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetYunQiTaskByRecordIdResponseBody setData(GetYunQiTaskByRecordIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetYunQiTaskByRecordIdResponseBodyData getData() {
        return this.data;
    }

    public GetYunQiTaskByRecordIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetYunQiTaskByRecordIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetYunQiTaskByRecordIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetYunQiTaskByRecordIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetYunQiTaskByRecordIdResponseBodyData extends TeaModel {
        @NameInMap("chatId")
        public String chatId;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorName")
        public String creatorName;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("evaluationStar")
        public Integer evaluationStar;

        @NameInMap("important")
        public String important;

        @NameInMap("mainDingDepartmentId")
        public String mainDingDepartmentId;

        @NameInMap("mainDingGroupId")
        public String mainDingGroupId;

        @NameInMap("mainDingGroupName")
        public String mainDingGroupName;

        @NameInMap("productName")
        public String productName;

        @NameInMap("recordId")
        public String recordId;

        @NameInMap("status")
        public String status;

        @NameInMap("subDingDepartmentId")
        public String subDingDepartmentId;

        @NameInMap("subDingGroupId")
        public String subDingGroupId;

        @NameInMap("subDingGroupName")
        public String subDingGroupName;

        @NameInMap("title")
        public String title;

        public static GetYunQiTaskByRecordIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetYunQiTaskByRecordIdResponseBodyData self = new GetYunQiTaskByRecordIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetYunQiTaskByRecordIdResponseBodyData setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setEvaluationStar(Integer evaluationStar) {
            this.evaluationStar = evaluationStar;
            return this;
        }
        public Integer getEvaluationStar() {
            return this.evaluationStar;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setImportant(String important) {
            this.important = important;
            return this;
        }
        public String getImportant() {
            return this.important;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setMainDingDepartmentId(String mainDingDepartmentId) {
            this.mainDingDepartmentId = mainDingDepartmentId;
            return this;
        }
        public String getMainDingDepartmentId() {
            return this.mainDingDepartmentId;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setMainDingGroupId(String mainDingGroupId) {
            this.mainDingGroupId = mainDingGroupId;
            return this;
        }
        public String getMainDingGroupId() {
            return this.mainDingGroupId;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setMainDingGroupName(String mainDingGroupName) {
            this.mainDingGroupName = mainDingGroupName;
            return this;
        }
        public String getMainDingGroupName() {
            return this.mainDingGroupName;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setSubDingDepartmentId(String subDingDepartmentId) {
            this.subDingDepartmentId = subDingDepartmentId;
            return this;
        }
        public String getSubDingDepartmentId() {
            return this.subDingDepartmentId;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setSubDingGroupId(String subDingGroupId) {
            this.subDingGroupId = subDingGroupId;
            return this;
        }
        public String getSubDingGroupId() {
            return this.subDingGroupId;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setSubDingGroupName(String subDingGroupName) {
            this.subDingGroupName = subDingGroupName;
            return this;
        }
        public String getSubDingGroupName() {
            return this.subDingGroupName;
        }

        public GetYunQiTaskByRecordIdResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
