// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMPaaSMasTinyAppDailyPageViewResponse extends TeaModel {
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
    public QueryMPaaSMasTinyAppDailyPageViewResponseResultContent resultContent;

    public static QueryMPaaSMasTinyAppDailyPageViewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMPaaSMasTinyAppDailyPageViewResponse self = new QueryMPaaSMasTinyAppDailyPageViewResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMPaaSMasTinyAppDailyPageViewResponseResultContent extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Long code;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("Msg")
        @Validation(required = true)
        public String msg;

        public static QueryMPaaSMasTinyAppDailyPageViewResponseResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMPaaSMasTinyAppDailyPageViewResponseResultContent self = new QueryMPaaSMasTinyAppDailyPageViewResponseResultContent();
            return TeaModel.build(map, self);
        }

    }

}
