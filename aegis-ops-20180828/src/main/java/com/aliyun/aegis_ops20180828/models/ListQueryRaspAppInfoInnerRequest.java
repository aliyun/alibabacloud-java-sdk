// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class ListQueryRaspAppInfoInnerRequest extends TeaModel {
    @NameInMap("Uuids")
    public String uuids;

    public static ListQueryRaspAppInfoInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueryRaspAppInfoInnerRequest self = new ListQueryRaspAppInfoInnerRequest();
        return TeaModel.build(map, self);
    }

    public ListQueryRaspAppInfoInnerRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
