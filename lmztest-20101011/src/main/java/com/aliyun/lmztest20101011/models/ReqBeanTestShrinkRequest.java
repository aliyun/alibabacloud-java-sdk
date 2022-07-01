// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class ReqBeanTestShrinkRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("codes")
    public String codesShrink;

    @NameInMap("nums")
    public String numsShrink;

    @NameInMap("users")
    public String usersShrink;

    public static ReqBeanTestShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReqBeanTestShrinkRequest self = new ReqBeanTestShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReqBeanTestShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ReqBeanTestShrinkRequest setCodesShrink(String codesShrink) {
        this.codesShrink = codesShrink;
        return this;
    }
    public String getCodesShrink() {
        return this.codesShrink;
    }

    public ReqBeanTestShrinkRequest setNumsShrink(String numsShrink) {
        this.numsShrink = numsShrink;
        return this;
    }
    public String getNumsShrink() {
        return this.numsShrink;
    }

    public ReqBeanTestShrinkRequest setUsersShrink(String usersShrink) {
        this.usersShrink = usersShrink;
        return this;
    }
    public String getUsersShrink() {
        return this.usersShrink;
    }

}
