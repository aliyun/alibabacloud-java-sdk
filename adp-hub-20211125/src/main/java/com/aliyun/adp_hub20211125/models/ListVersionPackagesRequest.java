// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class ListVersionPackagesRequest extends TeaModel {
    @NameInMap("uid")
    public String uid;

    public static ListVersionPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVersionPackagesRequest self = new ListVersionPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListVersionPackagesRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
