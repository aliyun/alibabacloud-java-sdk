// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScanCodeBindShrinkRequest extends TeaModel {
    @NameInMap("BindReq")
    public String bindReqShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ScanCodeBindShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanCodeBindShrinkRequest self = new ScanCodeBindShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScanCodeBindShrinkRequest setBindReqShrink(String bindReqShrink) {
        this.bindReqShrink = bindReqShrink;
        return this;
    }
    public String getBindReqShrink() {
        return this.bindReqShrink;
    }

    public ScanCodeBindShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
