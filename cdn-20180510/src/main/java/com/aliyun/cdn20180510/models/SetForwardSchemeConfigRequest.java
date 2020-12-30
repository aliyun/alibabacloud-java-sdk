// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetForwardSchemeConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("Enable")
    public String enable;

    @NameInMap("SchemeOrigin")
    public String schemeOrigin;

    @NameInMap("SchemeOriginPort")
    public String schemeOriginPort;

    public static SetForwardSchemeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetForwardSchemeConfigRequest self = new SetForwardSchemeConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetForwardSchemeConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetForwardSchemeConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetForwardSchemeConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetForwardSchemeConfigRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public SetForwardSchemeConfigRequest setSchemeOrigin(String schemeOrigin) {
        this.schemeOrigin = schemeOrigin;
        return this;
    }
    public String getSchemeOrigin() {
        return this.schemeOrigin;
    }

    public SetForwardSchemeConfigRequest setSchemeOriginPort(String schemeOriginPort) {
        this.schemeOriginPort = schemeOriginPort;
        return this;
    }
    public String getSchemeOriginPort() {
        return this.schemeOriginPort;
    }

}
