// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamsNotifyUrlConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    public static DeleteLiveStreamsNotifyUrlConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamsNotifyUrlConfigRequest self = new DeleteLiveStreamsNotifyUrlConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamsNotifyUrlConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveStreamsNotifyUrlConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
