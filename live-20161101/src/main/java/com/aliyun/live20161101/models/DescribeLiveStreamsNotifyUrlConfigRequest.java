// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsNotifyUrlConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeLiveStreamsNotifyUrlConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsNotifyUrlConfigRequest self = new DescribeLiveStreamsNotifyUrlConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsNotifyUrlConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamsNotifyUrlConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
