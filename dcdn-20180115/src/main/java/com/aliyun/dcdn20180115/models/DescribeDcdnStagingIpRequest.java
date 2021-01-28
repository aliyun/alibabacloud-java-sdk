// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnStagingIpRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnStagingIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnStagingIpRequest self = new DescribeDcdnStagingIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnStagingIpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
