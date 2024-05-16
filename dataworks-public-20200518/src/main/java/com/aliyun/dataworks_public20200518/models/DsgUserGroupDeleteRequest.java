// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupDeleteRequest extends TeaModel {
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static DsgUserGroupDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupDeleteRequest self = new DsgUserGroupDeleteRequest();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupDeleteRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
