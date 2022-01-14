// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMgsTestreqbodyautogenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public String resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMgsTestreqbodyautogenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsTestreqbodyautogenResponseBody self = new QueryMgsTestreqbodyautogenResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMgsTestreqbodyautogenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMgsTestreqbodyautogenResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMgsTestreqbodyautogenResponseBody setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

    public QueryMgsTestreqbodyautogenResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
