// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListDatabasesRequest extends TeaModel {
    /**
     * <p>Specifies whether to list only foreign tables. If you set this parameter to \<code>true\\</code>, only foreign tables are listed. If you set this parameter to \<code>false\\</code> or do not specify it, all tables are listed.</p>
     * 
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
