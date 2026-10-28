// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditZeroCreditShutdownRequest extends TeaModel {
    /**
     * <h3><strong>Shutdown policy</strong></h3>
     * <p>For more information, refer to the official documentation: <a href="https://www.alibabacloud.com/help/zh/channel-platform/latest/shutdowndelayprivilege">https://www.alibabacloud.com/help/zh/channel-platform/latest/shutdowndelayprivilege</a></p>
     * <ul>
     * <li><strong>immediatelyStop</strong>——When the active credit of the distributor customer account is less than 0, the account enters the overdue payment state. New resources cannot be purchased. Pay-as-you-go instances are stopped and no longer incur charges. Upfront instances can be used until they expire. After the instances remain stopped for 15 days, pay-as-you-go instances are released. Because of billing delays, credits may continue to be deducted even after instances are successfully stopped.</li>
     * <li><strong>delayStop</strong>——The overdraft quota in the delayed shutdown policy is calculated by Alibaba Cloud based on the historical consumption of the account. The minimum overdraft quota is 600 USD, and instances can continue to run for approximately 15 days after the overdue payment occurs. The overdraft quota applies to pay-as-you-go products. After this policy is enabled, when the customer has an overdue payment (active credit &lt; 0) and the overdue amount is within the overdraft quota, instance shutdown is not triggered. The overdraft quota is not the upper limit of the overdue amount. Because of billing delays, credits may continue to be deducted even after instances are successfully stopped. After the instances remain stopped for 15 days, pay-as-you-go instances are released. When the delayed shutdown quota &lt;= remaining credit &lt; 0, you can manually trigger an immediate shutdown.</li>
     * <li><strong>noStop</strong>——If you select this option, instances are not stopped when the customer has an overdue payment. When the customer has an overdue payment (remaining credit &lt; 0), instance shutdown is not triggered. There is no upper limit on the overdue amount. You must perform a manual operation of &quot;Immediate Shutdown&quot; in ACPN to change the instance status. Use this option with caution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>noStop</p>
     */
    @NameInMap("ShutdownPolicy")
    public String shutdownPolicy;

    /**
     * <p>The UID of the distributor customer whose shutdown policy you want to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>1263644979775567</p>
     */
    @NameInMap("Uid")
    public Long uid;

    public static EditZeroCreditShutdownRequest build(java.util.Map<String, ?> map) throws Exception {
        EditZeroCreditShutdownRequest self = new EditZeroCreditShutdownRequest();
        return TeaModel.build(map, self);
    }

    public EditZeroCreditShutdownRequest setShutdownPolicy(String shutdownPolicy) {
        this.shutdownPolicy = shutdownPolicy;
        return this;
    }
    public String getShutdownPolicy() {
        return this.shutdownPolicy;
    }

    public EditZeroCreditShutdownRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
