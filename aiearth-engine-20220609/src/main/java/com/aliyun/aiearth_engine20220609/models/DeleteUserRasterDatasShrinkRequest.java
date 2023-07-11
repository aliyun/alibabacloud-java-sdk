// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserRasterDatasShrinkRequest extends TeaModel {
    @NameInMap("DataIds")
    public String dataIdsShrink;

    public static DeleteUserRasterDatasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRasterDatasShrinkRequest self = new DeleteUserRasterDatasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserRasterDatasShrinkRequest setDataIdsShrink(String dataIdsShrink) {
        this.dataIdsShrink = dataIdsShrink;
        return this;
    }
    public String getDataIdsShrink() {
        return this.dataIdsShrink;
    }

}
