// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceFormShrinkRequest extends TeaModel {
    // 是否需要账号配置
    @NameInMap("AccountConfig")
    public Boolean accountConfig;

    // 设备形态属性列表
    @NameInMap("AttributeList")
    public String attributeListShrink;

    // 是否支持配置生成
    @NameInMap("ConfigCompare")
    public Boolean configCompare;

    // 是否展示设备详情
    @NameInMap("DetailDisplay")
    public Boolean detailDisplay;

    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 关联设备形态ID
    @NameInMap("RelatedDeviceFormId")
    public String relatedDeviceFormId;

    // 设备代码
    @NameInMap("Script")
    public String script;

    public static UpdateDeviceFormShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceFormShrinkRequest self = new UpdateDeviceFormShrinkRequest();
        return TeaModel.build(map, self);
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

    public UpdateDeviceFormShrinkRequest setConfigCompare(Boolean configCompare) {
        this.configCompare = configCompare;
        return this;
    }
    public Boolean getConfigCompare() {
        return this.configCompare;
    }

    public UpdateDeviceFormShrinkRequest setDetailDisplay(Boolean detailDisplay) {
        this.detailDisplay = detailDisplay;
        return this;
    }
    public Boolean getDetailDisplay() {
        return this.detailDisplay;
    }

    public UpdateDeviceFormShrinkRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public UpdateDeviceFormShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDeviceFormShrinkRequest setRelatedDeviceFormId(String relatedDeviceFormId) {
        this.relatedDeviceFormId = relatedDeviceFormId;
        return this;
    }
    public String getRelatedDeviceFormId() {
        return this.relatedDeviceFormId;
    }

    public UpdateDeviceFormShrinkRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

}
