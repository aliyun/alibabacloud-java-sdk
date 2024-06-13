// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetBotSessionDataResponseBody extends TeaModel {
    @NameInMap("CostTime")
    public String costTime;

    @NameInMap("Datas")
    public java.util.List<java.util.Map<String, ?>> datas;

    @NameInMap("RequestId")
    public String requestId;

    public static GetBotSessionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBotSessionDataResponseBody self = new GetBotSessionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBotSessionDataResponseBody setCostTime(String costTime) {
        this.costTime = costTime;
        return this;
    }
    public String getCostTime() {
        return this.costTime;
    }

    public GetBotSessionDataResponseBody setDatas(java.util.List<java.util.Map<String, ?>> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getDatas() {
        return this.datas;
    }

    public GetBotSessionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
