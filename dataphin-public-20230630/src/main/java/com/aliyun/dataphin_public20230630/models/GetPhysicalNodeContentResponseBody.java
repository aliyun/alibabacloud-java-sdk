// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPhysicalNodeContentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPhysicalNodeContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeContentResponseBody self = new GetPhysicalNodeContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeContentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhysicalNodeContentResponseBody setData(GetPhysicalNodeContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPhysicalNodeContentResponseBodyData getData() {
        return this.data;
    }

    public GetPhysicalNodeContentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPhysicalNodeContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhysicalNodeContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhysicalNodeContentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPhysicalNodeContentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>select 1;</p>
         */
        @NameInMap("CodeContent")
        public String codeContent;

        /**
         * <strong>example:</strong>
         * <p>n_232411</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        public static GetPhysicalNodeContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeContentResponseBodyData self = new GetPhysicalNodeContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeContentResponseBodyData setCodeContent(String codeContent) {
            this.codeContent = codeContent;
            return this;
        }
        public String getCodeContent() {
            return this.codeContent;
        }

        public GetPhysicalNodeContentResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPhysicalNodeContentResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
