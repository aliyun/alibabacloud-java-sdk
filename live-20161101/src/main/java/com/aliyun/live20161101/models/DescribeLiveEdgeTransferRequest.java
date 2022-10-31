// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveEdgeTransferRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeLiveEdgeTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveEdgeTransferRequest self = new DescribeLiveEdgeTransferRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveEdgeTransferRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveEdgeTransferRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
