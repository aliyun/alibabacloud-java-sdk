// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ShrinkNodeRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<ShrinkNodeRequestBody> body;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("count")
    public Integer count;

    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

    /**
     * <p>This parameter is required.</p>
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
        @NameInMap("host")
        public String host;

        @NameInMap("hostName")
        public String hostName;

        @NameInMap("nodeType")
        public String nodeType;

        @NameInMap("port")
        public Integer port;

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
