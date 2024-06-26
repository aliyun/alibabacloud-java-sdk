// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddAntChainSubnetNodeCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<AddAntChainSubnetNodeCheckResponseBodyResult> result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static AddAntChainSubnetNodeCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAntChainSubnetNodeCheckResponseBody self = new AddAntChainSubnetNodeCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAntChainSubnetNodeCheckResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAntChainSubnetNodeCheckResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddAntChainSubnetNodeCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAntChainSubnetNodeCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAntChainSubnetNodeCheckResponseBody setResult(java.util.List<AddAntChainSubnetNodeCheckResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<AddAntChainSubnetNodeCheckResponseBodyResult> getResult() {
        return this.result;
    }

    public AddAntChainSubnetNodeCheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddAntChainSubnetNodeCheckResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddAntChainSubnetNodeCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddAntChainSubnetNodeCheckResponseBodyResult extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        public static AddAntChainSubnetNodeCheckResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddAntChainSubnetNodeCheckResponseBodyResult self = new AddAntChainSubnetNodeCheckResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddAntChainSubnetNodeCheckResponseBodyResult setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public AddAntChainSubnetNodeCheckResponseBodyResult setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
