// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupDeleteShrinkRequest extends TeaModel {
    @NameInMap("Ids")
    public String idsShrink;

    public static DsgUserGroupDeleteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupDeleteShrinkRequest self = new DsgUserGroupDeleteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupDeleteShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
