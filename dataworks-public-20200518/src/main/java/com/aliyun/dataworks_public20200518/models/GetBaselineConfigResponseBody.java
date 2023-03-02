// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineConfigResponseBody extends TeaModel {
    /**
     * <p>The details of the baseline.</p>
     */
    @NameInMap("Data")
    public GetBaselineConfigResponseBodyData data;

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
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBaselineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineConfigResponseBody self = new GetBaselineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBaselineConfigResponseBody setData(GetBaselineConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBaselineConfigResponseBodyData getData() {
        return this.data;
    }

    public GetBaselineConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBaselineConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBaselineConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBaselineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaselineConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBaselineConfigResponseBodyData extends TeaModel {
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
         * <p>The type of the baseline. Valid values: DAILY and HOURLY. The value DAILY indicates that the baseline is a day-level baseline. The value HOURLY indicates that the baseline is an hour-level baseline.</p>
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
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The hour in the committed time of the day-level baseline. Valid values: 0 to 47.</p>
         */
        @NameInMap("SlaHour")
        public Integer slaHour;

        /**
         * <p>The minute in the committed time of the day-level baseline. Valid values: 0 to 59.</p>
         */
        @NameInMap("SlaMinu")
        public Integer slaMinu;

        /**
         * <p>Indicates whether the baseline is enabled. Valid values: true and false.</p>
         */
        @NameInMap("UseFlag")
        public Boolean useFlag;

        public static GetBaselineConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineConfigResponseBodyData self = new GetBaselineConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBaselineConfigResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetBaselineConfigResponseBodyData setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetBaselineConfigResponseBodyData setBaselineType(String baselineType) {
            this.baselineType = baselineType;
            return this;
        }
        public String getBaselineType() {
            return this.baselineType;
        }

        public GetBaselineConfigResponseBodyData setExpHour(Integer expHour) {
            this.expHour = expHour;
            return this;
        }
        public Integer getExpHour() {
            return this.expHour;
        }

        public GetBaselineConfigResponseBodyData setExpMinu(Integer expMinu) {
            this.expMinu = expMinu;
            return this;
        }
        public Integer getExpMinu() {
            return this.expMinu;
        }

        public GetBaselineConfigResponseBodyData setHourExpDetail(String hourExpDetail) {
            this.hourExpDetail = hourExpDetail;
            return this;
        }
        public String getHourExpDetail() {
            return this.hourExpDetail;
        }

        public GetBaselineConfigResponseBodyData setHourSlaDetail(String hourSlaDetail) {
            this.hourSlaDetail = hourSlaDetail;
            return this;
        }
        public String getHourSlaDetail() {
            return this.hourSlaDetail;
        }

        public GetBaselineConfigResponseBodyData setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetBaselineConfigResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineConfigResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetBaselineConfigResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineConfigResponseBodyData setSlaHour(Integer slaHour) {
            this.slaHour = slaHour;
            return this;
        }
        public Integer getSlaHour() {
            return this.slaHour;
        }

        public GetBaselineConfigResponseBodyData setSlaMinu(Integer slaMinu) {
            this.slaMinu = slaMinu;
            return this;
        }
        public Integer getSlaMinu() {
            return this.slaMinu;
        }

        public GetBaselineConfigResponseBodyData setUseFlag(Boolean useFlag) {
            this.useFlag = useFlag;
            return this;
        }
        public Boolean getUseFlag() {
            return this.useFlag;
        }

    }

}
