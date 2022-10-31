// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteSnapshotCallbackAuthRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteSnapshotCallbackAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotCallbackAuthRequest self = new DeleteSnapshotCallbackAuthRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotCallbackAuthRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteSnapshotCallbackAuthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
