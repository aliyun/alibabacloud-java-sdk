// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVfwIPSConfigListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>15FCCC52-1E23-57AE-B5EF-3E00A3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BasicRules")
        public Integer basicRules;

        /**
         * <strong>example:</strong>
         * <p>134646920647****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PatchRules")
        public Integer patchRules;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleClass")
        public Integer ruleClass;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunMode")
        public Integer runMode;

        /**
         * <strong>example:</strong>
         * <p>cen-h678sl4wv3yd5v****</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        @NameInMap("VpcFirewallIdList")
        public java.util.List<String> vpcFirewallIdList;

        /**
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
