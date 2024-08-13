// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentRequest extends TeaModel {
    /**
     * <p>The protected objects.</p>
     */
    @NameInMap("IpPortProtocolList")
    public java.util.List<ListPolicyAttachmentRequestIpPortProtocolList> ipPortProtocolList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>f38f6520-92b7-451e-b520-9ab3********</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: the default mitigation policies.</li>
     * <li><strong>l3</strong>: IP-specific mitigation policies.</li>
     * <li><strong>l4</strong>: port-specific mitigation policies.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>l3</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

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
         * <p>The protocol type of the protected object. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
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

        public ListPolicyAttachmentRequestIpPortProtocolList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
