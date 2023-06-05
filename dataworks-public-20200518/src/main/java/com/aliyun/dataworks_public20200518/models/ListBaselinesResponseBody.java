// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselinesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListBaselinesResponseBodyData data;

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

    public static ListBaselinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaselinesResponseBody self = new ListBaselinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaselinesResponseBody setData(ListBaselinesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBaselinesResponseBodyData getData() {
        return this.data;
    }

    public ListBaselinesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListBaselinesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListBaselinesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaselinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaselinesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaselinesResponseBodyDataBaselinesOverTimeSettings extends TeaModel {
        @NameInMap("Cycle")
        public Integer cycle;

        @NameInMap("Time")
        public String time;

        public static ListBaselinesResponseBodyDataBaselinesOverTimeSettings build(java.util.Map<String, ?> map) throws Exception {
            ListBaselinesResponseBodyDataBaselinesOverTimeSettings self = new ListBaselinesResponseBodyDataBaselinesOverTimeSettings();
            return TeaModel.build(map, self);
        }

        public ListBaselinesResponseBodyDataBaselinesOverTimeSettings setCycle(Integer cycle) {
            this.cycle = cycle;
            return this;
        }
        public Integer getCycle() {
            return this.cycle;
        }

        public ListBaselinesResponseBodyDataBaselinesOverTimeSettings setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class ListBaselinesResponseBodyDataBaselines extends TeaModel {
        @NameInMap("AlertEnabled")
        public Boolean alertEnabled;

        @NameInMap("AlertMarginThreshold")
        public Integer alertMarginThreshold;

        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("BaselineType")
        public String baselineType;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("OverTimeSettings")
        public java.util.List<ListBaselinesResponseBodyDataBaselinesOverTimeSettings> overTimeSettings;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        public static ListBaselinesResponseBodyDataBaselines build(java.util.Map<String, ?> map) throws Exception {
            ListBaselinesResponseBodyDataBaselines self = new ListBaselinesResponseBodyDataBaselines();
            return TeaModel.build(map, self);
        }

        public ListBaselinesResponseBodyDataBaselines setAlertEnabled(Boolean alertEnabled) {
            this.alertEnabled = alertEnabled;
            return this;
        }
        public Boolean getAlertEnabled() {
            return this.alertEnabled;
        }

        public ListBaselinesResponseBodyDataBaselines setAlertMarginThreshold(Integer alertMarginThreshold) {
            this.alertMarginThreshold = alertMarginThreshold;
            return this;
        }
        public Integer getAlertMarginThreshold() {
            return this.alertMarginThreshold;
        }

        public ListBaselinesResponseBodyDataBaselines setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListBaselinesResponseBodyDataBaselines setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public ListBaselinesResponseBodyDataBaselines setBaselineType(String baselineType) {
            this.baselineType = baselineType;
            return this;
        }
        public String getBaselineType() {
            return this.baselineType;
        }

        public ListBaselinesResponseBodyDataBaselines setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListBaselinesResponseBodyDataBaselines setOverTimeSettings(java.util.List<ListBaselinesResponseBodyDataBaselinesOverTimeSettings> overTimeSettings) {
            this.overTimeSettings = overTimeSettings;
            return this;
        }
        public java.util.List<ListBaselinesResponseBodyDataBaselinesOverTimeSettings> getOverTimeSettings() {
            return this.overTimeSettings;
        }

        public ListBaselinesResponseBodyDataBaselines setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBaselinesResponseBodyDataBaselines setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListBaselinesResponseBodyDataBaselines setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListBaselinesResponseBodyData extends TeaModel {
        @NameInMap("Baselines")
        public java.util.List<ListBaselinesResponseBodyDataBaselines> baselines;

        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalCount")
        public String totalCount;

        public static ListBaselinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaselinesResponseBodyData self = new ListBaselinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaselinesResponseBodyData setBaselines(java.util.List<ListBaselinesResponseBodyDataBaselines> baselines) {
            this.baselines = baselines;
            return this;
        }
        public java.util.List<ListBaselinesResponseBodyDataBaselines> getBaselines() {
            return this.baselines;
        }

        public ListBaselinesResponseBodyData setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListBaselinesResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListBaselinesResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
