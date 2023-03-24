// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListConnectorsShrinkRequest extends TeaModel {
    @NameInMap("ConnectorIds")
    public String connectorIdsShrink;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListConnectorsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsShrinkRequest self = new ListConnectorsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectorsShrinkRequest setConnectorIdsShrink(String connectorIdsShrink) {
        this.connectorIdsShrink = connectorIdsShrink;
        return this;
    }
    public String getConnectorIdsShrink() {
        return this.connectorIdsShrink;
    }

    public ListConnectorsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListConnectorsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListConnectorsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
