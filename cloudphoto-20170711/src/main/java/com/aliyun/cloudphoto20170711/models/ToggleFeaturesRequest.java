// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ToggleFeaturesRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("EnabledFeatures")
    public java.util.List<String> enabledFeatures;

    @NameInMap("DisabledFeatures")
    public java.util.List<String> disabledFeatures;

    public static ToggleFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ToggleFeaturesRequest self = new ToggleFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ToggleFeaturesRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public ToggleFeaturesRequest setEnabledFeatures(java.util.List<String> enabledFeatures) {
        this.enabledFeatures = enabledFeatures;
        return this;
    }
    public java.util.List<String> getEnabledFeatures() {
        return this.enabledFeatures;
    }

    public ToggleFeaturesRequest setDisabledFeatures(java.util.List<String> disabledFeatures) {
        this.disabledFeatures = disabledFeatures;
        return this;
    }
    public java.util.List<String> getDisabledFeatures() {
        return this.disabledFeatures;
    }

}
