// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CheckServiceDeployableRequest extends TeaModel {
    /**
     * <p>The total pay-as-you-go amount.</p>
     * 
     * <strong>example:</strong>
     * <p>1.29</p>
     */
    @NameInMap("PostPaidAmount")
    public String postPaidAmount;

    /**
     * <p>The total upfront payment amount.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("PrePaidAmount")
    public String prePaidAmount;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a544xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Template 1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The trial type. Valid values:</p>
     * <ul>
     * <li><p>Trial: The service supports trial use.</p>
     * </li>
     * <li><p>NotTrial: The service does not support trial use.</p>
     * </li>
     * </ul>
     * 
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

    public CheckServiceDeployableRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CheckServiceDeployableRequest setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

}
