// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTADynamicUpgradeJobRequest extends TeaModel {
    @NameInMap("DownloadProtocol")
    public String downloadProtocol;

    @NameInMap("DynamicMode")
    public Integer dynamicMode;

    @NameInMap("FirmwareId")
    public String firmwareId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("MaximumPerMinute")
    public Integer maximumPerMinute;

    @NameInMap("MultiModuleMode")
    public Boolean multiModuleMode;

    @NameInMap("NeedConfirm")
    public Boolean needConfirm;

    @NameInMap("NeedPush")
    public Boolean needPush;

    @NameInMap("OverwriteMode")
    public Integer overwriteMode;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RetryCount")
    public Integer retryCount;

    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("SrcVersion")
    public java.util.List<String> srcVersion;

    @NameInMap("Tag")
    public java.util.List<CreateOTADynamicUpgradeJobRequestTag> tag;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    public static CreateOTADynamicUpgradeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTADynamicUpgradeJobRequest self = new CreateOTADynamicUpgradeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTADynamicUpgradeJobRequest setDownloadProtocol(String downloadProtocol) {
        this.downloadProtocol = downloadProtocol;
        return this;
    }
    public String getDownloadProtocol() {
        return this.downloadProtocol;
    }

    public CreateOTADynamicUpgradeJobRequest setDynamicMode(Integer dynamicMode) {
        this.dynamicMode = dynamicMode;
        return this;
    }
    public Integer getDynamicMode() {
        return this.dynamicMode;
    }

    public CreateOTADynamicUpgradeJobRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public CreateOTADynamicUpgradeJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateOTADynamicUpgradeJobRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateOTADynamicUpgradeJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTADynamicUpgradeJobRequest setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
        return this;
    }
    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    public CreateOTADynamicUpgradeJobRequest setMultiModuleMode(Boolean multiModuleMode) {
        this.multiModuleMode = multiModuleMode;
        return this;
    }
    public Boolean getMultiModuleMode() {
        return this.multiModuleMode;
    }

    public CreateOTADynamicUpgradeJobRequest setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public CreateOTADynamicUpgradeJobRequest setNeedPush(Boolean needPush) {
        this.needPush = needPush;
        return this;
    }
    public Boolean getNeedPush() {
        return this.needPush;
    }

    public CreateOTADynamicUpgradeJobRequest setOverwriteMode(Integer overwriteMode) {
        this.overwriteMode = overwriteMode;
        return this;
    }
    public Integer getOverwriteMode() {
        return this.overwriteMode;
    }

    public CreateOTADynamicUpgradeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateOTADynamicUpgradeJobRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public CreateOTADynamicUpgradeJobRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateOTADynamicUpgradeJobRequest setSrcVersion(java.util.List<String> srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public java.util.List<String> getSrcVersion() {
        return this.srcVersion;
    }

    public CreateOTADynamicUpgradeJobRequest setTag(java.util.List<CreateOTADynamicUpgradeJobRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateOTADynamicUpgradeJobRequestTag> getTag() {
        return this.tag;
    }

    public CreateOTADynamicUpgradeJobRequest setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class CreateOTADynamicUpgradeJobRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateOTADynamicUpgradeJobRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateOTADynamicUpgradeJobRequestTag self = new CreateOTADynamicUpgradeJobRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateOTADynamicUpgradeJobRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOTADynamicUpgradeJobRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
