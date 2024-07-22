// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TransferNodeRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<TransferNodeRequestBody> body;

    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKER</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    public static TransferNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferNodeRequest self = new TransferNodeRequest();
        return TeaModel.build(map, self);
    }

    public TransferNodeRequest setBody(java.util.List<TransferNodeRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<TransferNodeRequestBody> getBody() {
        return this.body;
    }

    public TransferNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TransferNodeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public static class TransferNodeRequestBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai-c</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static TransferNodeRequestBody build(java.util.Map<String, ?> map) throws Exception {
            TransferNodeRequestBody self = new TransferNodeRequestBody();
            return TeaModel.build(map, self);
        }

        public TransferNodeRequestBody setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public TransferNodeRequestBody setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public TransferNodeRequestBody setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
