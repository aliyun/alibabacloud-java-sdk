// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ConvertInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp16o0pd52e3y****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>If PricingCycle is set to year, the value ranges from 1 to 3.</li>
     * <li>If PricingCycle is set to month, the value ranges from 1 to 9.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <ul>
     * <li>year: year.</li>
     * <li>month: month.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static ConvertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceRequest self = new ConvertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ConvertInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ConvertInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ConvertInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
