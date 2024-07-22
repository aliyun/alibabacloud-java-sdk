// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetTransferableNodesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
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
        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.**.**</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The access port of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
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
