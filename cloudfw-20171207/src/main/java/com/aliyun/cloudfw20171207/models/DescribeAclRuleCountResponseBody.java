// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclRuleCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InternetInAclCount")
    public Integer internetInAclCount;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InternetOutAclCount")
    public Integer internetOutAclCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NatInAclCount")
    public Integer natInAclCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NatOutAclCount")
    public Integer natOutAclCount;

    /**
     * <strong>example:</strong>
     * <p>27936D6C-1B7A-5A5A-B9E4-FBEBBDAA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalAclCount")
    public Integer totalAclCount;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("VpcAclCount")
    public Integer vpcAclCount;

    public static DescribeAclRuleCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclRuleCountResponseBody self = new DescribeAclRuleCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclRuleCountResponseBody setInternetInAclCount(Integer internetInAclCount) {
        this.internetInAclCount = internetInAclCount;
        return this;
    }
    public Integer getInternetInAclCount() {
        return this.internetInAclCount;
    }

    public DescribeAclRuleCountResponseBody setInternetOutAclCount(Integer internetOutAclCount) {
        this.internetOutAclCount = internetOutAclCount;
        return this;
    }
    public Integer getInternetOutAclCount() {
        return this.internetOutAclCount;
    }

    public DescribeAclRuleCountResponseBody setNatInAclCount(Integer natInAclCount) {
        this.natInAclCount = natInAclCount;
        return this;
    }
    public Integer getNatInAclCount() {
        return this.natInAclCount;
    }

    public DescribeAclRuleCountResponseBody setNatOutAclCount(Integer natOutAclCount) {
        this.natOutAclCount = natOutAclCount;
        return this;
    }
    public Integer getNatOutAclCount() {
        return this.natOutAclCount;
    }

    public DescribeAclRuleCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAclRuleCountResponseBody setTotalAclCount(Integer totalAclCount) {
        this.totalAclCount = totalAclCount;
        return this;
    }
    public Integer getTotalAclCount() {
        return this.totalAclCount;
    }

    public DescribeAclRuleCountResponseBody setVpcAclCount(Integer vpcAclCount) {
        this.vpcAclCount = vpcAclCount;
        return this;
    }
    public Integer getVpcAclCount() {
        return this.vpcAclCount;
    }

}
