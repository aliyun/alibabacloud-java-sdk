// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceFormShrinkRequest extends TeaModel {
    /**
     * <p>是否需要账号配置</p>
     */
    @NameInMap("AccountConfig")
    public Boolean accountConfig;

    /**
     * <p>设备形态属性列表</p>
     */
    @NameInMap("AttributeList")
    public String attributeListShrink;

    /**
     * <p>是否支持配置生成</p>
     */
    @NameInMap("ConfigCompare")
    public Boolean configCompare;

    @NameInMap("DetailDisplay")
    public Boolean detailDisplay;

    /**
     * <p>设备形态ID</p>
     */
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RelatedDeviceFormId")
    public String relatedDeviceFormId;

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
