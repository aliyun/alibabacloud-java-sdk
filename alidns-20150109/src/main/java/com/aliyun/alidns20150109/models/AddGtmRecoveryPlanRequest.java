// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmRecoveryPlanRequest extends TeaModel {
    /**
     * <p>The list of IDs of faulty address pools.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FaultAddrPool")
    public String faultAddrPool;

    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the disaster recovery plan that you want to create.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The remarks on the disaster recovery plan.</p>
     */
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
