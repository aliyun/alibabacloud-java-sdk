// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteAclPolicyRequest extends TeaModel {
    @NameInMap("AclPolicyList")
    public java.util.List<DeleteAclPolicyRequestAclPolicyList> aclPolicyList;

    /**
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
