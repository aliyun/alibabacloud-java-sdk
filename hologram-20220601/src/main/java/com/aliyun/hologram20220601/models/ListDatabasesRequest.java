// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListDatabasesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("external")
    public Boolean external;

    public static ListDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesRequest self = new ListDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabasesRequest setExternal(Boolean external) {
        this.external = external;
        return this;
    }
    public Boolean getExternal() {
        return this.external;
    }

}
