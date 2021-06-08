// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnSubTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteDcdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnSubTaskRequest self = new DeleteDcdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnSubTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
