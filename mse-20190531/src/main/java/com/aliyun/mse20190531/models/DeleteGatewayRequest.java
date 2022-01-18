// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayRequest extends TeaModel {
    @NameInMap("DeleteSlb")
    public Boolean deleteSlb;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static DeleteGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayRequest self = new DeleteGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayRequest setDeleteSlb(Boolean deleteSlb) {
        this.deleteSlb = deleteSlb;
        return this;
    }
    public Boolean getDeleteSlb() {
        return this.deleteSlb;
    }

    public DeleteGatewayRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
