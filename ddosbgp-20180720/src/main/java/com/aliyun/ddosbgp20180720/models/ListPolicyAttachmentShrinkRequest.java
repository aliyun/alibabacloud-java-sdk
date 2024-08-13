// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentShrinkRequest extends TeaModel {
    /**
     * <p>The protected objects.</p>
     */
    @NameInMap("IpPortProtocolList")
    public String ipPortProtocolListShrink;

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
