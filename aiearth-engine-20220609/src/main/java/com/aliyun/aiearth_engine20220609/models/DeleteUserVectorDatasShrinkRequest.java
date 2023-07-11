// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserVectorDatasShrinkRequest extends TeaModel {
    @NameInMap("DataIds")
    public String dataIdsShrink;

    public static DeleteUserVectorDatasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserVectorDatasShrinkRequest self = new DeleteUserVectorDatasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserVectorDatasShrinkRequest setDataIdsShrink(String dataIdsShrink) {
        this.dataIdsShrink = dataIdsShrink;
        return this;
    }
    public String getDataIdsShrink() {
        return this.dataIdsShrink;
    }

}
