// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSLSRealTimeLogTypeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnSLSRealTimeLogTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSLSRealTimeLogTypeRequest self = new DescribeDcdnSLSRealTimeLogTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSLSRealTimeLogTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
