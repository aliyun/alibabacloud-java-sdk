// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidLoopEvaluationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListPidLoopEvaluationsResponseData> data;

    public static ListPidLoopEvaluationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPidLoopEvaluationsResponse self = new ListPidLoopEvaluationsResponse();
        return TeaModel.build(map, self);
    }

    public ListPidLoopEvaluationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPidLoopEvaluationsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPidLoopEvaluationsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPidLoopEvaluationsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPidLoopEvaluationsResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPidLoopEvaluationsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPidLoopEvaluationsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPidLoopEvaluationsResponse setData(java.util.List<ListPidLoopEvaluationsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPidLoopEvaluationsResponseData> getData() {
        return this.data;
    }

    public static class ListPidLoopEvaluationsResponseData extends TeaModel {
        @NameInMap("AfterPidParameters")
        @Validation(required = true)
        public java.util.Map<String, ?> afterPidParameters;

        @NameInMap("BeforePidParameters")
        @Validation(required = true)
        public java.util.Map<String, ?> beforePidParameters;

        @NameInMap("PidLoopRemark")
        @Validation(required = true)
        public String pidLoopRemark;

        @NameInMap("AssessTime")
        @Validation(required = true)
        public Long assessTime;

        @NameInMap("Robust")
        @Validation(required = true)
        public Float robust;

        @NameInMap("ValidOperationRate")
        @Validation(required = true)
        public Float validOperationRate;

        @NameInMap("OperationRate")
        @Validation(required = true)
        public Float operationRate;

        @NameInMap("PerformMetrics")
        @Validation(required = true)
        public Float performMetrics;

        @NameInMap("MultipleScore")
        @Validation(required = true)
        public Float multipleScore;

        @NameInMap("Grade")
        @Validation(required = true)
        public String grade;

        @NameInMap("PidLoopName")
        @Validation(required = true)
        public String pidLoopName;

        @NameInMap("PidProjectId")
        @Validation(required = true)
        public String pidProjectId;

        @NameInMap("PidLoopId")
        @Validation(required = true)
        public String pidLoopId;

        @NameInMap("PidLoopParameterId")
        @Validation(required = true)
        public String pidLoopParameterId;

        public static ListPidLoopEvaluationsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListPidLoopEvaluationsResponseData self = new ListPidLoopEvaluationsResponseData();
            return TeaModel.build(map, self);
        }

        public ListPidLoopEvaluationsResponseData setAfterPidParameters(java.util.Map<String, ?> afterPidParameters) {
            this.afterPidParameters = afterPidParameters;
            return this;
        }
        public java.util.Map<String, ?> getAfterPidParameters() {
            return this.afterPidParameters;
        }

        public ListPidLoopEvaluationsResponseData setBeforePidParameters(java.util.Map<String, ?> beforePidParameters) {
            this.beforePidParameters = beforePidParameters;
            return this;
        }
        public java.util.Map<String, ?> getBeforePidParameters() {
            return this.beforePidParameters;
        }

        public ListPidLoopEvaluationsResponseData setPidLoopRemark(String pidLoopRemark) {
            this.pidLoopRemark = pidLoopRemark;
            return this;
        }
        public String getPidLoopRemark() {
            return this.pidLoopRemark;
        }

        public ListPidLoopEvaluationsResponseData setAssessTime(Long assessTime) {
            this.assessTime = assessTime;
            return this;
        }
        public Long getAssessTime() {
            return this.assessTime;
        }

        public ListPidLoopEvaluationsResponseData setRobust(Float robust) {
            this.robust = robust;
            return this;
        }
        public Float getRobust() {
            return this.robust;
        }

        public ListPidLoopEvaluationsResponseData setValidOperationRate(Float validOperationRate) {
            this.validOperationRate = validOperationRate;
            return this;
        }
        public Float getValidOperationRate() {
            return this.validOperationRate;
        }

        public ListPidLoopEvaluationsResponseData setOperationRate(Float operationRate) {
            this.operationRate = operationRate;
            return this;
        }
        public Float getOperationRate() {
            return this.operationRate;
        }

        public ListPidLoopEvaluationsResponseData setPerformMetrics(Float performMetrics) {
            this.performMetrics = performMetrics;
            return this;
        }
        public Float getPerformMetrics() {
            return this.performMetrics;
        }

        public ListPidLoopEvaluationsResponseData setMultipleScore(Float multipleScore) {
            this.multipleScore = multipleScore;
            return this;
        }
        public Float getMultipleScore() {
            return this.multipleScore;
        }

        public ListPidLoopEvaluationsResponseData setGrade(String grade) {
            this.grade = grade;
            return this;
        }
        public String getGrade() {
            return this.grade;
        }

        public ListPidLoopEvaluationsResponseData setPidLoopName(String pidLoopName) {
            this.pidLoopName = pidLoopName;
            return this;
        }
        public String getPidLoopName() {
            return this.pidLoopName;
        }

        public ListPidLoopEvaluationsResponseData setPidProjectId(String pidProjectId) {
            this.pidProjectId = pidProjectId;
            return this;
        }
        public String getPidProjectId() {
            return this.pidProjectId;
        }

        public ListPidLoopEvaluationsResponseData setPidLoopId(String pidLoopId) {
            this.pidLoopId = pidLoopId;
            return this;
        }
        public String getPidLoopId() {
            return this.pidLoopId;
        }

        public ListPidLoopEvaluationsResponseData setPidLoopParameterId(String pidLoopParameterId) {
            this.pidLoopParameterId = pidLoopParameterId;
            return this;
        }
        public String getPidLoopParameterId() {
            return this.pidLoopParameterId;
        }

    }

}
