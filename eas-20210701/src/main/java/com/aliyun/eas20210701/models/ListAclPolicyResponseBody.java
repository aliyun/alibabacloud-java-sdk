// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListAclPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("InternetAclPolicyList")
    public java.util.List<ListAclPolicyResponseBodyInternetAclPolicyList> internetAclPolicyList;

    @NameInMap("IntranetVpcAclPolicyList")
    public java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyList> intranetVpcAclPolicyList;

    /**
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

    public static class ListAclPolicyResponseBodyInternetAclPolicyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>10.23.XX.XX/32</p>
         */
        @NameInMap("Entry")
        public String entry;

        public static ListAclPolicyResponseBodyInternetAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAclPolicyResponseBodyInternetAclPolicyList self = new ListAclPolicyResponseBodyInternetAclPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAclPolicyResponseBodyInternetAclPolicyList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListAclPolicyResponseBodyInternetAclPolicyList setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

    public static class ListAclPolicyResponseBodyIntranetVpcAclPolicyListIntranetAclPolicyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Test Entry</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("Entry")
        public String entry;

        public static ListAclPolicyResponseBodyIntranetVpcAclPolicyListIntranetAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAclPolicyResponseBodyIntranetVpcAclPolicyListIntranetAclPolicyList self = new ListAclPolicyResponseBodyIntranetVpcAclPolicyListIntranetAclPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAclPolicyResponseBodyIntranetVpcAclPolicyListIntranetAclPolicyList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListAclPolicyResponseBodyIntranetVpcAclPolicyListIntranetAclPolicyList setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

    public static class ListAclPolicyResponseBodyIntranetVpcAclPolicyList extends TeaModel {
        @NameInMap("IntranetAclPolicyList")
        public java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyListIntranetAclPolicyList> intranetAclPolicyList;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf66uio7md****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListAclPolicyResponseBodyIntranetVpcAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAclPolicyResponseBodyIntranetVpcAclPolicyList self = new ListAclPolicyResponseBodyIntranetVpcAclPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAclPolicyResponseBodyIntranetVpcAclPolicyList setIntranetAclPolicyList(java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyListIntranetAclPolicyList> intranetAclPolicyList) {
            this.intranetAclPolicyList = intranetAclPolicyList;
            return this;
        }
        public java.util.List<ListAclPolicyResponseBodyIntranetVpcAclPolicyListIntranetAclPolicyList> getIntranetAclPolicyList() {
            return this.intranetAclPolicyList;
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
