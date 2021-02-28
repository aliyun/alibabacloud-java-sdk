// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotChatDataResponseBody extends TeaModel {
    @NameInMap("CostTime")
    public String costTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Datas")
    public java.util.List<java.util.Map<String, ?>> datas;

    public static GetBotChatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBotChatDataResponseBody self = new GetBotChatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBotChatDataResponseBody setCostTime(String costTime) {
        this.costTime = costTime;
        return this;
    }
    public String getCostTime() {
        return this.costTime;
    }

    public GetBotChatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBotChatDataResponseBody setDatas(java.util.List<java.util.Map<String, ?>> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getDatas() {
        return this.datas;
    }

}
