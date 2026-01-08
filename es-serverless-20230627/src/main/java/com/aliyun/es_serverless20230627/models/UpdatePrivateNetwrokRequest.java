// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdatePrivateNetwrokRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<UpdatePrivateNetwrokRequestBody> body;

    public static UpdatePrivateNetwrokRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateNetwrokRequest self = new UpdatePrivateNetwrokRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateNetwrokRequest setBody(java.util.List<UpdatePrivateNetwrokRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<UpdatePrivateNetwrokRequestBody> getBody() {
        return this.body;
    }

    public static class UpdatePrivateNetwrokRequestBodyWhiteIpGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        /**
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        @NameInMap("modifyMode")
        public String modifyMode;

        public static UpdatePrivateNetwrokRequestBodyWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateNetwrokRequestBodyWhiteIpGroup self = new UpdatePrivateNetwrokRequestBodyWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateNetwrokRequestBodyWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdatePrivateNetwrokRequestBodyWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public UpdatePrivateNetwrokRequestBodyWhiteIpGroup setModifyMode(String modifyMode) {
            this.modifyMode = modifyMode;
            return this;
        }
        public String getModifyMode() {
            return this.modifyMode;
        }

    }

    public static class UpdatePrivateNetwrokRequestBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>autotest-8k8a8.serverless.cn-hangzhou.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>ep-bp1id6dc2568****</p>
         */
        @NameInMap("pvlEndpointId")
        public String pvlEndpointId;

        /**
         * <strong>example:</strong>
         * <p>PRIVATE_ES</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf664nyle5khp5***</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("whiteIpGroup")
        public java.util.List<UpdatePrivateNetwrokRequestBodyWhiteIpGroup> whiteIpGroup;

        public static UpdatePrivateNetwrokRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateNetwrokRequestBody self = new UpdatePrivateNetwrokRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateNetwrokRequestBody setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdatePrivateNetwrokRequestBody setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdatePrivateNetwrokRequestBody setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdatePrivateNetwrokRequestBody setPvlEndpointId(String pvlEndpointId) {
            this.pvlEndpointId = pvlEndpointId;
            return this;
        }
        public String getPvlEndpointId() {
            return this.pvlEndpointId;
        }

        public UpdatePrivateNetwrokRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdatePrivateNetwrokRequestBody setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdatePrivateNetwrokRequestBody setWhiteIpGroup(java.util.List<UpdatePrivateNetwrokRequestBodyWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<UpdatePrivateNetwrokRequestBodyWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

}
