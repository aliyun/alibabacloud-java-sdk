// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainPeerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListBaaSAntChainPeerResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBaaSAntChainPeerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSAntChainPeerResponseBody self = new ListBaaSAntChainPeerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaaSAntChainPeerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBaaSAntChainPeerResponseBody setData(java.util.List<ListBaaSAntChainPeerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBaaSAntChainPeerResponseBodyData> getData() {
        return this.data;
    }

    public ListBaaSAntChainPeerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaaSAntChainPeerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBaaSAntChainPeerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaaSAntChainPeerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaaSAntChainPeerResponseBodyData extends TeaModel {
        @NameInMap("NodeName")
        public String nodeName;

        public static ListBaaSAntChainPeerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaaSAntChainPeerResponseBodyData self = new ListBaaSAntChainPeerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaaSAntChainPeerResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
