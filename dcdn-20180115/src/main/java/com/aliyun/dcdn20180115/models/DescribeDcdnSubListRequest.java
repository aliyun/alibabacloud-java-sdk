// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSubListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnSubListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSubListRequest self = new DescribeDcdnSubListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSubListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
