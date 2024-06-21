// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentShrinkRequest extends TeaModel {
    @NameInMap("IpPortProtocolList")
    public String ipPortProtocolListShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>f38f6520-92b7-451e-b520-9ab3********</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <strong>example:</strong>
     * <p>l3</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static ListPolicyAttachmentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyAttachmentShrinkRequest self = new ListPolicyAttachmentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyAttachmentShrinkRequest setIpPortProtocolListShrink(String ipPortProtocolListShrink) {
        this.ipPortProtocolListShrink = ipPortProtocolListShrink;
        return this;
    }
    public String getIpPortProtocolListShrink() {
        return this.ipPortProtocolListShrink;
    }

    public ListPolicyAttachmentShrinkRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListPolicyAttachmentShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPolicyAttachmentShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListPolicyAttachmentShrinkRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
