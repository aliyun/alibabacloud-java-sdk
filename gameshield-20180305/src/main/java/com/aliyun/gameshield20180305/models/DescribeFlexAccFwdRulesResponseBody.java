// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexAccFwdRulesResponseBody extends TeaModel {
    @NameInMap("FlexAccFwdRules")
    public java.util.List<DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules> flexAccFwdRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeFlexAccFwdRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexAccFwdRulesResponseBody self = new DescribeFlexAccFwdRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlexAccFwdRulesResponseBody setFlexAccFwdRules(java.util.List<DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules> flexAccFwdRules) {
        this.flexAccFwdRules = flexAccFwdRules;
        return this;
    }
    public java.util.List<DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules> getFlexAccFwdRules() {
        return this.flexAccFwdRules;
    }

    public DescribeFlexAccFwdRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlexAccFwdRulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeFlexAccFwdRulesResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules extends TeaModel {
        @NameInMap("MasterIpList")
        public String masterIpList;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SlaveIpList")
        public String slaveIpList;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("AccType")
        public Integer accType;

        @NameInMap("IpList")
        public String ipList;

        @NameInMap("DomainList")
        public String domainList;

        public static DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules self = new DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules();
            return TeaModel.build(map, self);
        }

        public DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules setMasterIpList(String masterIpList) {
            this.masterIpList = masterIpList;
            return this;
        }
        public String getMasterIpList() {
            return this.masterIpList;
        }

        public DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules setSlaveIpList(String slaveIpList) {
            this.slaveIpList = slaveIpList;
            return this;
        }
        public String getSlaveIpList() {
            return this.slaveIpList;
        }

        public DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules setAccType(Integer accType) {
            this.accType = accType;
            return this;
        }
        public Integer getAccType() {
            return this.accType;
        }

        public DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

        public DescribeFlexAccFwdRulesResponseBodyFlexAccFwdRules setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

    }

}
