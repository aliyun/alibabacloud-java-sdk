// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class RemoveMessagesShrinkRequest extends TeaModel {
    @NameInMap("MsgIds")
    public String msgIdsShrink;

    @NameInMap("ParamsJson")
    public String paramsJson;

    public static RemoveMessagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessagesShrinkRequest self = new RemoveMessagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMessagesShrinkRequest setMsgIdsShrink(String msgIdsShrink) {
        this.msgIdsShrink = msgIdsShrink;
        return this;
    }
    public String getMsgIdsShrink() {
        return this.msgIdsShrink;
    }

    public RemoveMessagesShrinkRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
