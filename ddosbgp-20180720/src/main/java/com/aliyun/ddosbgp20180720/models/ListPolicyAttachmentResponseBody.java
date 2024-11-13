// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentResponseBody extends TeaModel {
    /**
     * <p>The records of attachments to the mitigation policy.</p>
     */
    @NameInMap("AttachmentList")
    public java.util.List<ListPolicyAttachmentResponseBodyAttachmentList> attachmentList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4B379C2-9319-4C6B-B579-FE36831B09F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of attachments to the mitigation policy.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListPolicyAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyAttachmentResponseBody self = new ListPolicyAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyAttachmentResponseBody setAttachmentList(java.util.List<ListPolicyAttachmentResponseBodyAttachmentList> attachmentList) {
        this.attachmentList = attachmentList;
        return this;
    }
    public java.util.List<ListPolicyAttachmentResponseBodyAttachmentList> getAttachmentList() {
        return this.attachmentList;
    }

    public ListPolicyAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicyAttachmentResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListPolicyAttachmentResponseBodyAttachmentList extends TeaModel {
        /**
         * <p>The IP address of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>147.139.183.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The UID of the member to which the IP address of the protected object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>177699790631****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1b43f44e-65e1-411a-b0c0-d6c1********</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test**</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PolicyRemark")
        public String policyRemark;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>l3</strong>: IP-specific mitigation policies.</li>
         * <li><strong>l4</strong>: port-specific mitigation policies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>l3</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

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
         * <p>udp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The region to which the IP address of the protected object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        public static ListPolicyAttachmentResponseBodyAttachmentList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyAttachmentResponseBodyAttachmentList self = new ListPolicyAttachmentResponseBodyAttachmentList();
            return TeaModel.build(map, self);
        }

        public ListPolicyAttachmentResponseBodyAttachmentList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListPolicyAttachmentResponseBodyAttachmentList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public ListPolicyAttachmentResponseBodyAttachmentList setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListPolicyAttachmentResponseBodyAttachmentList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPolicyAttachmentResponseBodyAttachmentList setPolicyRemark(String policyRemark) {
            this.policyRemark = policyRemark;
            return this;
        }
        public String getPolicyRemark() {
            return this.policyRemark;
        }

        public ListPolicyAttachmentResponseBodyAttachmentList setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListPolicyAttachmentResponseBodyAttachmentList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListPolicyAttachmentResponseBodyAttachmentList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListPolicyAttachmentResponseBodyAttachmentList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
