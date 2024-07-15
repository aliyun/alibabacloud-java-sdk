// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceAttributeShrinkRequest extends TeaModel {
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
    public String licenseDataShrink;

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

    public static UpdateServiceInstanceAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceAttributeShrinkRequest self = new UpdateServiceInstanceAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceAttributeShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateServiceInstanceAttributeShrinkRequest setLicenseDataShrink(String licenseDataShrink) {
        this.licenseDataShrink = licenseDataShrink;
        return this;
    }
    public String getLicenseDataShrink() {
        return this.licenseDataShrink;
    }

    public UpdateServiceInstanceAttributeShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceInstanceAttributeShrinkRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
