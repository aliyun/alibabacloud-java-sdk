// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceFormShrinkRequest extends TeaModel {
    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 是否支持配置生成
    @NameInMap("ConfigCompare")
    public Boolean configCompare;

    // 是否需要账号配置
    @NameInMap("AccountConfig")
    public Boolean accountConfig;

    // 设备形态属性列表
    @NameInMap("AttributeList")
    public String attributeListShrink;

    // 是否展示设备详情
    @NameInMap("DetailDisplay")
    public Boolean detailDisplay;

    public static UpdateDeviceFormShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceFormShrinkRequest self = new UpdateDeviceFormShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceFormShrinkRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public UpdateDeviceFormShrinkRequest setConfigCompare(Boolean configCompare) {
        this.configCompare = configCompare;
        return this;
    }
    public Boolean getConfigCompare() {
        return this.configCompare;
    }

    public UpdateDeviceFormShrinkRequest setAccountConfig(Boolean accountConfig) {
        this.accountConfig = accountConfig;
        return this;
    }
    public Boolean getAccountConfig() {
        return this.accountConfig;
    }

    public UpdateDeviceFormShrinkRequest setAttributeListShrink(String attributeListShrink) {
        this.attributeListShrink = attributeListShrink;
        return this;
    }
    public String getAttributeListShrink() {
        return this.attributeListShrink;
    }

    public UpdateDeviceFormShrinkRequest setDetailDisplay(Boolean detailDisplay) {
        this.detailDisplay = detailDisplay;
        return this;
    }
    public Boolean getDetailDisplay() {
        return this.detailDisplay;
    }

}
