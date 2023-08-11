// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemEstimateResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("workitemTimeEstimate")
    public java.util.List<ListWorkitemEstimateResponseBodyWorkitemTimeEstimate> workitemTimeEstimate;

    public static ListWorkitemEstimateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemEstimateResponseBody self = new ListWorkitemEstimateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkitemEstimateResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListWorkitemEstimateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkitemEstimateResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListWorkitemEstimateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkitemEstimateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkitemEstimateResponseBody setWorkitemTimeEstimate(java.util.List<ListWorkitemEstimateResponseBodyWorkitemTimeEstimate> workitemTimeEstimate) {
        this.workitemTimeEstimate = workitemTimeEstimate;
        return this;
    }
    public java.util.List<ListWorkitemEstimateResponseBodyWorkitemTimeEstimate> getWorkitemTimeEstimate() {
        return this.workitemTimeEstimate;
    }

    public static class ListWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser extends TeaModel {
        @NameInMap("identifier")
        public String identifier;

        @NameInMap("name")
        public String name;

        public static ListWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser build(java.util.Map<String, ?> map) throws Exception {
            ListWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser self = new ListWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser();
            return TeaModel.build(map, self);
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListWorkitemEstimateResponseBodyWorkitemTimeEstimate extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtEnd")
        public Long gmtEnd;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("gmtStart")
        public Long gmtStart;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("recordUser")
        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser recordUser;

        @NameInMap("spentTime")
        public Float spentTime;

        @NameInMap("type")
        public String type;

        @NameInMap("workitemIdentifier")
        public String workitemIdentifier;

        public static ListWorkitemEstimateResponseBodyWorkitemTimeEstimate build(java.util.Map<String, ?> map) throws Exception {
            ListWorkitemEstimateResponseBodyWorkitemTimeEstimate self = new ListWorkitemEstimateResponseBodyWorkitemTimeEstimate();
            return TeaModel.build(map, self);
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setRecordUser(ListWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser recordUser) {
            this.recordUser = recordUser;
            return this;
        }
        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser getRecordUser() {
            return this.recordUser;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setSpentTime(Float spentTime) {
            this.spentTime = spentTime;
            return this;
        }
        public Float getSpentTime() {
            return this.spentTime;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListWorkitemEstimateResponseBodyWorkitemTimeEstimate setWorkitemIdentifier(String workitemIdentifier) {
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

    }

}
