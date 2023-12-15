// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class RemoveMessagesRequest extends TeaModel {
    @NameInMap("MsgIds")
    public java.util.Map<String, ?> msgIds;

    @NameInMap("ParamsJson")
    public String paramsJson;

    public static RemoveMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessagesRequest self = new RemoveMessagesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMessagesRequest setMsgIds(java.util.Map<String, ?> msgIds) {
        this.msgIds = msgIds;
        return this;
    }
    public java.util.Map<String, ?> getMsgIds() {
        return this.msgIds;
    }

    public RemoveMessagesRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
