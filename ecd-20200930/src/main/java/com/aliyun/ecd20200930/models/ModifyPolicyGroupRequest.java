// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Clipboard")
    public String clipboard;

    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("UsbRedirect")
    public String usbRedirect;

    @NameInMap("Watermark")
    public String watermark;

    @NameInMap("WatermarkType")
    public String watermarkType;

    @NameInMap("WatermarkCustomText")
    public String watermarkCustomText;

    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    public static ModifyPolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupRequest self = new ModifyPolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPolicyGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyPolicyGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPolicyGroupRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public ModifyPolicyGroupRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public ModifyPolicyGroupRequest setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public ModifyPolicyGroupRequest setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public ModifyPolicyGroupRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public ModifyPolicyGroupRequest setWatermarkCustomText(String watermarkCustomText) {
        this.watermarkCustomText = watermarkCustomText;
        return this;
    }
    public String getWatermarkCustomText() {
        return this.watermarkCustomText;
    }

    public ModifyPolicyGroupRequest setWatermarkTransparency(String watermarkTransparency) {
        this.watermarkTransparency = watermarkTransparency;
        return this;
    }
    public String getWatermarkTransparency() {
        return this.watermarkTransparency;
    }

}
