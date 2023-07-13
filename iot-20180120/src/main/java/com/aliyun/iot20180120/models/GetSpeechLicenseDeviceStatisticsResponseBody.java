// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechLicenseDeviceStatisticsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetSpeechLicenseDeviceStatisticsResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The number of available licenses.</p>
         */
        @NameInMap("AvailableQuota")
        public Integer availableQuota;

        /**
         * <p>The number of expired licenses.</p>
         */
        @NameInMap("ExpiredQuota")
        public Integer expiredQuota;

        /**
         * <p>The number of licenses that are about to expire.</p>
         */
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
