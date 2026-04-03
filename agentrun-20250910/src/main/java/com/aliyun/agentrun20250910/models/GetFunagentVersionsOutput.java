// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetFunagentVersionsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<FunagentVersionItem> items;

    public static GetFunagentVersionsOutput build(java.util.Map<String, ?> map) throws Exception {
        GetFunagentVersionsOutput self = new GetFunagentVersionsOutput();
        return TeaModel.build(map, self);
    }

    public GetFunagentVersionsOutput setItems(java.util.List<FunagentVersionItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<FunagentVersionItem> getItems() {
        return this.items;
    }

}
