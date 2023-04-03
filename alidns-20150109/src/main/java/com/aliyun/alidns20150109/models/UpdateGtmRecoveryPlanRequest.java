// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmRecoveryPlanRequest extends TeaModel {
    /**
     * <p>The list of faulty address pools.</p>
     */
    @NameInMap("FaultAddrPool")
    public String faultAddrPool;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the disaster recovery plan.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the disaster recovery plan.</p>
     */
    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    /**
     * <p>The remarks about the disaster recovery plan.</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static UpdateGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmRecoveryPlanRequest self = new UpdateGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmRecoveryPlanRequest setFaultAddrPool(String faultAddrPool) {
        this.faultAddrPool = faultAddrPool;
        return this;
    }
    public String getFaultAddrPool() {
        return this.faultAddrPool;
    }

    public UpdateGtmRecoveryPlanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmRecoveryPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGtmRecoveryPlanRequest setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public UpdateGtmRecoveryPlanRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
