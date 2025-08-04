// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ciomarketpop20250709.models;

import com.aliyun.tea.*;

public class PushEveryOneSellMsgShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;1234567&quot;]</p>
     */
    @NameInMap("DingIdList")
    public String dingIdListShrink;

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

    public static PushEveryOneSellMsgShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushEveryOneSellMsgShrinkRequest self = new PushEveryOneSellMsgShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushEveryOneSellMsgShrinkRequest setDingIdListShrink(String dingIdListShrink) {
        this.dingIdListShrink = dingIdListShrink;
        return this;
    }
    public String getDingIdListShrink() {
        return this.dingIdListShrink;
    }

    public PushEveryOneSellMsgShrinkRequest setPushMsg(String pushMsg) {
        this.pushMsg = pushMsg;
        return this;
    }
    public String getPushMsg() {
        return this.pushMsg;
    }

    public PushEveryOneSellMsgShrinkRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

}
