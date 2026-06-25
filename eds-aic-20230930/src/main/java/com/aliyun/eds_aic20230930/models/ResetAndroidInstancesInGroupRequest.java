// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResetAndroidInstancesInGroupRequest extends TeaModel {
    /**
     * <p>A list of instance IDs.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    @NameInMap("IgnoreParamValidation")
    public Boolean ignoreParamValidation;

    /**
     * <p>The sale mode. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;Specifies whether to retain the property settings when you reset the instances. By default, the property settings are not retained. This parameter applies only to cloud phone matrix instances. Run the wya dump config command to view the details of the retained properties.&lt;props=&quot;intl&quot;&gt;This parameter is not supported on the international site (alibabacloud.com).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
