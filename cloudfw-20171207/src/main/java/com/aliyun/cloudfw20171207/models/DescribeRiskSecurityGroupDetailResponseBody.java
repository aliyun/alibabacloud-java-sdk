// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskSecurityGroupDetailResponseBody extends TeaModel {
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
     * <p>33C94306-2064-5A06-9645-01419967****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskSgDetail")
    public java.util.List<DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail> riskSgDetail;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRiskSecurityGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskSecurityGroupDetailResponseBody self = new DescribeRiskSecurityGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskSecurityGroupDetailResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeRiskSecurityGroupDetailResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRiskSecurityGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskSecurityGroupDetailResponseBody setRiskSgDetail(java.util.List<DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail> riskSgDetail) {
        this.riskSgDetail = riskSgDetail;
        return this;
    }
    public java.util.List<DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail> getRiskSgDetail() {
        return this.riskSgDetail;
    }

    public DescribeRiskSecurityGroupDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-bp1gra23yai47d8e****</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <strong>example:</strong>
         * <p>tyf_test</p>
         */
        @NameInMap("EcsInstanceName")
        public String ecsInstanceName;

        /**
         * <strong>example:</strong>
         * <p>172.24.121.XXX</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <strong>example:</strong>
         * <p>47.107.141.XXX</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        public static DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo self = new DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo setEcsInstanceName(String ecsInstanceName) {
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

    }

    public static class DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("RuleStatus")
        public String ruleStatus;

        /**
         * <strong>example:</strong>
         * <p>4c1e72c9-6690-408b-9048-065f0f10****</p>
         */
        @NameInMap("RuleUuid")
        public String ruleUuid;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo self = new DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo setRuleUuid(String ruleUuid) {
            this.ruleUuid = ruleUuid;
            return this;
        }
        public String getRuleUuid() {
            return this.ruleUuid;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EcsCount")
        public Integer ecsCount;

        @NameInMap("EcsInfo")
        public java.util.List<DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo> ecsInfo;

        /**
         * <strong>example:</strong>
         * <p>sg-2vc0p803vgxumn6r****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>test-instance-name</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("RuleInfo")
        public java.util.List<DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo> ruleInfo;

        /**
         * <strong>example:</strong>
         * <p>vpc-8vbuzirdl3w1r7exw****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail self = new DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail setEcsInfo(java.util.List<DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo> ecsInfo) {
            this.ecsInfo = ecsInfo;
            return this;
        }
        public java.util.List<DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailEcsInfo> getEcsInfo() {
            return this.ecsInfo;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail setRuleInfo(java.util.List<DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo> ruleInfo) {
            this.ruleInfo = ruleInfo;
            return this;
        }
        public java.util.List<DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetailRuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

        public DescribeRiskSecurityGroupDetailResponseBodyRiskSgDetail setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
