// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMPaaSMasTinyAppHistoryDataResponse extends TeaModel {
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
    public QueryMPaaSMasTinyAppHistoryDataResponseResultContent resultContent;

    public static QueryMPaaSMasTinyAppHistoryDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMPaaSMasTinyAppHistoryDataResponse self = new QueryMPaaSMasTinyAppHistoryDataResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMPaaSMasTinyAppHistoryDataResponseResultContent extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Long code;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("Msg")
        @Validation(required = true)
        public String msg;

        public static QueryMPaaSMasTinyAppHistoryDataResponseResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMPaaSMasTinyAppHistoryDataResponseResultContent self = new QueryMPaaSMasTinyAppHistoryDataResponseResultContent();
            return TeaModel.build(map, self);
        }

    }

}
