// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResetAndroidInstancesInGroupRequest extends TeaModel {
    /**
     * <p>The list of instance IDs.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>Specifies whether to enable automatic payment. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("IgnoreParamValidation")
    public Boolean ignoreParamValidation;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p><strong>[Deprecated]</strong> The sales mode. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;Specifies whether to retain attribute settings during the reset. If this parameter is not specified, attribute configurations are not retained by default. This parameter takes effect only for cloud phone matrix instances. Run the wya dump config command to view the details of retained attributes.
     * &lt;props=&quot;intl&quot;&gt;This parameter is not supported on the international site.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SettingResetType")
    public Integer settingResetType;

    /**
     * <p>Specify this parameter when you need to reduce storage while resetting instances in a cloud phone matrix. This feature is currently available through a whitelist. This parameter applies only to instances in a cloud phone matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TargetDataDiskSize")
    public Integer targetDataDiskSize;

    public static ResetAndroidInstancesInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAndroidInstancesInGroupRequest self = new ResetAndroidInstancesInGroupRequest();
        return TeaModel.build(map, self);
    }

    public ResetAndroidInstancesInGroupRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public ResetAndroidInstancesInGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ResetAndroidInstancesInGroupRequest setIgnoreParamValidation(Boolean ignoreParamValidation) {
        this.ignoreParamValidation = ignoreParamValidation;
        return this;
    }
    public Boolean getIgnoreParamValidation() {
        return this.ignoreParamValidation;
    }

    public ResetAndroidInstancesInGroupRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public ResetAndroidInstancesInGroupRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

    public ResetAndroidInstancesInGroupRequest setSettingResetType(Integer settingResetType) {
        this.settingResetType = settingResetType;
        return this;
    }
    public Integer getSettingResetType() {
        return this.settingResetType;
    }

    public ResetAndroidInstancesInGroupRequest setTargetDataDiskSize(Integer targetDataDiskSize) {
        this.targetDataDiskSize = targetDataDiskSize;
        return this;
    }
    public Integer getTargetDataDiskSize() {
        return this.targetDataDiskSize;
    }

}
