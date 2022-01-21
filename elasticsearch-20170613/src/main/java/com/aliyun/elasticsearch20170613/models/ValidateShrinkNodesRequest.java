// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateShrinkNodesRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<ValidateShrinkNodesRequestBody> body;

    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

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
        @NameInMap("host")
        public String host;

        @NameInMap("port")
        public Integer port;

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
