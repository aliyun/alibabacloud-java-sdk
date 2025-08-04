// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ciomarketpop20250709.models;

import com.aliyun.tea.*;

public class PushEveryOneSellMsgRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;1234567&quot;]</p>
     */
    @NameInMap("DingIdList")
    public java.util.List<String> dingIdList;

    /**
     * <strong>example:</strong>
     * <p>推送内容</p>
     */
    @NameInMap("PushMsg")
    public String pushMsg;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PushType")
    public String pushType;

    public static PushEveryOneSellMsgRequest build(java.util.Map<String, ?> map) throws Exception {
        PushEveryOneSellMsgRequest self = new PushEveryOneSellMsgRequest();
        return TeaModel.build(map, self);
    }

    public PushEveryOneSellMsgRequest setDingIdList(java.util.List<String> dingIdList) {
        this.dingIdList = dingIdList;
        return this;
    }
    public java.util.List<String> getDingIdList() {
        return this.dingIdList;
    }

    public PushEveryOneSellMsgRequest setPushMsg(String pushMsg) {
        this.pushMsg = pushMsg;
        return this;
    }
    public String getPushMsg() {
        return this.pushMsg;
    }

    public PushEveryOneSellMsgRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

}
