// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteElasticNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public DeleteElasticNetworkInterfaceResponseBodyContent content;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BDBCC783-84CA-5733-8EEA-645C88B9009C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteElasticNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticNetworkInterfaceResponseBody self = new DeleteElasticNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteElasticNetworkInterfaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteElasticNetworkInterfaceResponseBody setContent(DeleteElasticNetworkInterfaceResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DeleteElasticNetworkInterfaceResponseBodyContent getContent() {
        return this.content;
    }

    public DeleteElasticNetworkInterfaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteElasticNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteElasticNetworkInterfaceResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun Elastic Network Interface ID</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1234****</p>
         */
        @NameInMap("ElasticNetworkInterfaceId")
        public String elasticNetworkInterfaceId;

        /**
         * <p>Lingjun Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-lbj3aej****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static DeleteElasticNetworkInterfaceResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteElasticNetworkInterfaceResponseBodyContent self = new DeleteElasticNetworkInterfaceResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DeleteElasticNetworkInterfaceResponseBodyContent setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public DeleteElasticNetworkInterfaceResponseBodyContent setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
