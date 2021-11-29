// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetIgnoreQueryStringConfigRequest extends TeaModel {
    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Enable")
    public String enable;

    @NameInMap("HashKeyArgs")
    public String hashKeyArgs;

    @NameInMap("KeepOssArgs")
    public String keepOssArgs;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetIgnoreQueryStringConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIgnoreQueryStringConfigRequest self = new SetIgnoreQueryStringConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetIgnoreQueryStringConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetIgnoreQueryStringConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetIgnoreQueryStringConfigRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public SetIgnoreQueryStringConfigRequest setHashKeyArgs(String hashKeyArgs) {
        this.hashKeyArgs = hashKeyArgs;
        return this;
    }
    public String getHashKeyArgs() {
        return this.hashKeyArgs;
    }

    public SetIgnoreQueryStringConfigRequest setKeepOssArgs(String keepOssArgs) {
        this.keepOssArgs = keepOssArgs;
        return this;
    }
    public String getKeepOssArgs() {
        return this.keepOssArgs;
    }

    public SetIgnoreQueryStringConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
