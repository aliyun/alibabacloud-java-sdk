// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class LjxTestShrinkRequest extends TeaModel {
    @NameInMap("code")
    public String codeShrink;

    @NameInMap("id")
    public String id;

    @NameInMap("new-param-1")
    public String newParam1Shrink;

    @NameInMap("new-param-2")
    public String newParam2;

    public static LjxTestShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        LjxTestShrinkRequest self = new LjxTestShrinkRequest();
        return TeaModel.build(map, self);
    }

    public LjxTestShrinkRequest setCodeShrink(String codeShrink) {
        this.codeShrink = codeShrink;
        return this;
    }
    public String getCodeShrink() {
        return this.codeShrink;
    }

    public LjxTestShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LjxTestShrinkRequest setNewParam1Shrink(String newParam1Shrink) {
        this.newParam1Shrink = newParam1Shrink;
        return this;
    }
    public String getNewParam1Shrink() {
        return this.newParam1Shrink;
    }

    public LjxTestShrinkRequest setNewParam2(String newParam2) {
        this.newParam2 = newParam2;
        return this;
    }
    public String getNewParam2() {
        return this.newParam2;
    }

}
