// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeCnameAutoStatusRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Domain")
    public String domain;

    public static DescribeCnameAutoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCnameAutoStatusRequest self = new DescribeCnameAutoStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCnameAutoStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCnameAutoStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
