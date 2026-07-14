// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSaasServiceRequest extends TeaModel {
    /**
     * <p>The compute resources of the SaaS service.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cu")
    public Integer cu;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you leave this parameter empty, a Free type is created by default.</li>
     * <li>The subscription billing method offers discounts for purchases of one year or longer. Select a billing method as needed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the duration for which you want to purchase the resource. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: month.</li>
     * <li><strong>Year</strong>: year.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a subscription instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>Deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>deprecated</p>
     */
    @NameInMap("Plan")
    public String plan;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><strong>memroy</strong></li>
     * <li><strong>drama</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drama</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The duration for which you want to purchase the resource. Valid values:</p>
     * <ul>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values are 1 to 11.</li>
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values are 1 to 3.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a subscription instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The workspace of the SaaS service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateSaasServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSaasServiceRequest self = new CreateSaasServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSaasServiceRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public CreateSaasServiceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateSaasServiceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateSaasServiceRequest setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
    }

    public CreateSaasServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSaasServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateSaasServiceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateSaasServiceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
