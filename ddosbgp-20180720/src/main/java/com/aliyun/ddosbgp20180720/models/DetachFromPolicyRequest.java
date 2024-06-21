// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DetachFromPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpPortProtocolList")
    public java.util.List<DetachFromPolicyRequestIpPortProtocolList> ipPortProtocolList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>l3</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static DetachFromPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachFromPolicyRequest self = new DetachFromPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DetachFromPolicyRequest setIpPortProtocolList(java.util.List<DetachFromPolicyRequestIpPortProtocolList> ipPortProtocolList) {
        this.ipPortProtocolList = ipPortProtocolList;
        return this;
    }
    public java.util.List<DetachFromPolicyRequestIpPortProtocolList> getIpPortProtocolList() {
        return this.ipPortProtocolList;
    }

    public DetachFromPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public static class DetachFromPolicyRequestIpPortProtocolList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>47.118.172.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>8*</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DetachFromPolicyRequestIpPortProtocolList build(java.util.Map<String, ?> map) throws Exception {
            DetachFromPolicyRequestIpPortProtocolList self = new DetachFromPolicyRequestIpPortProtocolList();
            return TeaModel.build(map, self);
        }

        public DetachFromPolicyRequestIpPortProtocolList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DetachFromPolicyRequestIpPortProtocolList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DetachFromPolicyRequestIpPortProtocolList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
