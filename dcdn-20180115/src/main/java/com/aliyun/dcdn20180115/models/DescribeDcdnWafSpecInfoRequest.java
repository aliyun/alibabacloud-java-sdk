// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafSpecInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnWafSpecInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafSpecInfoRequest self = new DescribeDcdnWafSpecInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafSpecInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
