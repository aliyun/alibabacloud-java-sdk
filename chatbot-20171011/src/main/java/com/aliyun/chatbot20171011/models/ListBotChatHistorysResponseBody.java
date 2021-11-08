// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotChatHistorysResponseBody extends TeaModel {
    @NameInMap("CostTime")
    public String costTime;

    @NameInMap("Datas")
    public java.util.List<java.util.Map<String, ?>> datas;

    @NameInMap("RequestId")
    public String requestId;

    public static ListBotChatHistorysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBotChatHistorysResponseBody self = new ListBotChatHistorysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBotChatHistorysResponseBody setCostTime(String costTime) {
        this.costTime = costTime;
        return this;
    }
    public String getCostTime() {
        return this.costTime;
    }

    public ListBotChatHistorysResponseBody setDatas(java.util.List<java.util.Map<String, ?>> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getDatas() {
        return this.datas;
    }

    public ListBotChatHistorysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
