// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationVersionsRequest extends TeaModel {
    @NameInMap("sortDirect")
    public String sortDirect;

    @NameInMap("sortKey")
    public String sortKey;

    @NameInMap("type")
    public String type;

    public static ListFoundationVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationVersionsRequest self = new ListFoundationVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFoundationVersionsRequest setSortDirect(String sortDirect) {
        this.sortDirect = sortDirect;
        return this;
    }
    public String getSortDirect() {
        return this.sortDirect;
    }

    public ListFoundationVersionsRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public ListFoundationVersionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
