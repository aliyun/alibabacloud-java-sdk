// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateShrinkNodesRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public java.util.List<ValidateShrinkNodesRequestBody> body;

    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>Specifies whether to ignore the cluster health status.</p>
     * <ul>
     * <li>true: ignores the cluster health status.</li>
     * <li>false (default): does not ignore the cluster health status.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

    /**
     * <p>The type of nodes to scale in. Valid values:</p>
     * <ul>
     * <li>WORKER: hot node</li>
     * <li>WORKER_WARM: warm node</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKER</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    public static ValidateShrinkNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateShrinkNodesRequest self = new ValidateShrinkNodesRequest();
        return TeaModel.build(map, self);
    }

    public ValidateShrinkNodesRequest setBody(java.util.List<ValidateShrinkNodesRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ValidateShrinkNodesRequestBody> getBody() {
        return this.body;
    }

    public ValidateShrinkNodesRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ValidateShrinkNodesRequest setIgnoreStatus(Boolean ignoreStatus) {
        this.ignoreStatus = ignoreStatus;
        return this;
    }
    public Boolean getIgnoreStatus() {
        return this.ignoreStatus;
    }

    public ValidateShrinkNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public static class ValidateShrinkNodesRequestBody extends TeaModel {
        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The node name of the cloud-native ACK-based cluster. You can call the <a href="https://help.aliyun.com/document_detail/183958.html">ListAllNode</a> operation to obtain the node name.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-pl32xxxxxxx-data-f-1</p>
         */
        @NameInMap("hostName")
        public String hostName;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>WORKER: hot node</li>
         * <li>WORKER_WARM: warm node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>The access port number of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The zone ID of the node in the instance. For example, the zone ID of China (Shanghai) Zone C is cn-shanghai-c.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-c</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ValidateShrinkNodesRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ValidateShrinkNodesRequestBody self = new ValidateShrinkNodesRequestBody();
            return TeaModel.build(map, self);
        }

        public ValidateShrinkNodesRequestBody setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ValidateShrinkNodesRequestBody setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ValidateShrinkNodesRequestBody setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ValidateShrinkNodesRequestBody setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ValidateShrinkNodesRequestBody setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
