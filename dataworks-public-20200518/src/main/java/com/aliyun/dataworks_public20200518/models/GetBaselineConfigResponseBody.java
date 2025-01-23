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
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1031203110005</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>401</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecb967ec-c137-48a5-860****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>Baseline name</p>
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
         * <p>The hour in the alerting time of the day-level baseline. Valid values: [0, 47].</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ExpHour")
        public Integer expHour;

        /**
         * <p>The minute in the alerting time of the day-level baseline. Valid values: [0, 59].</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ExpMinu")
        public Integer expMinu;

        /**
         * <p>The alerting time of the hour-level baseline. This parameter is presented as key-value pairs in the JSON format. The key indicates the ID of the cycle, and the value is presented in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;1&quot;:&quot;03:28&quot;,&quot;2&quot;:&quot;04:28&quot;,&quot;3&quot;:&quot;05:28&quot;,&quot;4&quot;:&quot;06:28&quot;,&quot;5&quot;:&quot;07:28&quot;,&quot;6&quot;:&quot;08:28&quot;,&quot;7&quot;:&quot;09:28&quot;,&quot;8&quot;:&quot;10:28&quot;,&quot;9&quot;:&quot;11:28&quot;,&quot;10&quot;:&quot;12:28&quot;,&quot;11&quot;:&quot;13:28&quot;,&quot;12&quot;:&quot;14:28&quot;,&quot;13&quot;:&quot;15:28&quot;,&quot;14&quot;:&quot;16:28&quot;,&quot;15&quot;:&quot;17:28&quot;,&quot;16&quot;:&quot;18:28&quot;,&quot;17&quot;:&quot;19:28&quot;,&quot;18&quot;:&quot;20:28&quot;,&quot;19&quot;:&quot;21:28&quot;,&quot;20&quot;:&quot;22:28&quot;,&quot;21&quot;:&quot;23:28&quot;,&quot;22&quot;:&quot;24:28&quot;,&quot;23&quot;:&quot;25:28&quot;,&quot;24&quot;:&quot;26:28&quot;}</p>
         */
        @NameInMap("HourExpDetail")
        public String hourExpDetail;

        /**
         * <p>The committed completion time of the hour-level baseline. This parameter is presented as key-value pairs in the JSON format. The key indicates the ID of the cycle, and the value is presented in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;1&quot;:&quot;03:58&quot;,&quot;2&quot;:&quot;04:58&quot;,&quot;3&quot;:&quot;05:58&quot;,&quot;4&quot;:&quot;06:58&quot;,&quot;5&quot;:&quot;07:58&quot;,&quot;6&quot;:&quot;08:58&quot;,&quot;7&quot;:&quot;09:58&quot;,&quot;8&quot;:&quot;10:58&quot;,&quot;9&quot;:&quot;11:58&quot;,&quot;10&quot;:&quot;12:58&quot;,&quot;11&quot;:&quot;13:58&quot;,&quot;12&quot;:&quot;14:58&quot;,&quot;13&quot;:&quot;15:58&quot;,&quot;14&quot;:&quot;16:58&quot;,&quot;15&quot;:&quot;17:58&quot;,&quot;16&quot;:&quot;18:58&quot;,&quot;17&quot;:&quot;19:58&quot;,&quot;18&quot;:&quot;20:58&quot;,&quot;19&quot;:&quot;21:58&quot;,&quot;20&quot;:&quot;22:58&quot;,&quot;21&quot;:&quot;23:58&quot;,&quot;22&quot;:&quot;24:58&quot;,&quot;23&quot;:&quot;25:58&quot;,&quot;24&quot;:&quot;26:58&quot;}</p>
         */
        @NameInMap("HourSlaDetail")
        public String hourSlaDetail;

        /**
         * <p>Indicates whether the baseline is a default baseline of the workspace. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs can be specified. The IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>9527952****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the baseline. Valid values: {1,3,5,7,8}.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The hour in the committed completion time of the day-level baseline. Valid values: [0, 47].</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("SlaHour")
        public Integer slaHour;

        /**
         * <p>The minute in the committed completion time of the day-level baseline. Valid values: [0, 59].</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SlaMinu")
        public Integer slaMinu;

        /**
         * <p>Indicates whether the baseline is enabled. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
