// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class QueryInterconnectionCidMappingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryInterconnectionCidMappingResponseBodyResult result;

    public static QueryInterconnectionCidMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInterconnectionCidMappingResponseBody self = new QueryInterconnectionCidMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInterconnectionCidMappingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInterconnectionCidMappingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInterconnectionCidMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInterconnectionCidMappingResponseBody setResult(QueryInterconnectionCidMappingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryInterconnectionCidMappingResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryInterconnectionCidMappingResponseBodyResult extends TeaModel {
        @NameInMap("DstCid")
        public String dstCid;

        public static QueryInterconnectionCidMappingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryInterconnectionCidMappingResponseBodyResult self = new QueryInterconnectionCidMappingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryInterconnectionCidMappingResponseBodyResult setDstCid(String dstCid) {
            this.dstCid = dstCid;
            return this;
        }
        public String getDstCid() {
            return this.dstCid;
        }

    }

}
