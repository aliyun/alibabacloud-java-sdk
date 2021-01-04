// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadFlexAccRulesFileForParseResponseBody extends TeaModel {
    @NameInMap("FlexAccFwdRules")
    public java.util.List<UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules> flexAccFwdRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static UploadFlexAccRulesFileForParseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadFlexAccRulesFileForParseResponseBody self = new UploadFlexAccRulesFileForParseResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadFlexAccRulesFileForParseResponseBody setFlexAccFwdRules(java.util.List<UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules> flexAccFwdRules) {
        this.flexAccFwdRules = flexAccFwdRules;
        return this;
    }
    public java.util.List<UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules> getFlexAccFwdRules() {
        return this.flexAccFwdRules;
    }

    public UploadFlexAccRulesFileForParseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadFlexAccRulesFileForParseResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public UploadFlexAccRulesFileForParseResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules extends TeaModel {
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

        public static UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules build(java.util.Map<String, ?> map) throws Exception {
            UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules self = new UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules();
            return TeaModel.build(map, self);
        }

        public UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules setMasterIpList(String masterIpList) {
            this.masterIpList = masterIpList;
            return this;
        }
        public String getMasterIpList() {
            return this.masterIpList;
        }

        public UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules setSlaveIpList(String slaveIpList) {
            this.slaveIpList = slaveIpList;
            return this;
        }
        public String getSlaveIpList() {
            return this.slaveIpList;
        }

        public UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules setAccType(Integer accType) {
            this.accType = accType;
            return this;
        }
        public Integer getAccType() {
            return this.accType;
        }

        public UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

        public UploadFlexAccRulesFileForParseResponseBodyFlexAccFwdRules setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

    }

}
