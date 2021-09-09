// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class GetCdtCbServiceStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetCdtCbServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCdtCbServiceStatusRequest self = new GetCdtCbServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetCdtCbServiceStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
