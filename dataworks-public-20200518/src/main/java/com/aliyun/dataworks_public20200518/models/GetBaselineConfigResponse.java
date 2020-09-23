// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineConfigResponse extends TeaModel {
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
    public GetBaselineConfigResponseData data;

    public static GetBaselineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineConfigResponse self = new GetBaselineConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetBaselineConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBaselineConfigResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBaselineConfigResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBaselineConfigResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBaselineConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaselineConfigResponse setData(GetBaselineConfigResponseData data) {
        this.data = data;
        return this;
    }
    public GetBaselineConfigResponseData getData() {
        return this.data;
    }

    public static class GetBaselineConfigResponseData extends TeaModel {
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

        public static GetBaselineConfigResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineConfigResponseData self = new GetBaselineConfigResponseData();
            return TeaModel.build(map, self);
        }

        public GetBaselineConfigResponseData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetBaselineConfigResponseData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetBaselineConfigResponseData setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetBaselineConfigResponseData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineConfigResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineConfigResponseData setUseFlag(Boolean useFlag) {
            this.useFlag = useFlag;
            return this;
        }
        public Boolean getUseFlag() {
            return this.useFlag;
        }

        public GetBaselineConfigResponseData setBaselineType(String baselineType) {
            this.baselineType = baselineType;
            return this;
        }
        public String getBaselineType() {
            return this.baselineType;
        }

        public GetBaselineConfigResponseData setExpHour(Integer expHour) {
            this.expHour = expHour;
            return this;
        }
        public Integer getExpHour() {
            return this.expHour;
        }

        public GetBaselineConfigResponseData setExpMinu(Integer expMinu) {
            this.expMinu = expMinu;
            return this;
        }
        public Integer getExpMinu() {
            return this.expMinu;
        }

        public GetBaselineConfigResponseData setSlaHour(Integer slaHour) {
            this.slaHour = slaHour;
            return this;
        }
        public Integer getSlaHour() {
            return this.slaHour;
        }

        public GetBaselineConfigResponseData setSlaMinu(Integer slaMinu) {
            this.slaMinu = slaMinu;
            return this;
        }
        public Integer getSlaMinu() {
            return this.slaMinu;
        }

        public GetBaselineConfigResponseData setHourExpDetail(String hourExpDetail) {
            this.hourExpDetail = hourExpDetail;
            return this;
        }
        public String getHourExpDetail() {
            return this.hourExpDetail;
        }

        public GetBaselineConfigResponseData setHourSlaDetail(String hourSlaDetail) {
            this.hourSlaDetail = hourSlaDetail;
            return this;
        }
        public String getHourSlaDetail() {
            return this.hourSlaDetail;
        }

        public GetBaselineConfigResponseData setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

}
