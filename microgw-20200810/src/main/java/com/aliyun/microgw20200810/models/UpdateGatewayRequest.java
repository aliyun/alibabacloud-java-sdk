// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateGatewayRequest extends TeaModel {
    // id
    @NameInMap("id")
    public Long id;

    // replica
    @NameInMap("replica")
    public String replica;

    public static UpdateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRequest self = new UpdateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayRequest setReplica(String replica) {
        this.replica = replica;
        return this;
    }
    public String getReplica() {
        return this.replica;
    }

}
