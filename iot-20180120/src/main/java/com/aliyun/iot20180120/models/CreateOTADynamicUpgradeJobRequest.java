// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTADynamicUpgradeJobRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("FirmwareId")
    public String firmwareId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("SrcVersion")
    public java.util.List<String> srcVersion;

    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("RetryCount")
    public Integer retryCount;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    @NameInMap("MaximumPerMinute")
    public Integer maximumPerMinute;

    @NameInMap("OverwriteMode")
    public Integer overwriteMode;

    @NameInMap("DynamicMode")
    public Integer dynamicMode;

    @NameInMap("Tag")
    public java.util.List<CreateOTADynamicUpgradeJobRequestTag> tag;

    public static CreateOTADynamicUpgradeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTADynamicUpgradeJobRequest self = new CreateOTADynamicUpgradeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTADynamicUpgradeJobRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateOTADynamicUpgradeJobRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateOTADynamicUpgradeJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTADynamicUpgradeJobRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public CreateOTADynamicUpgradeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateOTADynamicUpgradeJobRequest setSrcVersion(java.util.List<String> srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public java.util.List<String> getSrcVersion() {
        return this.srcVersion;
    }

    public CreateOTADynamicUpgradeJobRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateOTADynamicUpgradeJobRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public CreateOTADynamicUpgradeJobRequest setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public CreateOTADynamicUpgradeJobRequest setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
        return this;
    }
    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    public CreateOTADynamicUpgradeJobRequest setOverwriteMode(Integer overwriteMode) {
        this.overwriteMode = overwriteMode;
        return this;
    }
    public Integer getOverwriteMode() {
        return this.overwriteMode;
    }

    public CreateOTADynamicUpgradeJobRequest setDynamicMode(Integer dynamicMode) {
        this.dynamicMode = dynamicMode;
        return this;
    }
    public Integer getDynamicMode() {
        return this.dynamicMode;
    }

    public CreateOTADynamicUpgradeJobRequest setTag(java.util.List<CreateOTADynamicUpgradeJobRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateOTADynamicUpgradeJobRequestTag> getTag() {
        return this.tag;
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
