// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentRequest extends TeaModel {
    /**
     * <p>The list of protected objects.</p>
     */
    @NameInMap("IpPortProtocolList")
    public java.util.List<ListPolicyAttachmentRequestIpPortProtocolList> ipPortProtocolList;

    /**
     * <p>The page number of the current page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of rows per page in a paging query. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f38f6520-92b7-451e-b520-9ab3********</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: default mitigation policy.</li>
     * <li><strong>l3</strong>: IP-specific mitigation policy.</li>
     * <li><strong>l4</strong>: port-specific mitigation policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>l3</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The version of the port-specific mitigation policy. Valid values:</p>
     * <ul>
     * <li><strong>Not specified</strong>: queries the policy associations that attach to the default surf DPI engine.</li>
     * <li><strong>2</strong>: queries the policy associations that attach to the new stream DPI engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PortVersion")
    public String portVersion;

    public static ListPolicyAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyAttachmentRequest self = new ListPolicyAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyAttachmentRequest setIpPortProtocolList(java.util.List<ListPolicyAttachmentRequestIpPortProtocolList> ipPortProtocolList) {
        this.ipPortProtocolList = ipPortProtocolList;
        return this;
    }
    public java.util.List<ListPolicyAttachmentRequestIpPortProtocolList> getIpPortProtocolList() {
        return this.ipPortProtocolList;
    }

    public ListPolicyAttachmentRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListPolicyAttachmentRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPolicyAttachmentRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListPolicyAttachmentRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListPolicyAttachmentRequest setPortVersion(String portVersion) {
        this.portVersion = portVersion;
        return this;
    }
    public String getPortVersion() {
        return this.portVersion;
    }

    public static class ListPolicyAttachmentRequestIpPortProtocolList extends TeaModel {
        /**
         * <p>The IP address of the protected object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>47.118.172.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port number of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>8*</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The port number range of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>8*-9*</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The protocol type of the protected object. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: Transmission Control Protocol.</li>
         * <li><strong>udp</strong>: User Datagram Protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static ListPolicyAttachmentRequestIpPortProtocolList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyAttachmentRequestIpPortProtocolList self = new ListPolicyAttachmentRequestIpPortProtocolList();
            return TeaModel.build(map, self);
        }

        public ListPolicyAttachmentRequestIpPortProtocolList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListPolicyAttachmentRequestIpPortProtocolList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListPolicyAttachmentRequestIpPortProtocolList setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ListPolicyAttachmentRequestIpPortProtocolList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
