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

    }

}
