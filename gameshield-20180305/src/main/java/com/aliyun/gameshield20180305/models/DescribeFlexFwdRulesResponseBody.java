// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexFwdRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("FlexFwdRules")
    public java.util.List<DescribeFlexFwdRulesResponseBodyFlexFwdRules> flexFwdRules;

    public static DescribeFlexFwdRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexFwdRulesResponseBody self = new DescribeFlexFwdRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlexFwdRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlexFwdRulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeFlexFwdRulesResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeFlexFwdRulesResponseBody setFlexFwdRules(java.util.List<DescribeFlexFwdRulesResponseBodyFlexFwdRules> flexFwdRules) {
        this.flexFwdRules = flexFwdRules;
        return this;
    }
    public java.util.List<DescribeFlexFwdRulesResponseBodyFlexFwdRules> getFlexFwdRules() {
        return this.flexFwdRules;
    }

    public static class DescribeFlexFwdRulesResponseBodyFlexFwdRules extends TeaModel {
        @NameInMap("MasterIpList")
        public String masterIpList;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SlaveIpList")
        public String slaveIpList;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Identity")
        public String identity;

        public static DescribeFlexFwdRulesResponseBodyFlexFwdRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexFwdRulesResponseBodyFlexFwdRules self = new DescribeFlexFwdRulesResponseBodyFlexFwdRules();
            return TeaModel.build(map, self);
        }

        public DescribeFlexFwdRulesResponseBodyFlexFwdRules setMasterIpList(String masterIpList) {
            this.masterIpList = masterIpList;
            return this;
        }
        public String getMasterIpList() {
            return this.masterIpList;
        }

        public DescribeFlexFwdRulesResponseBodyFlexFwdRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeFlexFwdRulesResponseBodyFlexFwdRules setSlaveIpList(String slaveIpList) {
            this.slaveIpList = slaveIpList;
            return this;
        }
        public String getSlaveIpList() {
            return this.slaveIpList;
        }

        public DescribeFlexFwdRulesResponseBodyFlexFwdRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeFlexFwdRulesResponseBodyFlexFwdRules setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

    }

}
