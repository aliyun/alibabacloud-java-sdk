// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class QuotasValue extends TeaModel {
    @NameInMap("quota")
    public String quota;

    @NameInMap("operation_code")
    public String operationCode;

    @NameInMap("adjustable")
    public Boolean adjustable;

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
