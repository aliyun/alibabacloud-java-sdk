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

    @NameInMap("LicenseData")
    public UpdateServiceInstanceAttributeRequestLicenseData licenseData;

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

    public static class UpdateServiceInstanceAttributeRequestLicenseData extends TeaModel {
        @NameInMap("CustomData")
        public String customData;

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

    }

}
