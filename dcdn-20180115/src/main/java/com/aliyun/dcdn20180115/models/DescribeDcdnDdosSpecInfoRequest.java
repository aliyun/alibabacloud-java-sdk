// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDdosSpecInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnDdosSpecInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDdosSpecInfoRequest self = new DescribeDcdnDdosSpecInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDdosSpecInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
