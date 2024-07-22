// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ShrinkNodeRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<ShrinkNodeRequestBody> body;

    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKER</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    public static ShrinkNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ShrinkNodeRequest self = new ShrinkNodeRequest();
        return TeaModel.build(map, self);
    }

    public ShrinkNodeRequest setBody(java.util.List<ShrinkNodeRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ShrinkNodeRequestBody> getBody() {
        return this.body;
    }

    public ShrinkNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ShrinkNodeRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ShrinkNodeRequest setIgnoreStatus(Boolean ignoreStatus) {
        this.ignoreStatus = ignoreStatus;
        return this;
    }
    public Boolean getIgnoreStatus() {
        return this.ignoreStatus;
    }

    public ShrinkNodeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public static class ShrinkNodeRequestBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>es-cn-pl32xxxxxxx-data-f-1</p>
         */
        @NameInMap("hostName")
        public String hostName;

        /**
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

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

        public static ShrinkNodeRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ShrinkNodeRequestBody self = new ShrinkNodeRequestBody();
            return TeaModel.build(map, self);
        }

        public ShrinkNodeRequestBody setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ShrinkNodeRequestBody setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ShrinkNodeRequestBody setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ShrinkNodeRequestBody setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ShrinkNodeRequestBody setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
