// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateNetworkRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<UpdateNetworkRequestBody> body;

    public static UpdateNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkRequest self = new UpdateNetworkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkRequest setBody(java.util.List<UpdateNetworkRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<UpdateNetworkRequestBody> getBody() {
        return this.body;
    }

    public static class UpdateNetworkRequestBodyWhiteIpGroup extends TeaModel {
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

        public static UpdateNetworkRequestBodyWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkRequestBodyWhiteIpGroup self = new UpdateNetworkRequestBodyWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public UpdateNetworkRequestBodyWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateNetworkRequestBodyWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public UpdateNetworkRequestBodyWhiteIpGroup setModifyMode(String modifyMode) {
            this.modifyMode = modifyMode;
            return this;
        }
        public String getModifyMode() {
            return this.modifyMode;
        }

    }

    public static class UpdateNetworkRequestBody extends TeaModel {
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
         * <p>PUBLIC_ES</p>
         */
        @NameInMap("type")
        public String type;

        @NameInMap("whiteIpGroup")
        public java.util.List<UpdateNetworkRequestBodyWhiteIpGroup> whiteIpGroup;

        public static UpdateNetworkRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkRequestBody self = new UpdateNetworkRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateNetworkRequestBody setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateNetworkRequestBody setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateNetworkRequestBody setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateNetworkRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateNetworkRequestBody setWhiteIpGroup(java.util.List<UpdateNetworkRequestBodyWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<UpdateNetworkRequestBodyWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

}
