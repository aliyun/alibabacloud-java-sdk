// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardLatestFlowRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    public static GetCardLatestFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardLatestFlowRequest self = new GetCardLatestFlowRequest();
        return TeaModel.build(map, self);
    }

    public GetCardLatestFlowRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

}
