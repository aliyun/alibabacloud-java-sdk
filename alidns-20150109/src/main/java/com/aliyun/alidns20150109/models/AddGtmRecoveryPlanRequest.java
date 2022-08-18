// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmRecoveryPlanRequest extends TeaModel {
    @NameInMap("FaultAddrPool")
    public String faultAddrPool;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    public static AddGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmRecoveryPlanRequest self = new AddGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public AddGtmRecoveryPlanRequest setFaultAddrPool(String faultAddrPool) {
        this.faultAddrPool = faultAddrPool;
        return this;
    }
    public String getFaultAddrPool() {
        return this.faultAddrPool;
    }

    public AddGtmRecoveryPlanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddGtmRecoveryPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGtmRecoveryPlanRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
