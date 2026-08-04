// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class IncrByCacheOperateSyncRequest extends TeaModel {
    @NameInMap("DefaultValue")
    public Integer defaultValue;

    @NameInMap("ExpireSeconds")
    public Integer expireSeconds;

    @NameInMap("Key")
    public String key;

    @NameInMap("Step")
    public Integer step;

    public static IncrByCacheOperateSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        IncrByCacheOperateSyncRequest self = new IncrByCacheOperateSyncRequest();
        return TeaModel.build(map, self);
    }

    public IncrByCacheOperateSyncRequest setDefaultValue(Integer defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public Integer getDefaultValue() {
        return this.defaultValue;
    }

    public IncrByCacheOperateSyncRequest setExpireSeconds(Integer expireSeconds) {
        this.expireSeconds = expireSeconds;
        return this;
    }
    public Integer getExpireSeconds() {
        return this.expireSeconds;
    }

    public IncrByCacheOperateSyncRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public IncrByCacheOperateSyncRequest setStep(Integer step) {
        this.step = step;
        return this;
    }
    public Integer getStep() {
        return this.step;
    }

}
