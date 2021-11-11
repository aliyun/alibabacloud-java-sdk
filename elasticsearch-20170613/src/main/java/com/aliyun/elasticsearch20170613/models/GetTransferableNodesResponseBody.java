// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetTransferableNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetTransferableNodesResponseBodyResult> result;

    public static GetTransferableNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTransferableNodesResponseBody self = new GetTransferableNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTransferableNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTransferableNodesResponseBody setResult(java.util.List<GetTransferableNodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetTransferableNodesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetTransferableNodesResponseBodyResult extends TeaModel {
        @NameInMap("host")
        public String host;

        @NameInMap("port")
        public Integer port;

        public static GetTransferableNodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTransferableNodesResponseBodyResult self = new GetTransferableNodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTransferableNodesResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetTransferableNodesResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
