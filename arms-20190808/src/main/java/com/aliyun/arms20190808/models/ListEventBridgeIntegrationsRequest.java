// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEventBridgeIntegrationsRequest extends TeaModel {
    // The name of the EventBridge integration.
    @NameInMap("Name")
    public String name;

    // The number of the page to return.
    @NameInMap("Page")
    public Long page;

    // The number of entries to return on each page.
    @NameInMap("Size")
    public Long size;

    public static ListEventBridgeIntegrationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventBridgeIntegrationsRequest self = new ListEventBridgeIntegrationsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventBridgeIntegrationsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEventBridgeIntegrationsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListEventBridgeIntegrationsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
