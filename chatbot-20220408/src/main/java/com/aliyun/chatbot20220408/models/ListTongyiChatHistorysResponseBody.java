// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListTongyiChatHistorysResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>116</p>
     */
    @NameInMap("CostTime")
    public String costTime;

    @NameInMap("Datas")
    public java.util.List<java.util.Map<String, ?>> datas;

    /**
     * <strong>example:</strong>
     * <p>D0DDFC4C-D66D-4787-9AE4-4D757481EDEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTongyiChatHistorysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTongyiChatHistorysResponseBody self = new ListTongyiChatHistorysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTongyiChatHistorysResponseBody setCostTime(String costTime) {
        this.costTime = costTime;
        return this;
    }
    public String getCostTime() {
        return this.costTime;
    }

    public ListTongyiChatHistorysResponseBody setDatas(java.util.List<java.util.Map<String, ?>> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getDatas() {
        return this.datas;
    }

    public ListTongyiChatHistorysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
