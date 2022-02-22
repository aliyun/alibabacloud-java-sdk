// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class OpenCdtInternetServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static OpenCdtInternetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCdtInternetServiceRequest self = new OpenCdtInternetServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenCdtInternetServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
