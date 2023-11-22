// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class WafQuotaInteger extends TeaModel {
    @NameInMap("Equal")
    public Integer equal;

    @NameInMap("GreaterThan")
    public Integer greaterThan;

    @NameInMap("GreaterThanOrEqual")
    public Integer greaterThanOrEqual;

    @NameInMap("LessThan")
    public Integer lessThan;

    @NameInMap("LessThanOrEqual")
    public Integer lessThanOrEqual;

    public static WafQuotaInteger build(java.util.Map<String, ?> map) throws Exception {
        WafQuotaInteger self = new WafQuotaInteger();
        return TeaModel.build(map, self);
    }

    public WafQuotaInteger setEqual(Integer equal) {
        this.equal = equal;
        return this;
    }
    public Integer getEqual() {
        return this.equal;
    }

    public WafQuotaInteger setGreaterThan(Integer greaterThan) {
        this.greaterThan = greaterThan;
        return this;
    }
    public Integer getGreaterThan() {
        return this.greaterThan;
    }

    public WafQuotaInteger setGreaterThanOrEqual(Integer greaterThanOrEqual) {
        this.greaterThanOrEqual = greaterThanOrEqual;
        return this;
    }
    public Integer getGreaterThanOrEqual() {
        return this.greaterThanOrEqual;
    }

    public WafQuotaInteger setLessThan(Integer lessThan) {
        this.lessThan = lessThan;
        return this;
    }
    public Integer getLessThan() {
        return this.lessThan;
    }

    public WafQuotaInteger setLessThanOrEqual(Integer lessThanOrEqual) {
        this.lessThanOrEqual = lessThanOrEqual;
        return this;
    }
    public Integer getLessThanOrEqual() {
        return this.lessThanOrEqual;
    }

}
