// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineConfigsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListBaselineConfigsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBaselineConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineConfigsResponseBody self = new ListBaselineConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaselineConfigsResponseBody setData(ListBaselineConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBaselineConfigsResponseBodyData getData() {
        return this.data;
    }

    public ListBaselineConfigsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListBaselineConfigsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListBaselineConfigsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaselineConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaselineConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaselineConfigsResponseBodyDataBaselines extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("BaselineType")
        public String baselineType;

        @NameInMap("ExpHour")
        public Integer expHour;

        @NameInMap("ExpMinu")
        public Integer expMinu;

        @NameInMap("HourExpDetail")
        public String hourExpDetail;

        @NameInMap("HourSlaDetail")
        public String hourSlaDetail;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SlaHour")
        public Integer slaHour;

        @NameInMap("SlaMinu")
        public Integer slaMinu;

        @NameInMap("UseFlag")
        public Boolean useFlag;

        public static ListBaselineConfigsResponseBodyDataBaselines build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineConfigsResponseBodyDataBaselines self = new ListBaselineConfigsResponseBodyDataBaselines();
            return TeaModel.build(map, self);
        }

        public ListBaselineConfigsResponseBodyDataBaselines setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setBaselineType(String baselineType) {
            this.baselineType = baselineType;
            return this;
        }
        public String getBaselineType() {
            return this.baselineType;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setExpHour(Integer expHour) {
            this.expHour = expHour;
            return this;
        }
        public Integer getExpHour() {
            return this.expHour;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setExpMinu(Integer expMinu) {
            this.expMinu = expMinu;
            return this;
        }
        public Integer getExpMinu() {
            return this.expMinu;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setHourExpDetail(String hourExpDetail) {
            this.hourExpDetail = hourExpDetail;
            return this;
        }
        public String getHourExpDetail() {
            return this.hourExpDetail;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setHourSlaDetail(String hourSlaDetail) {
            this.hourSlaDetail = hourSlaDetail;
            return this;
        }
        public String getHourSlaDetail() {
            return this.hourSlaDetail;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setSlaHour(Integer slaHour) {
            this.slaHour = slaHour;
            return this;
        }
        public Integer getSlaHour() {
            return this.slaHour;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setSlaMinu(Integer slaMinu) {
            this.slaMinu = slaMinu;
            return this;
        }
        public Integer getSlaMinu() {
            return this.slaMinu;
        }

        public ListBaselineConfigsResponseBodyDataBaselines setUseFlag(Boolean useFlag) {
            this.useFlag = useFlag;
            return this;
        }
        public Boolean getUseFlag() {
            return this.useFlag;
        }

    }

    public static class ListBaselineConfigsResponseBodyData extends TeaModel {
        @NameInMap("Baselines")
        public java.util.List<ListBaselineConfigsResponseBodyDataBaselines> baselines;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBaselineConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineConfigsResponseBodyData self = new ListBaselineConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaselineConfigsResponseBodyData setBaselines(java.util.List<ListBaselineConfigsResponseBodyDataBaselines> baselines) {
            this.baselines = baselines;
            return this;
        }
        public java.util.List<ListBaselineConfigsResponseBodyDataBaselines> getBaselines() {
            return this.baselines;
        }

        public ListBaselineConfigsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBaselineConfigsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBaselineConfigsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
