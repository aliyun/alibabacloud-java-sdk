// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateTransferableNodesRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public java.util.List<ValidateTransferableNodesRequestBody> body;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li>WORKER: hot node</li>
     * <li>WORKER_WARM: warm node</li>
     * </ul>
     * <blockquote>
     * <p>COORDINATING (client node) and KIBANA (Kibana node) are not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKER</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    public static ValidateTransferableNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateTransferableNodesRequest self = new ValidateTransferableNodesRequest();
        return TeaModel.build(map, self);
    }

    public ValidateTransferableNodesRequest setBody(java.util.List<ValidateTransferableNodesRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ValidateTransferableNodesRequestBody> getBody() {
        return this.body;
    }

    public ValidateTransferableNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public static class ValidateTransferableNodesRequestBody extends TeaModel {
        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.xx.xx</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The access port number of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The zone ID of the instance node. For example, the ID of Zone C in the China (Shanghai) region is cn-shanghai-c.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-c</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ValidateTransferableNodesRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ValidateTransferableNodesRequestBody self = new ValidateTransferableNodesRequestBody();
            return TeaModel.build(map, self);
        }

        public ValidateTransferableNodesRequestBody setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ValidateTransferableNodesRequestBody setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ValidateTransferableNodesRequestBody setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
