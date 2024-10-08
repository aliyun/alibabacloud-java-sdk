// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachToPolicyRequest extends TeaModel {
    /**
     * <p>The protected objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpPortProtocolList")
    public java.util.List<AttachToPolicyRequestIpPortProtocolList> ipPortProtocolList;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd8b4d70-e4e0-413a-b390-e71d********</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static AttachToPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachToPolicyRequest self = new AttachToPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AttachToPolicyRequest setIpPortProtocolList(java.util.List<AttachToPolicyRequestIpPortProtocolList> ipPortProtocolList) {
        this.ipPortProtocolList = ipPortProtocolList;
        return this;
    }
    public java.util.List<AttachToPolicyRequestIpPortProtocolList> getIpPortProtocolList() {
        return this.ipPortProtocolList;
    }

    public AttachToPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public static class AttachToPolicyRequestIpPortProtocolList extends TeaModel {
        /**
         * <p>The IP address of the protected object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>112.124.241.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port number of the protected object.</p>
         * <blockquote>
         * <p> This parameter is available for only port-specific mitigation policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8*</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type of the protected object. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available for only port-specific mitigation policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static AttachToPolicyRequestIpPortProtocolList build(java.util.Map<String, ?> map) throws Exception {
            AttachToPolicyRequestIpPortProtocolList self = new AttachToPolicyRequestIpPortProtocolList();
            return TeaModel.build(map, self);
        }

        public AttachToPolicyRequestIpPortProtocolList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public AttachToPolicyRequestIpPortProtocolList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AttachToPolicyRequestIpPortProtocolList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
