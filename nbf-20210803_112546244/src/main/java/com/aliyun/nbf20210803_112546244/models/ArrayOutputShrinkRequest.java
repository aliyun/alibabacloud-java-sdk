// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class ArrayOutputShrinkRequest extends TeaModel {
    @NameInMap("innput")
    public String innputShrink;

    public static ArrayOutputShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ArrayOutputShrinkRequest self = new ArrayOutputShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ArrayOutputShrinkRequest setInnputShrink(String innputShrink) {
        this.innputShrink = innputShrink;
        return this;
    }
    public String getInnputShrink() {
        return this.innputShrink;
    }

}
