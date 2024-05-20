// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListAddOrUpdateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WhiteLists")
    public String whiteListsShrink;

    public static DsgWhiteListAddOrUpdateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgWhiteListAddOrUpdateShrinkRequest self = new DsgWhiteListAddOrUpdateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgWhiteListAddOrUpdateShrinkRequest setWhiteListsShrink(String whiteListsShrink) {
        this.whiteListsShrink = whiteListsShrink;
        return this;
    }
    public String getWhiteListsShrink() {
        return this.whiteListsShrink;
    }

}
