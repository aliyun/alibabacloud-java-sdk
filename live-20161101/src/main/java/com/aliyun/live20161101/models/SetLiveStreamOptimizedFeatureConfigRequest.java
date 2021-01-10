// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamOptimizedFeatureConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("ConfigStatus")
    public String configStatus;

    @NameInMap("ConfigValue")
    public String configValue;

    public static SetLiveStreamOptimizedFeatureConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamOptimizedFeatureConfigRequest self = new SetLiveStreamOptimizedFeatureConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamOptimizedFeatureConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveStreamOptimizedFeatureConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveStreamOptimizedFeatureConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public SetLiveStreamOptimizedFeatureConfigRequest setConfigStatus(String configStatus) {
        this.configStatus = configStatus;
        return this;
    }
    public String getConfigStatus() {
        return this.configStatus;
    }

    public SetLiveStreamOptimizedFeatureConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

}
