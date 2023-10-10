// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class QuotasValue extends TeaModel {
    /**
     * <p>The value of the quota. If the quota limit is reached, submit an application in the [Quota Center console](https://quotas.console.aliyun.com/products/csk/quotas) to increase the quota.</p>
     */
    @NameInMap("quota")
    public String quota;

    /**
     * <p>The quota code.</p>
     */
    @NameInMap("operation_code")
    public String operationCode;

    /**
     * <p>Indicates whether the quota is adjustable.</p>
     */
    @NameInMap("adjustable")
    public Boolean adjustable;

    /**
     * <p>The unit.</p>
     */
    @NameInMap("unit")
    public String unit;

    public static QuotasValue build(java.util.Map<String, ?> map) throws Exception {
        QuotasValue self = new QuotasValue();
        return TeaModel.build(map, self);
    }

    public QuotasValue setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public QuotasValue setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public QuotasValue setAdjustable(Boolean adjustable) {
        this.adjustable = adjustable;
        return this;
    }
    public Boolean getAdjustable() {
        return this.adjustable;
    }

    public QuotasValue setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
