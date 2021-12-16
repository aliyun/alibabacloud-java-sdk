// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSecSpecInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnSecSpecInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSecSpecInfoRequest self = new DescribeDcdnSecSpecInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSecSpecInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
