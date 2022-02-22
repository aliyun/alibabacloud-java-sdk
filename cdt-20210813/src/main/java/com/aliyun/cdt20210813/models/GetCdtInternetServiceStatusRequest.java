// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class GetCdtInternetServiceStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetCdtInternetServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCdtInternetServiceStatusRequest self = new GetCdtInternetServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetCdtInternetServiceStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
