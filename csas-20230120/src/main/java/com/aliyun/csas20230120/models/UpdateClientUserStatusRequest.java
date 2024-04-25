// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateClientUserStatusRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Status")
    public String status;

    public static UpdateClientUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientUserStatusRequest self = new UpdateClientUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClientUserStatusRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateClientUserStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
