// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResetAndroidInstancesInGroupRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud phone instances.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    @NameInMap("IgnoreParamValidation")
    public Boolean ignoreParamValidation;

    @NameInMap("SaleMode")
    public String saleMode;

    @NameInMap("SettingResetType")
    public Integer settingResetType;

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

    public ResetAndroidInstancesInGroupRequest setIgnoreParamValidation(Boolean ignoreParamValidation) {
        this.ignoreParamValidation = ignoreParamValidation;
        return this;
    }
    public Boolean getIgnoreParamValidation() {
        return this.ignoreParamValidation;
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

}
