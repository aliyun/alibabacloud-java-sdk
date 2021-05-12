// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionsShrinkRequest extends TeaModel {
    @NameInMap("released")
    public Boolean released;

    @NameInMap("platforms")
    public String platformsShrink;

    public static ListProductVersionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsShrinkRequest self = new ListProductVersionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsShrinkRequest setReleased(Boolean released) {
        this.released = released;
        return this;
    }
    public Boolean getReleased() {
        return this.released;
    }

    public ListProductVersionsShrinkRequest setPlatformsShrink(String platformsShrink) {
        this.platformsShrink = platformsShrink;
        return this;
    }
    public String getPlatformsShrink() {
        return this.platformsShrink;
    }

}
