// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterPayTypeRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp11q28kvl688****</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type of the subscription cluster. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: subscription on a yearly basis.</li>
     * <li><strong>Month</strong>: subscription on a monthly basis.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be specified when PayType is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The subscription duration of the subscription cluster.</p>
     * <ul>
     * <li>Valid values when Period is set to Year: 1, 2, 3, and 5 (integer).</li>
     * <li>Valid values when Period is set to Month: 1 to 11 (integer).</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter must be specified when PayType is set to Prepaid.</p>
     * </li>
     * <li><p>Longer subscription durations offer more savings. Purchasing a cluster for one year is more cost-effective than purchasing the cluster for 10 or 11 months.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    public static ModifyDBClusterPayTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterPayTypeRequest self = new ModifyDBClusterPayTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterPayTypeRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public ModifyDBClusterPayTypeRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ModifyDBClusterPayTypeRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public ModifyDBClusterPayTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBClusterPayTypeRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

}
