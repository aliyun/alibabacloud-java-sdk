// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterChecksRequest extends TeaModel {
    /**
     * <p>The check method.</p>
     */
    @NameInMap("type")
    public String type;

    public static ListClusterChecksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterChecksRequest self = new ListClusterChecksRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterChecksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
