// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineConfigsResponseBody extends TeaModel {
    /**
     * <p>The return results of the request.</p>
     */
    @NameInMap("Data")
    public ListBaselineConfigsResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The unique ID of the request. You can troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
        /**
         * <p>The ID of the baseline.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the baseline.</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The type of the baseline. Valid values: DAILY and HOURLY. A value of DAILY indicates that the baseline is a day-level baseline. A value of HOURLY indicates that the baseline is an hour-level baseline.</p>
         */
        @NameInMap("BaselineType")
        public String baselineType;

        /**
         * <p>The hour in the alert time of the day-level baseline. Valid values: 0 to 47.</p>
         */
        @NameInMap("ExpHour")
        public Integer expHour;

        /**
         * <p>The minute in the alert time of the day-level baseline. Valid values: 0 to 59.</p>
         */
        @NameInMap("ExpMinu")
        public Integer expMinu;

        /**
         * <p>The alert time of the hour-level baseline. This parameter is presented as key-value pairs in the JSON format. The key indicates the ID of the cycle, and the value is presented in the hh:mm format. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
         */
        @NameInMap("HourExpDetail")
        public String hourExpDetail;

        /**
         * <p>The committed time of the hour-level baseline. This parameter is presented as key-value pairs in the JSON format. The key indicates the ID of the cycle, and the value is presented in the hh:mm format. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
         */
        @NameInMap("HourSlaDetail")
        public String hourSlaDetail;

        /**
         * <p>Indicates whether the baseline is a default baseline of the workspace. Valid values: true and false.</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the baseline. Valid values: 1, 3, 5, 7, and 8.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the workspace to which the baseline belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The hour in the committed time of the day-level baseline. Valid values: 0 to 47.</p>
         */
        @NameInMap("SlaHour")
        public Integer slaHour;

        /**
         * <p>The minute in the alert time of the day-level baseline. Valid values: 0 to 59.</p>
         */
        @NameInMap("SlaMinu")
        public Integer slaMinu;

        /**
         * <p>Indicates whether the baseline is enabled. Valid values: true and false.</p>
         */
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
        /**
         * <p>The list of baselines.</p>
         */
        @NameInMap("Baselines")
        public java.util.List<ListBaselineConfigsResponseBodyDataBaselines> baselines;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of baselines returned.</p>
         */
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
