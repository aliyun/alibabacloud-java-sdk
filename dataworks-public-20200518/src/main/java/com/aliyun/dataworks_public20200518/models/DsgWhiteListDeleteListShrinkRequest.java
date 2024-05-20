// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListDeleteListShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    public static DsgWhiteListDeleteListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgWhiteListDeleteListShrinkRequest self = new DsgWhiteListDeleteListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgWhiteListDeleteListShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
