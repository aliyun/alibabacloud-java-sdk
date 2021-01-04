// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class SearchFlexFwdRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("FlexFwdRules")
    public java.util.List<SearchFlexFwdRulesResponseBodyFlexFwdRules> flexFwdRules;

    public static SearchFlexFwdRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFlexFwdRulesResponseBody self = new SearchFlexFwdRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFlexFwdRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchFlexFwdRulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public SearchFlexFwdRulesResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public SearchFlexFwdRulesResponseBody setFlexFwdRules(java.util.List<SearchFlexFwdRulesResponseBodyFlexFwdRules> flexFwdRules) {
        this.flexFwdRules = flexFwdRules;
        return this;
    }
    public java.util.List<SearchFlexFwdRulesResponseBodyFlexFwdRules> getFlexFwdRules() {
        return this.flexFwdRules;
    }

    public static class SearchFlexFwdRulesResponseBodyFlexFwdRules extends TeaModel {
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

        public static SearchFlexFwdRulesResponseBodyFlexFwdRules build(java.util.Map<String, ?> map) throws Exception {
            SearchFlexFwdRulesResponseBodyFlexFwdRules self = new SearchFlexFwdRulesResponseBodyFlexFwdRules();
            return TeaModel.build(map, self);
        }

        public SearchFlexFwdRulesResponseBodyFlexFwdRules setMasterIpList(String masterIpList) {
            this.masterIpList = masterIpList;
            return this;
        }
        public String getMasterIpList() {
            return this.masterIpList;
        }

        public SearchFlexFwdRulesResponseBodyFlexFwdRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SearchFlexFwdRulesResponseBodyFlexFwdRules setSlaveIpList(String slaveIpList) {
            this.slaveIpList = slaveIpList;
            return this;
        }
        public String getSlaveIpList() {
            return this.slaveIpList;
        }

        public SearchFlexFwdRulesResponseBodyFlexFwdRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public SearchFlexFwdRulesResponseBodyFlexFwdRules setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

    }

}
