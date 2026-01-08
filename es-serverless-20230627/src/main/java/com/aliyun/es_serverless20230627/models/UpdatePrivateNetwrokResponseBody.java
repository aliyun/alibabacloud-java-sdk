// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdatePrivateNetwrokResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2C5DAA30-****-5181-9B87-9D6181016197</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<UpdatePrivateNetwrokResponseBodyResult> result;

    public static UpdatePrivateNetwrokResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateNetwrokResponseBody self = new UpdatePrivateNetwrokResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateNetwrokResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePrivateNetwrokResponseBody setResult(java.util.List<UpdatePrivateNetwrokResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<UpdatePrivateNetwrokResponseBodyResult> getResult() {
        return this.result;
    }

    public static class UpdatePrivateNetwrokResponseBodyResultWhiteIpGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        public static UpdatePrivateNetwrokResponseBodyResultWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateNetwrokResponseBodyResultWhiteIpGroup self = new UpdatePrivateNetwrokResponseBodyResultWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateNetwrokResponseBodyResultWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdatePrivateNetwrokResponseBodyResultWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class UpdatePrivateNetwrokResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-**.private.cn-hangzhou.es-serverless.aliyuncs.com</p>
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
         * <p>vpc-uf6gykvwcirp886ef****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("whiteIpGroup")
        public java.util.List<UpdatePrivateNetwrokResponseBodyResultWhiteIpGroup> whiteIpGroup;

        public static UpdatePrivateNetwrokResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateNetwrokResponseBodyResult self = new UpdatePrivateNetwrokResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateNetwrokResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdatePrivateNetwrokResponseBodyResult setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public UpdatePrivateNetwrokResponseBodyResult setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdatePrivateNetwrokResponseBodyResult setPvlEndpointId(String pvlEndpointId) {
            this.pvlEndpointId = pvlEndpointId;
            return this;
        }
        public String getPvlEndpointId() {
            return this.pvlEndpointId;
        }

        public UpdatePrivateNetwrokResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdatePrivateNetwrokResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdatePrivateNetwrokResponseBodyResult setWhiteIpGroup(java.util.List<UpdatePrivateNetwrokResponseBodyResultWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<UpdatePrivateNetwrokResponseBodyResultWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

}
