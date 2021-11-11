// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetSuggestShrinkableNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetSuggestShrinkableNodesResponseBodyResult> result;

    public static GetSuggestShrinkableNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSuggestShrinkableNodesResponseBody self = new GetSuggestShrinkableNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSuggestShrinkableNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSuggestShrinkableNodesResponseBody setResult(java.util.List<GetSuggestShrinkableNodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetSuggestShrinkableNodesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetSuggestShrinkableNodesResponseBodyResult extends TeaModel {
        @NameInMap("host")
        public String host;

        @NameInMap("port")
        public Integer port;

        public static GetSuggestShrinkableNodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSuggestShrinkableNodesResponseBodyResult self = new GetSuggestShrinkableNodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSuggestShrinkableNodesResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetSuggestShrinkableNodesResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
