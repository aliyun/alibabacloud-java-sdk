// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVfwIPSConfigListResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15FCCC52-1E23-57AE-B5EF-3E00A3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The configuration list.</p>
     */
    @NameInMap("VfwIpsSwitchConfigList")
    public java.util.List<DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList> vfwIpsSwitchConfigList;

    public static DescribeVfwIPSConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVfwIPSConfigListResponseBody self = new DescribeVfwIPSConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVfwIPSConfigListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeVfwIPSConfigListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVfwIPSConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVfwIPSConfigListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVfwIPSConfigListResponseBody setVfwIpsSwitchConfigList(java.util.List<DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList> vfwIpsSwitchConfigList) {
        this.vfwIpsSwitchConfigList = vfwIpsSwitchConfigList;
        return this;
    }
    public java.util.List<DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList> getVfwIpsSwitchConfigList() {
        return this.vfwIpsSwitchConfigList;
    }

    public static class DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList extends TeaModel {
        /**
         * <p>The status of the Basic Policies switch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BasicRules")
        public Integer basicRules;

        /**
         * <p>The UID of the member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>134646920647****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The status of the virtual patches switch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PatchRules")
        public Integer patchRules;

        /**
         * <p>The rule class for Block Mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleClass")
        public Integer ruleClass;

        /**
         * <p>The defense mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunMode")
        public Integer runMode;

        /**
         * <p>The instance ID of the virtual private cloud (VPC) firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-h678sl4wv3yd5v****</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        /**
         * <p>The list of instance IDs of virtual private cloud (VPC) firewalls.</p>
         */
        @NameInMap("VpcFirewallIdList")
        public java.util.List<String> vpcFirewallIdList;

        /**
         * <p>The instance name of the virtual private cloud (VPC) firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        @NameInMap("VpcFirewallName")
        public String vpcFirewallName;

        public static DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList self = new DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList setBasicRules(Integer basicRules) {
            this.basicRules = basicRules;
            return this;
        }
        public Integer getBasicRules() {
            return this.basicRules;
        }

        public DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList setPatchRules(Integer patchRules) {
            this.patchRules = patchRules;
            return this;
        }
        public Integer getPatchRules() {
            return this.patchRules;
        }

        public DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList setRuleClass(Integer ruleClass) {
            this.ruleClass = ruleClass;
            return this;
        }
        public Integer getRuleClass() {
            return this.ruleClass;
        }

        public DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList setRunMode(Integer runMode) {
            this.runMode = runMode;
            return this;
        }
        public Integer getRunMode() {
            return this.runMode;
        }

        public DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        public DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList setVpcFirewallIdList(java.util.List<String> vpcFirewallIdList) {
            this.vpcFirewallIdList = vpcFirewallIdList;
            return this;
        }
        public java.util.List<String> getVpcFirewallIdList() {
            return this.vpcFirewallIdList;
        }

        public DescribeVfwIPSConfigListResponseBodyVfwIpsSwitchConfigList setVpcFirewallName(String vpcFirewallName) {
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }
        public String getVpcFirewallName() {
            return this.vpcFirewallName;
        }

    }

}
