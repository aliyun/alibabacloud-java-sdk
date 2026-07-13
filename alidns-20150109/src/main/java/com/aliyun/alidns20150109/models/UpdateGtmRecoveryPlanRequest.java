// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmRecoveryPlanRequest extends TeaModel {
    /**
     * <p>The list of IDs of the fault address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;hra0**&quot;]</p>
     */
    @NameInMap("FaultAddrPool")
    public String faultAddrPool;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>Default value: en</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the disaster recovery plan.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the disaster recovery plan.&lt;props=&quot;china&quot;&gt;You can call the <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describegtmrecoveryplans?spm=a2c4g.11186623.help-menu-29697.d_0_5_1_3_13_5.6dd83618vW4yD7">DescribeGtmRecoveryPlans</a> operation to obtain the ID.
     * &lt;props=&quot;intl&quot;&gt;You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describegtmrecoveryplans?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeGtmRecoveryPlans</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10*******</p>
     */
    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>remark</p>
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
