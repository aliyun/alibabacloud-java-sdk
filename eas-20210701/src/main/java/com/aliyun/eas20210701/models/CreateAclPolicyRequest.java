// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateAclPolicyRequest extends TeaModel {
    /**
     * <p>The whitelisted IP CIDR blocks in the VPC that can access the private gateway.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclPolicyList")
    public java.util.List<CreateAclPolicyRequestAclPolicyList> aclPolicyList;

    /**
     * <p>The ID of the virtual private cloud (VPC). For more information about how to obtain the VPC ID, see DescribeVpcs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf66uio7md****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateAclPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAclPolicyRequest self = new CreateAclPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAclPolicyRequest setAclPolicyList(java.util.List<CreateAclPolicyRequestAclPolicyList> aclPolicyList) {
        this.aclPolicyList = aclPolicyList;
        return this;
    }
    public java.util.List<CreateAclPolicyRequestAclPolicyList> getAclPolicyList() {
        return this.aclPolicyList;
    }

    public CreateAclPolicyRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateAclPolicyRequestAclPolicyList extends TeaModel {
        /**
         * <p>The comment on the IP CIDR block in the VPC that can access the private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The IP CIDR block in the VPC that can access the private gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.23.XX.XX/32</p>
         */
        @NameInMap("Entry")
        public String entry;

        public static CreateAclPolicyRequestAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            CreateAclPolicyRequestAclPolicyList self = new CreateAclPolicyRequestAclPolicyList();
            return TeaModel.build(map, self);
        }

        public CreateAclPolicyRequestAclPolicyList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateAclPolicyRequestAclPolicyList setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

}
