// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMPaaSMasTinyAppDailyDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ResultContent")
    @Validation(required = true)
    public QueryMPaaSMasTinyAppDailyDataResponseResultContent resultContent;

    public static QueryMPaaSMasTinyAppDailyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMPaaSMasTinyAppDailyDataResponse self = new QueryMPaaSMasTinyAppDailyDataResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMPaaSMasTinyAppDailyDataResponseResultContent extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Long code;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("Msg")
        @Validation(required = true)
        public String msg;

        public static QueryMPaaSMasTinyAppDailyDataResponseResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMPaaSMasTinyAppDailyDataResponseResultContent self = new QueryMPaaSMasTinyAppDailyDataResponseResultContent();
            return TeaModel.build(map, self);
        }

    }

}
