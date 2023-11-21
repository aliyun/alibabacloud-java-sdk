// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserMapserviceDatasShrinkRequest extends TeaModel {
    @NameInMap("DataIds")
    public String dataIdsShrink;

    public static DeleteUserMapserviceDatasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserMapserviceDatasShrinkRequest self = new DeleteUserMapserviceDatasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserMapserviceDatasShrinkRequest setDataIdsShrink(String dataIdsShrink) {
        this.dataIdsShrink = dataIdsShrink;
        return this;
    }
    public String getDataIdsShrink() {
        return this.dataIdsShrink;
    }

}
