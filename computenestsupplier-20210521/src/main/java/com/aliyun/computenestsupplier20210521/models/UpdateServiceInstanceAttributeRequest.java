// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The time when the service instance expires.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-25T02:28:40Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The License Data</p>
     */
    @NameInMap("LicenseData")
    public UpdateServiceInstanceAttributeRequestLicenseData licenseData;

    /**
     * <p>Application reason, currently used for trial application extension.</p>
     * 
     * <strong>example:</strong>
     * <p>\&quot;\&quot;</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-3df88e962cdexxxxxxxx</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static UpdateServiceInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceAttributeRequest self = new UpdateServiceInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceAttributeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateServiceInstanceAttributeRequest setLicenseData(UpdateServiceInstanceAttributeRequestLicenseData licenseData) {
        this.licenseData = licenseData;
        return this;
    }
    public UpdateServiceInstanceAttributeRequestLicenseData getLicenseData() {
        return this.licenseData;
    }

    public UpdateServiceInstanceAttributeRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public UpdateServiceInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceInstanceAttributeRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static class UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo extends TeaModel {
        /**
         * <p>Mock error code.</p>
         * 
         * <strong>example:</strong>
         * <p>EntityNotExist.Service</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Mock error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The provided parameter &quot;ServiceId&quot; is invalid.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>if you want mock response, please open this option.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UpdateResponse")
        public Boolean updateResponse;

        public static UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo self = new UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo();
            return TeaModel.build(map, self);
        }

        public UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo setUpdateResponse(Boolean updateResponse) {
            this.updateResponse = updateResponse;
            return this;
        }
        public Boolean getUpdateResponse() {
            return this.updateResponse;
        }

    }

    public static class UpdateServiceInstanceAttributeRequestLicenseData extends TeaModel {
        /**
         * <p>The Custom Data</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Test&quot;}</p>
         */
        @NameInMap("CustomData")
        public String customData;

        /**
         * <p>Mock response info.</p>
         */
        @NameInMap("ResponseInfo")
        public UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo responseInfo;

        public static UpdateServiceInstanceAttributeRequestLicenseData build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceInstanceAttributeRequestLicenseData self = new UpdateServiceInstanceAttributeRequestLicenseData();
            return TeaModel.build(map, self);
        }

        public UpdateServiceInstanceAttributeRequestLicenseData setCustomData(String customData) {
            this.customData = customData;
            return this;
        }
        public String getCustomData() {
            return this.customData;
        }

        public UpdateServiceInstanceAttributeRequestLicenseData setResponseInfo(UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo responseInfo) {
            this.responseInfo = responseInfo;
            return this;
        }
        public UpdateServiceInstanceAttributeRequestLicenseDataResponseInfo getResponseInfo() {
            return this.responseInfo;
        }

    }

}
