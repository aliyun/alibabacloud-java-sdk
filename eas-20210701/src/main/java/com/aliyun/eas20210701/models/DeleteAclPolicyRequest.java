// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteAclPolicyRequest extends TeaModel {
    /**
     * <p>The whitelist of IP address ranges that are allowed to access the VPC. This parameter is required. If this parameter is not specified, an InvalidParameter error is returned, indicating that AclPolicyList must be set.</p>
     */
    @NameInMap("AclPolicyList")
    public java.util.List<DeleteAclPolicyRequestAclPolicyList> aclPolicyList;

    /**
     * <p>The ID of the VPC. For information about how to obtain the VPC ID, see DescribeVpcs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf66uio7md****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DeleteAclPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclPolicyRequest self = new DeleteAclPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAclPolicyRequest setAclPolicyList(java.util.List<DeleteAclPolicyRequestAclPolicyList> aclPolicyList) {
        this.aclPolicyList = aclPolicyList;
        return this;
    }
    public java.util.List<DeleteAclPolicyRequestAclPolicyList> getAclPolicyList() {
        return this.aclPolicyList;
    }

    public DeleteAclPolicyRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DeleteAclPolicyRequestAclPolicyList extends TeaModel {
        /**
         * <p>The comment for the IP address range that is allowed to access the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The IP address range that is allowed to access the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>10.23.XX.XX/32</p>
         */
        @NameInMap("Entry")
        public String entry;

        public static DeleteAclPolicyRequestAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            DeleteAclPolicyRequestAclPolicyList self = new DeleteAclPolicyRequestAclPolicyList();
            return TeaModel.build(map, self);
        }

        public DeleteAclPolicyRequestAclPolicyList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DeleteAclPolicyRequestAclPolicyList setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

}
