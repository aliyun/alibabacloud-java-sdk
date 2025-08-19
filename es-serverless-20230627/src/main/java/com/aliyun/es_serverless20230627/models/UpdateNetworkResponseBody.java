// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateNetworkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2C5DAA30-****-5181-9B87-9D6181016197</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<UpdateNetworkResponseBodyResult> result;

    public static UpdateNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkResponseBody self = new UpdateNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNetworkResponseBody setResult(java.util.List<UpdateNetworkResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<UpdateNetworkResponseBodyResult> getResult() {
        return this.result;
    }

    public static class UpdateNetworkResponseBodyResultWhiteIpGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        public static UpdateNetworkResponseBodyResultWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkResponseBodyResultWhiteIpGroup self = new UpdateNetworkResponseBodyResultWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public UpdateNetworkResponseBodyResultWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateNetworkResponseBodyResultWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class UpdateNetworkResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-123.serverless.cn-hangzhou.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public String enabled;

        /**
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>PUBLIC_ES</p>
         */
        @NameInMap("type")
        public String type;

        @NameInMap("whiteIpGroup")
        public java.util.List<UpdateNetworkResponseBodyResultWhiteIpGroup> whiteIpGroup;

        public static UpdateNetworkResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkResponseBodyResult self = new UpdateNetworkResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateNetworkResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateNetworkResponseBodyResult setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public UpdateNetworkResponseBodyResult setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateNetworkResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateNetworkResponseBodyResult setWhiteIpGroup(java.util.List<UpdateNetworkResponseBodyResultWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<UpdateNetworkResponseBodyResultWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

}
