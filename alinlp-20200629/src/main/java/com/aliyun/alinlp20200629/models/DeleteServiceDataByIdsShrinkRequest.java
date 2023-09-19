// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class DeleteServiceDataByIdsShrinkRequest extends TeaModel {
    @NameInMap("Ids")
    public String idsShrink;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static DeleteServiceDataByIdsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceDataByIdsShrinkRequest self = new DeleteServiceDataByIdsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceDataByIdsShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public DeleteServiceDataByIdsShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
