// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateElasticNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Content")
    public CreateElasticNetworkInterfaceResponseBodyContent content;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateElasticNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticNetworkInterfaceResponseBody self = new CreateElasticNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateElasticNetworkInterfaceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateElasticNetworkInterfaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateElasticNetworkInterfaceResponseBody setContent(CreateElasticNetworkInterfaceResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateElasticNetworkInterfaceResponseBodyContent getContent() {
        return this.content;
    }

    public CreateElasticNetworkInterfaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateElasticNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateElasticNetworkInterfaceResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun Elastic Network Interface ID.</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1fejojjo****</p>
         */
        @NameInMap("ElasticNetworkInterfaceId")
        public String elasticNetworkInterfaceId;

        /**
         * <p>The ID of the Lingjun node.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-lbj3aej****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static CreateElasticNetworkInterfaceResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateElasticNetworkInterfaceResponseBodyContent self = new CreateElasticNetworkInterfaceResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateElasticNetworkInterfaceResponseBodyContent setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public CreateElasticNetworkInterfaceResponseBodyContent setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
