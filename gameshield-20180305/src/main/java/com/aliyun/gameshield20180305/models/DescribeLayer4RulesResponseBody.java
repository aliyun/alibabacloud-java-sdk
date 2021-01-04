// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExtInfo")
    public DescribeLayer4RulesResponseBodyExtInfo extInfo;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("L4RuleList")
    public java.util.List<DescribeLayer4RulesResponseBodyL4RuleList> l4RuleList;

    public static DescribeLayer4RulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulesResponseBody self = new DescribeLayer4RulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLayer4RulesResponseBody setExtInfo(DescribeLayer4RulesResponseBodyExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public DescribeLayer4RulesResponseBodyExtInfo getExtInfo() {
        return this.extInfo;
    }

    public DescribeLayer4RulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeLayer4RulesResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeLayer4RulesResponseBody setL4RuleList(java.util.List<DescribeLayer4RulesResponseBodyL4RuleList> l4RuleList) {
        this.l4RuleList = l4RuleList;
        return this;
    }
    public java.util.List<DescribeLayer4RulesResponseBodyL4RuleList> getL4RuleList() {
        return this.l4RuleList;
    }

    public static class DescribeLayer4RulesResponseBodyExtInfo extends TeaModel {
        @NameInMap("UseCc")
        public Integer useCc;

        @NameInMap("NgRouteEnable")
        public Integer ngRouteEnable;

        public static DescribeLayer4RulesResponseBodyExtInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RulesResponseBodyExtInfo self = new DescribeLayer4RulesResponseBodyExtInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RulesResponseBodyExtInfo setUseCc(Integer useCc) {
            this.useCc = useCc;
            return this;
        }
        public Integer getUseCc() {
            return this.useCc;
        }

        public DescribeLayer4RulesResponseBodyExtInfo setNgRouteEnable(Integer ngRouteEnable) {
            this.ngRouteEnable = ngRouteEnable;
            return this;
        }
        public Integer getNgRouteEnable() {
            return this.ngRouteEnable;
        }

    }

    public static class DescribeLayer4RulesResponseBodyL4RuleList extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("BackPort")
        public Integer backPort;

        @NameInMap("BizId")
        public Long bizId;

        @NameInMap("Rservers")
        public java.util.List<String> rservers;

        @NameInMap("LvsPolicy")
        public String lvsPolicy;

        @NameInMap("FrontPort")
        public Integer frontPort;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeLayer4RulesResponseBodyL4RuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RulesResponseBodyL4RuleList self = new DescribeLayer4RulesResponseBodyL4RuleList();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RulesResponseBodyL4RuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLayer4RulesResponseBodyL4RuleList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeLayer4RulesResponseBodyL4RuleList setBackPort(Integer backPort) {
            this.backPort = backPort;
            return this;
        }
        public Integer getBackPort() {
            return this.backPort;
        }

        public DescribeLayer4RulesResponseBodyL4RuleList setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public DescribeLayer4RulesResponseBodyL4RuleList setRservers(java.util.List<String> rservers) {
            this.rservers = rservers;
            return this;
        }
        public java.util.List<String> getRservers() {
            return this.rservers;
        }

        public DescribeLayer4RulesResponseBodyL4RuleList setLvsPolicy(String lvsPolicy) {
            this.lvsPolicy = lvsPolicy;
            return this;
        }
        public String getLvsPolicy() {
            return this.lvsPolicy;
        }

        public DescribeLayer4RulesResponseBodyL4RuleList setFrontPort(Integer frontPort) {
            this.frontPort = frontPort;
            return this;
        }
        public Integer getFrontPort() {
            return this.frontPort;
        }

        public DescribeLayer4RulesResponseBodyL4RuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
