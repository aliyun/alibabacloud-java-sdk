// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentBusinessUnitByOuterInfoRequest extends TeaModel {
    @NameInMap("OuterType")
    public String outerType;

    @NameInMap("OuterBuId")
    public String outerBuId;

    public static GetAgentBusinessUnitByOuterInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBusinessUnitByOuterInfoRequest self = new GetAgentBusinessUnitByOuterInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentBusinessUnitByOuterInfoRequest setOuterType(String outerType) {
        this.outerType = outerType;
        return this;
    }
    public String getOuterType() {
        return this.outerType;
    }

    public GetAgentBusinessUnitByOuterInfoRequest setOuterBuId(String outerBuId) {
        this.outerBuId = outerBuId;
        return this;
    }
    public String getOuterBuId() {
        return this.outerBuId;
    }

}
