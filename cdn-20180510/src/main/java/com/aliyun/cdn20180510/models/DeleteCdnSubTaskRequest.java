// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnSubTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteCdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdnSubTaskRequest self = new DeleteCdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCdnSubTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
