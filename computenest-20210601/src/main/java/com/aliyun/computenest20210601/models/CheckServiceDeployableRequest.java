// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CheckServiceDeployableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1.29</p>
     */
    @NameInMap("PostPaidAmount")
    public String postPaidAmount;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("PrePaidAmount")
    public String prePaidAmount;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a544xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <strong>example:</strong>
     * <p>NotTrial</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    public static CheckServiceDeployableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceDeployableRequest self = new CheckServiceDeployableRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceDeployableRequest setPostPaidAmount(String postPaidAmount) {
        this.postPaidAmount = postPaidAmount;
        return this;
    }
    public String getPostPaidAmount() {
        return this.postPaidAmount;
    }

    public CheckServiceDeployableRequest setPrePaidAmount(String prePaidAmount) {
        this.prePaidAmount = prePaidAmount;
        return this;
    }
    public String getPrePaidAmount() {
        return this.prePaidAmount;
    }

    public CheckServiceDeployableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckServiceDeployableRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CheckServiceDeployableRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public CheckServiceDeployableRequest setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

}
