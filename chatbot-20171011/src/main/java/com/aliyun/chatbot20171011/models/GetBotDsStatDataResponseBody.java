// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotDsStatDataResponseBody extends TeaModel {
    @NameInMap("CostTime")
    public String costTime;

    @NameInMap("Datas")
    public java.util.List<java.util.Map<String, ?>> datas;

    @NameInMap("RequestId")
    public String requestId;

    public static GetBotDsStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBotDsStatDataResponseBody self = new GetBotDsStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBotDsStatDataResponseBody setCostTime(String costTime) {
        this.costTime = costTime;
        return this;
    }
    public String getCostTime() {
        return this.costTime;
    }

    public GetBotDsStatDataResponseBody setDatas(java.util.List<java.util.Map<String, ?>> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getDatas() {
        return this.datas;
    }

    public GetBotDsStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
