// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselinesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListBaselinesResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>103630001</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The user does not exist. 276571706358178756</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>952795279527ab****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The cycle that corresponds to the committed completion time. For a day-level baseline, the value of this parameter is 1. For an hour-level baseline, the value of this parameter cannot exceed 24.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cycle")
        public Integer cycle;

        /**
         * <p>The committed completion time in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
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
        /**
         * <p>Indicates whether the alerting feature is enabled. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AlertEnabled")
        public Boolean alertEnabled;

        /**
         * <p>The alert margin threshold for the baseline instance. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AlertMarginThreshold")
        public Integer alertMarginThreshold;

        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>BaselineName</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The type of the baseline. Valid values: DAILY and HOURLY.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("BaselineType")
        public String baselineType;

        /**
         * <p>Indicates whether the baseline is enabled. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The settings of the committed completion time of the baseline.</p>
         */
        @NameInMap("OverTimeSettings")
        public java.util.List<ListBaselinesResponseBodyDataBaselinesOverTimeSettings> overTimeSettings;

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs can be specified. The IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>952795****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the baseline. Valid values: {1,2,5,7,8}.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the workspace to which the baseline belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>9527</p>
         */
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
        /**
         * <p>The baselines.</p>
         */
        @NameInMap("Baselines")
        public java.util.List<ListBaselinesResponseBodyDataBaselines> baselines;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of baselines returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
