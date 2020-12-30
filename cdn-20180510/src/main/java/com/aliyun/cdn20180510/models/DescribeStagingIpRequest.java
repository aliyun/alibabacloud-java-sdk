// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeStagingIpRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeStagingIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStagingIpRequest self = new DescribeStagingIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStagingIpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
