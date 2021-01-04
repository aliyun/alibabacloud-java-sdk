// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadL4RulesFileForParseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("L4RuleList")
    public java.util.List<UploadL4RulesFileForParseResponseBodyL4RuleList> l4RuleList;

    public static UploadL4RulesFileForParseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadL4RulesFileForParseResponseBody self = new UploadL4RulesFileForParseResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadL4RulesFileForParseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadL4RulesFileForParseResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public UploadL4RulesFileForParseResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public UploadL4RulesFileForParseResponseBody setL4RuleList(java.util.List<UploadL4RulesFileForParseResponseBodyL4RuleList> l4RuleList) {
        this.l4RuleList = l4RuleList;
        return this;
    }
    public java.util.List<UploadL4RulesFileForParseResponseBodyL4RuleList> getL4RuleList() {
        return this.l4RuleList;
    }

    public static class UploadL4RulesFileForParseResponseBodyL4RuleList extends TeaModel {
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

        public static UploadL4RulesFileForParseResponseBodyL4RuleList build(java.util.Map<String, ?> map) throws Exception {
            UploadL4RulesFileForParseResponseBodyL4RuleList self = new UploadL4RulesFileForParseResponseBodyL4RuleList();
            return TeaModel.build(map, self);
        }

        public UploadL4RulesFileForParseResponseBodyL4RuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UploadL4RulesFileForParseResponseBodyL4RuleList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public UploadL4RulesFileForParseResponseBodyL4RuleList setBackPort(Integer backPort) {
            this.backPort = backPort;
            return this;
        }
        public Integer getBackPort() {
            return this.backPort;
        }

        public UploadL4RulesFileForParseResponseBodyL4RuleList setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public UploadL4RulesFileForParseResponseBodyL4RuleList setRservers(java.util.List<String> rservers) {
            this.rservers = rservers;
            return this;
        }
        public java.util.List<String> getRservers() {
            return this.rservers;
        }

        public UploadL4RulesFileForParseResponseBodyL4RuleList setLvsPolicy(String lvsPolicy) {
            this.lvsPolicy = lvsPolicy;
            return this;
        }
        public String getLvsPolicy() {
            return this.lvsPolicy;
        }

        public UploadL4RulesFileForParseResponseBodyL4RuleList setFrontPort(Integer frontPort) {
            this.frontPort = frontPort;
            return this;
        }
        public Integer getFrontPort() {
            return this.frontPort;
        }

        public UploadL4RulesFileForParseResponseBodyL4RuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
