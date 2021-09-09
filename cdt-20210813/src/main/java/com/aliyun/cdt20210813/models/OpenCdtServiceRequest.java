// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class OpenCdtServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static OpenCdtServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCdtServiceRequest self = new OpenCdtServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenCdtServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
