// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListSandboxesOutput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<Sandbox> items;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListSandboxesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxesOutput self = new ListSandboxesOutput();
        return TeaModel.build(map, self);
    }

    public ListSandboxesOutput setItems(java.util.List<Sandbox> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Sandbox> getItems() {
        return this.items;
    }

    public ListSandboxesOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
