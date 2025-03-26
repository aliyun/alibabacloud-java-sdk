// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateElasticNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
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
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public UpdateElasticNetworkInterfaceResponseBodyContent content;

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
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateElasticNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateElasticNetworkInterfaceResponseBody self = new UpdateElasticNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateElasticNetworkInterfaceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateElasticNetworkInterfaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateElasticNetworkInterfaceResponseBody setContent(UpdateElasticNetworkInterfaceResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UpdateElasticNetworkInterfaceResponseBodyContent getContent() {
        return this.content;
    }

    public UpdateElasticNetworkInterfaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateElasticNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateElasticNetworkInterfaceResponseBodyContent extends TeaModel {
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

        public static UpdateElasticNetworkInterfaceResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateElasticNetworkInterfaceResponseBodyContent self = new UpdateElasticNetworkInterfaceResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UpdateElasticNetworkInterfaceResponseBodyContent setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public UpdateElasticNetworkInterfaceResponseBodyContent setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
