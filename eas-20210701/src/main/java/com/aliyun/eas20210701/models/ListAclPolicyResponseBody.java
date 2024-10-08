// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListAclPolicyResponseBody extends TeaModel {
    /**
     * <p>The private gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The access control policies of the private gateway over the Internet.</p>
     */
    @NameInMap("InternetAclPolicyList")
    public java.util.List<ListAclPolicyResponseBodyInternetAclPolicyList> internetAclPolicyList;

    /**
     * <p>The access control policies of the private gateway over the internal network.</p>
     */
    @NameInMap("IntranetVpcAclPolicyList")
    public java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyList> intranetVpcAclPolicyList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAclPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAclPolicyResponseBody self = new ListAclPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAclPolicyResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListAclPolicyResponseBody setInternetAclPolicyList(java.util.List<ListAclPolicyResponseBodyInternetAclPolicyList> internetAclPolicyList) {
        this.internetAclPolicyList = internetAclPolicyList;
        return this;
    }
    public java.util.List<ListAclPolicyResponseBodyInternetAclPolicyList> getInternetAclPolicyList() {
        return this.internetAclPolicyList;
    }

    public ListAclPolicyResponseBody setIntranetVpcAclPolicyList(java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyList> intranetVpcAclPolicyList) {
        this.intranetVpcAclPolicyList = intranetVpcAclPolicyList;
        return this;
    }
    public java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyList> getIntranetVpcAclPolicyList() {
        return this.intranetVpcAclPolicyList;
    }

    public ListAclPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAclPolicyResponseBodyInternetAclPolicyListAclPolicyList extends TeaModel {
        /**
         * <p>The comment on the IP CIDR block in the VPC that can access the private gateway over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The IP CIDR block in the VPC that can access the private gateway over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>10.23.XX.XX/32</p>
         */
        @NameInMap("Entry")
        public String entry;

        public static ListAclPolicyResponseBodyInternetAclPolicyListAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAclPolicyResponseBodyInternetAclPolicyListAclPolicyList self = new ListAclPolicyResponseBodyInternetAclPolicyListAclPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAclPolicyResponseBodyInternetAclPolicyListAclPolicyList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListAclPolicyResponseBodyInternetAclPolicyListAclPolicyList setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

    public static class ListAclPolicyResponseBodyInternetAclPolicyList extends TeaModel {
        /**
         * <p>The whitelisted IP CIDR blocks in the VPC that can access the private gateway over the Internet.</p>
         */
        @NameInMap("AclPolicyList")
        public java.util.List<ListAclPolicyResponseBodyInternetAclPolicyListAclPolicyList> aclPolicyList;

        public static ListAclPolicyResponseBodyInternetAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAclPolicyResponseBodyInternetAclPolicyList self = new ListAclPolicyResponseBodyInternetAclPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAclPolicyResponseBodyInternetAclPolicyList setAclPolicyList(java.util.List<ListAclPolicyResponseBodyInternetAclPolicyListAclPolicyList> aclPolicyList) {
            this.aclPolicyList = aclPolicyList;
            return this;
        }
        public java.util.List<ListAclPolicyResponseBodyInternetAclPolicyListAclPolicyList> getAclPolicyList() {
            return this.aclPolicyList;
        }

    }

    public static class ListAclPolicyResponseBodyIntranetVpcAclPolicyListAclPolicyList extends TeaModel {
        /**
         * <p>The comment on the IP CIDR block in the VPC that can access the private gateway over the internal network.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Entry</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The IP CIDR block in the VPC that can access the private gateway over the internal network.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("Entry")
        public String entry;

        public static ListAclPolicyResponseBodyIntranetVpcAclPolicyListAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAclPolicyResponseBodyIntranetVpcAclPolicyListAclPolicyList self = new ListAclPolicyResponseBodyIntranetVpcAclPolicyListAclPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAclPolicyResponseBodyIntranetVpcAclPolicyListAclPolicyList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListAclPolicyResponseBodyIntranetVpcAclPolicyListAclPolicyList setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

    public static class ListAclPolicyResponseBodyIntranetVpcAclPolicyList extends TeaModel {
        /**
         * <p>The whitelisted IP CIDR blocks in the VPC that can access the private gateway over the internal network.</p>
         */
        @NameInMap("AclPolicyList")
        public java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyListAclPolicyList> aclPolicyList;

        /**
         * <p>The VPC ID. For more information about how to obtain the VPC ID, see DescribeVpcs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf66uio7md****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListAclPolicyResponseBodyIntranetVpcAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAclPolicyResponseBodyIntranetVpcAclPolicyList self = new ListAclPolicyResponseBodyIntranetVpcAclPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAclPolicyResponseBodyIntranetVpcAclPolicyList setAclPolicyList(java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyListAclPolicyList> aclPolicyList) {
            this.aclPolicyList = aclPolicyList;
            return this;
        }
        public java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyListAclPolicyList> getAclPolicyList() {
            return this.aclPolicyList;
        }

        public ListAclPolicyResponseBodyIntranetVpcAclPolicyList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
