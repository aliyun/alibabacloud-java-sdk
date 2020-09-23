// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineConfigsResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListBaselineConfigsResponseData data;

    public static ListBaselineConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineConfigsResponse self = new ListBaselineConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListBaselineConfigsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListBaselineConfigsResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListBaselineConfigsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListBaselineConfigsResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaselineConfigsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaselineConfigsResponse setData(ListBaselineConfigsResponseData data) {
        this.data = data;
        return this;
    }
    public ListBaselineConfigsResponseData getData() {
        return this.data;
    }

    public static class ListBaselineConfigsResponseDataBaselines extends TeaModel {
        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("UseFlag")
        @Validation(required = true)
        public Boolean useFlag;

        @NameInMap("BaselineType")
        @Validation(required = true)
        public String baselineType;

        @NameInMap("ExpHour")
        @Validation(required = true)
        public Integer expHour;

        @NameInMap("ExpMinu")
        @Validation(required = true)
        public Integer expMinu;

        @NameInMap("SlaHour")
        @Validation(required = true)
        public Integer slaHour;

        @NameInMap("SlaMinu")
        @Validation(required = true)
        public Integer slaMinu;

        @NameInMap("HourExpDetail")
        @Validation(required = true)
        public String hourExpDetail;

        @NameInMap("HourSlaDetail")
        @Validation(required = true)
        public String hourSlaDetail;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        public static ListBaselineConfigsResponseDataBaselines build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineConfigsResponseDataBaselines self = new ListBaselineConfigsResponseDataBaselines();
            return TeaModel.build(map, self);
        }

        public ListBaselineConfigsResponseDataBaselines setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListBaselineConfigsResponseDataBaselines setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListBaselineConfigsResponseDataBaselines setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public ListBaselineConfigsResponseDataBaselines setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBaselineConfigsResponseDataBaselines setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBaselineConfigsResponseDataBaselines setUseFlag(Boolean useFlag) {
            this.useFlag = useFlag;
            return this;
        }
        public Boolean getUseFlag() {
            return this.useFlag;
        }

        public ListBaselineConfigsResponseDataBaselines setBaselineType(String baselineType) {
            this.baselineType = baselineType;
            return this;
        }
        public String getBaselineType() {
            return this.baselineType;
        }

        public ListBaselineConfigsResponseDataBaselines setExpHour(Integer expHour) {
            this.expHour = expHour;
            return this;
        }
        public Integer getExpHour() {
            return this.expHour;
        }

        public ListBaselineConfigsResponseDataBaselines setExpMinu(Integer expMinu) {
            this.expMinu = expMinu;
            return this;
        }
        public Integer getExpMinu() {
            return this.expMinu;
        }

        public ListBaselineConfigsResponseDataBaselines setSlaHour(Integer slaHour) {
            this.slaHour = slaHour;
            return this;
        }
        public Integer getSlaHour() {
            return this.slaHour;
        }

        public ListBaselineConfigsResponseDataBaselines setSlaMinu(Integer slaMinu) {
            this.slaMinu = slaMinu;
            return this;
        }
        public Integer getSlaMinu() {
            return this.slaMinu;
        }

        public ListBaselineConfigsResponseDataBaselines setHourExpDetail(String hourExpDetail) {
            this.hourExpDetail = hourExpDetail;
            return this;
        }
        public String getHourExpDetail() {
            return this.hourExpDetail;
        }

        public ListBaselineConfigsResponseDataBaselines setHourSlaDetail(String hourSlaDetail) {
            this.hourSlaDetail = hourSlaDetail;
            return this;
        }
        public String getHourSlaDetail() {
            return this.hourSlaDetail;
        }

        public ListBaselineConfigsResponseDataBaselines setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

    public static class ListBaselineConfigsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Baselines")
        @Validation(required = true)
        public java.util.List<ListBaselineConfigsResponseDataBaselines> baselines;

        public static ListBaselineConfigsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineConfigsResponseData self = new ListBaselineConfigsResponseData();
            return TeaModel.build(map, self);
        }

        public ListBaselineConfigsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBaselineConfigsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBaselineConfigsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListBaselineConfigsResponseData setBaselines(java.util.List<ListBaselineConfigsResponseDataBaselines> baselines) {
            this.baselines = baselines;
            return this;
        }
        public java.util.List<ListBaselineConfigsResponseDataBaselines> getBaselines() {
            return this.baselines;
        }

    }

}
