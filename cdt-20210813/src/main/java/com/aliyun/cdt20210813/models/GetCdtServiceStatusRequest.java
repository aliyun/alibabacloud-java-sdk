// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class GetCdtServiceStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetCdtServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCdtServiceStatusRequest self = new GetCdtServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetCdtServiceStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
