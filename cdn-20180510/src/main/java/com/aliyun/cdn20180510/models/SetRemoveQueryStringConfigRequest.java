// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetRemoveQueryStringConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("AliRemoveArgs")
    public String aliRemoveArgs;

    @NameInMap("KeepOssArgs")
    public String keepOssArgs;

    public static SetRemoveQueryStringConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRemoveQueryStringConfigRequest self = new SetRemoveQueryStringConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetRemoveQueryStringConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetRemoveQueryStringConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetRemoveQueryStringConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetRemoveQueryStringConfigRequest setAliRemoveArgs(String aliRemoveArgs) {
        this.aliRemoveArgs = aliRemoveArgs;
        return this;
    }
    public String getAliRemoveArgs() {
        return this.aliRemoveArgs;
    }

    public SetRemoveQueryStringConfigRequest setKeepOssArgs(String keepOssArgs) {
        this.keepOssArgs = keepOssArgs;
        return this;
    }
    public String getKeepOssArgs() {
        return this.keepOssArgs;
    }

}
