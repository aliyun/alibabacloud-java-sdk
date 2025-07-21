// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpAutoRenewalRequest extends TeaModel {
    /**
     * <p>Whether to enable auto-renewal</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public String autoRenewal;

    /**
     * <p>Purchase instance ID, separated by English commas if multiple.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx,xxx</p>
     */
    @NameInMap("BuyResourceIds")
    public String buyResourceIds;

    public static DedicatedIpAutoRenewalRequest build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpAutoRenewalRequest self = new DedicatedIpAutoRenewalRequest();
        return TeaModel.build(map, self);
    }

    public DedicatedIpAutoRenewalRequest setAutoRenewal(String autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public String getAutoRenewal() {
        return this.autoRenewal;
    }

    public DedicatedIpAutoRenewalRequest setBuyResourceIds(String buyResourceIds) {
        this.buyResourceIds = buyResourceIds;
        return this;
    }
    public String getBuyResourceIds() {
        return this.buyResourceIds;
    }

}
