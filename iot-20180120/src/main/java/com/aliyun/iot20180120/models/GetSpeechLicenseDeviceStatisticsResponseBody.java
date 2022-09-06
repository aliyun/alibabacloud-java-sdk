// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechLicenseDeviceStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSpeechLicenseDeviceStatisticsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSpeechLicenseDeviceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechLicenseDeviceStatisticsResponseBody self = new GetSpeechLicenseDeviceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpeechLicenseDeviceStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSpeechLicenseDeviceStatisticsResponseBody setData(GetSpeechLicenseDeviceStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSpeechLicenseDeviceStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetSpeechLicenseDeviceStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSpeechLicenseDeviceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpeechLicenseDeviceStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSpeechLicenseDeviceStatisticsResponseBodyData extends TeaModel {
        @NameInMap("AvailableQuota")
        public Integer availableQuota;

        @NameInMap("ExpiredQuota")
        public Integer expiredQuota;

        @NameInMap("ExpiringQuota")
        public Integer expiringQuota;

        public static GetSpeechLicenseDeviceStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechLicenseDeviceStatisticsResponseBodyData self = new GetSpeechLicenseDeviceStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSpeechLicenseDeviceStatisticsResponseBodyData setAvailableQuota(Integer availableQuota) {
            this.availableQuota = availableQuota;
            return this;
        }
        public Integer getAvailableQuota() {
            return this.availableQuota;
        }

        public GetSpeechLicenseDeviceStatisticsResponseBodyData setExpiredQuota(Integer expiredQuota) {
            this.expiredQuota = expiredQuota;
            return this;
        }
        public Integer getExpiredQuota() {
            return this.expiredQuota;
        }

        public GetSpeechLicenseDeviceStatisticsResponseBodyData setExpiringQuota(Integer expiringQuota) {
            this.expiringQuota = expiringQuota;
            return this;
        }
        public Integer getExpiringQuota() {
            return this.expiringQuota;
        }

    }

}
