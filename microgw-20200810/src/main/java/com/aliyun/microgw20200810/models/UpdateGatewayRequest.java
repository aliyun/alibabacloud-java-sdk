// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateGatewayRequest extends TeaModel {
    // GatewayUpdateDTO
    @NameInMap("data")
    public UpdateGatewayRequestData data;

    public static UpdateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRequest self = new UpdateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRequest setData(UpdateGatewayRequestData data) {
        this.data = data;
        return this;
    }
    public UpdateGatewayRequestData getData() {
        return this.data;
    }

    public static class UpdateGatewayRequestData extends TeaModel {
        // id
        @NameInMap("id")
        public Long id;

        // replica
        @NameInMap("replica")
        public String replica;

        public static UpdateGatewayRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRequestData self = new UpdateGatewayRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRequestData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateGatewayRequestData setReplica(String replica) {
            this.replica = replica;
            return this;
        }
        public String getReplica() {
            return this.replica;
        }

    }

}
