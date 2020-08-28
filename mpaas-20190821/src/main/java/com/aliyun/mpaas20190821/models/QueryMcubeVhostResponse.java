// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMcubeVhostResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("QueryVhostResult")
    @Validation(required = true)
    public QueryMcubeVhostResponseQueryVhostResult queryVhostResult;

    public static QueryMcubeVhostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeVhostResponse self = new QueryMcubeVhostResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMcubeVhostResponseQueryVhostResult extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static QueryMcubeVhostResponseQueryVhostResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeVhostResponseQueryVhostResult self = new QueryMcubeVhostResponseQueryVhostResult();
            return TeaModel.build(map, self);
        }

    }

}
