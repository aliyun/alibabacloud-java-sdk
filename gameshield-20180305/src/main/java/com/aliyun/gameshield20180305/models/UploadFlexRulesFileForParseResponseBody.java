// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadFlexRulesFileForParseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("FlexFwdRules")
    public java.util.List<UploadFlexRulesFileForParseResponseBodyFlexFwdRules> flexFwdRules;

    public static UploadFlexRulesFileForParseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadFlexRulesFileForParseResponseBody self = new UploadFlexRulesFileForParseResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadFlexRulesFileForParseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadFlexRulesFileForParseResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public UploadFlexRulesFileForParseResponseBody setFlexFwdRules(java.util.List<UploadFlexRulesFileForParseResponseBodyFlexFwdRules> flexFwdRules) {
        this.flexFwdRules = flexFwdRules;
        return this;
    }
    public java.util.List<UploadFlexRulesFileForParseResponseBodyFlexFwdRules> getFlexFwdRules() {
        return this.flexFwdRules;
    }

    public static class UploadFlexRulesFileForParseResponseBodyFlexFwdRules extends TeaModel {
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

        public static UploadFlexRulesFileForParseResponseBodyFlexFwdRules build(java.util.Map<String, ?> map) throws Exception {
            UploadFlexRulesFileForParseResponseBodyFlexFwdRules self = new UploadFlexRulesFileForParseResponseBodyFlexFwdRules();
            return TeaModel.build(map, self);
        }

        public UploadFlexRulesFileForParseResponseBodyFlexFwdRules setMasterIpList(String masterIpList) {
            this.masterIpList = masterIpList;
            return this;
        }
        public String getMasterIpList() {
            return this.masterIpList;
        }

        public UploadFlexRulesFileForParseResponseBodyFlexFwdRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public UploadFlexRulesFileForParseResponseBodyFlexFwdRules setSlaveIpList(String slaveIpList) {
            this.slaveIpList = slaveIpList;
            return this;
        }
        public String getSlaveIpList() {
            return this.slaveIpList;
        }

        public UploadFlexRulesFileForParseResponseBodyFlexFwdRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UploadFlexRulesFileForParseResponseBodyFlexFwdRules setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

    }

}
