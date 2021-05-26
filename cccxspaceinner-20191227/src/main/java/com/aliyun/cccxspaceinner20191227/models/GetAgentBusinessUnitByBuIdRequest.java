// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentBusinessUnitByBuIdRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    public static GetAgentBusinessUnitByBuIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBusinessUnitByBuIdRequest self = new GetAgentBusinessUnitByBuIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentBusinessUnitByBuIdRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

}
