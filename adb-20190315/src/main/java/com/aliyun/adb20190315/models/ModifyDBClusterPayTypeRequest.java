// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterPayTypeRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go.</p>
     * <p>*   **Prepaid**: subscription.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type of the subscription cluster. Valid values:</p>
     * <br>
     * <p>*   **Year**: subscription on a yearly basis.</p>
     * <p>*   **Month**: subscription on a monthly basis.</p>
     * <br>
     * <p>> This parameter must be specified when PayType is set to Prepaid.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The subscription duration of the subscription cluster.</p>
     * <br>
     * <p>*   Valid values when Period is set to Year: 1, 2, 3, and 5 (integer).</p>
     * <p>*   Valid values when Period is set to Month: 1 to 11 (integer).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when PayType is set to Prepaid.</p>
     * <br>
     * <p>*   Longer subscription durations offer more savings. Purchasing a cluster for one year is more cost-effective than purchasing the cluster for 10 or 11 months.</p>
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

    public ModifyDBClusterPayTypeRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

}
