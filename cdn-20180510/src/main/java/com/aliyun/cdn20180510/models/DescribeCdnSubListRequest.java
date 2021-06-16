// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSubListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Status")
    public String status;

    public static DescribeCdnSubListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSubListRequest self = new DescribeCdnSubListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSubListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnSubListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
