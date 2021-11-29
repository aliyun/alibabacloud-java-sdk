// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListDomainsByLogConfigIdRequest extends TeaModel {
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static ListDomainsByLogConfigIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsByLogConfigIdRequest self = new ListDomainsByLogConfigIdRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainsByLogConfigIdRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ListDomainsByLogConfigIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
