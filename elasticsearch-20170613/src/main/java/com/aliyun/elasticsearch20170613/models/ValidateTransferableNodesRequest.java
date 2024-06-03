// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateTransferableNodesRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<ValidateTransferableNodesRequestBody> body;

    /**
     * <p>This parameter is required.</p>
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
        @NameInMap("host")
        public String host;

        @NameInMap("port")
        public Integer port;

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
