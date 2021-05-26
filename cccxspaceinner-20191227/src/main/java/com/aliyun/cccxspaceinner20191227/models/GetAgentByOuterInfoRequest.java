// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentByOuterInfoRequest extends TeaModel {
    @NameInMap("OuterType")
    public String outerType;

    @NameInMap("OuterBuId")
    public String outerBuId;

    @NameInMap("OuterAccountId")
    public String outerAccountId;

    public static GetAgentByOuterInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentByOuterInfoRequest self = new GetAgentByOuterInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentByOuterInfoRequest setOuterType(String outerType) {
        this.outerType = outerType;
        return this;
    }
    public String getOuterType() {
        return this.outerType;
    }

    public GetAgentByOuterInfoRequest setOuterBuId(String outerBuId) {
        this.outerBuId = outerBuId;
        return this;
    }
    public String getOuterBuId() {
        return this.outerBuId;
    }

    public GetAgentByOuterInfoRequest setOuterAccountId(String outerAccountId) {
        this.outerAccountId = outerAccountId;
        return this;
    }
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

}
