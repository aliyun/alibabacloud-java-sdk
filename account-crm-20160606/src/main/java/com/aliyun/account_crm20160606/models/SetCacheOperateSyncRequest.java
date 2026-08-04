// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class SetCacheOperateSyncRequest extends TeaModel {
    @NameInMap("ExceptVersion")
    public Integer exceptVersion;

    @NameInMap("ExpireSeconds")
    public Integer expireSeconds;

    @NameInMap("Key")
    public String key;

    @NameInMap("SetType")
    public String setType;

    @NameInMap("ValueClazz")
    public String valueClazz;

    @NameInMap("ValueString")
    public String valueString;

    public static SetCacheOperateSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCacheOperateSyncRequest self = new SetCacheOperateSyncRequest();
        return TeaModel.build(map, self);
    }

    public SetCacheOperateSyncRequest setExceptVersion(Integer exceptVersion) {
        this.exceptVersion = exceptVersion;
        return this;
    }
    public Integer getExceptVersion() {
        return this.exceptVersion;
    }

    public SetCacheOperateSyncRequest setExpireSeconds(Integer expireSeconds) {
        this.expireSeconds = expireSeconds;
        return this;
    }
    public Integer getExpireSeconds() {
        return this.expireSeconds;
    }

    public SetCacheOperateSyncRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SetCacheOperateSyncRequest setSetType(String setType) {
        this.setType = setType;
        return this;
    }
    public String getSetType() {
        return this.setType;
    }

    public SetCacheOperateSyncRequest setValueClazz(String valueClazz) {
        this.valueClazz = valueClazz;
        return this;
    }
    public String getValueClazz() {
        return this.valueClazz;
    }

    public SetCacheOperateSyncRequest setValueString(String valueString) {
        this.valueString = valueString;
        return this;
    }
    public String getValueString() {
        return this.valueString;
    }

}
