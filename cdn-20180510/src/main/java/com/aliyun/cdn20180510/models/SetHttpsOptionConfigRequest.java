// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetHttpsOptionConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("Http2")
    public String http2;

    public static SetHttpsOptionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHttpsOptionConfigRequest self = new SetHttpsOptionConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetHttpsOptionConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetHttpsOptionConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetHttpsOptionConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetHttpsOptionConfigRequest setHttp2(String http2) {
        this.http2 = http2;
        return this;
    }
    public String getHttp2() {
        return this.http2;
    }

}
