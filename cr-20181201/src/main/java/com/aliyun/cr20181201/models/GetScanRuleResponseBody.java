// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetScanRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <strong>example:</strong>
     * <p>C87993B5-7D61-5CAC-8D64-1AC732DD69FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScanRule")
    public GetScanRuleResponseBodyScanRule scanRule;

    public static GetScanRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScanRuleResponseBody self = new GetScanRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScanRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScanRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetScanRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScanRuleResponseBody setScanRule(GetScanRuleResponseBodyScanRule scanRule) {
        this.scanRule = scanRule;
        return this;
    }
    public GetScanRuleResponseBodyScanRule getScanRule() {
        return this.scanRule;
    }

    public static class GetScanRuleResponseBodyScanRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2018-03-15T17:08Z</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>cri-szw6f6bhrky0c8jk</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        @NameInMap("RepoNames")
        public java.util.List<String> repoNames;

        /**
         * <strong>example:</strong>
         * <p>.*</p>
         */
        @NameInMap("RepoTagFilterPattern")
        public String repoTagFilterPattern;

        /**
         * <strong>example:</strong>
         * <p>protection</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>crscnr-aemytkwad2h7fyhb</p>
         */
        @NameInMap("ScanRuleId")
        public String scanRuleId;

        @NameInMap("ScanScope")
        public String scanScope;

        /**
         * <strong>example:</strong>
         * <p>SBOM</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <strong>example:</strong>
         * <p>2025-08-28T20:07:33.164</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetScanRuleResponseBodyScanRule build(java.util.Map<String, ?> map) throws Exception {
            GetScanRuleResponseBodyScanRule self = new GetScanRuleResponseBodyScanRule();
            return TeaModel.build(map, self);
        }

        public GetScanRuleResponseBodyScanRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetScanRuleResponseBodyScanRule setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetScanRuleResponseBodyScanRule setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        public GetScanRuleResponseBodyScanRule setRepoNames(java.util.List<String> repoNames) {
            this.repoNames = repoNames;
            return this;
        }
        public java.util.List<String> getRepoNames() {
            return this.repoNames;
        }

        public GetScanRuleResponseBodyScanRule setRepoTagFilterPattern(String repoTagFilterPattern) {
            this.repoTagFilterPattern = repoTagFilterPattern;
            return this;
        }
        public String getRepoTagFilterPattern() {
            return this.repoTagFilterPattern;
        }

        public GetScanRuleResponseBodyScanRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetScanRuleResponseBodyScanRule setScanRuleId(String scanRuleId) {
            this.scanRuleId = scanRuleId;
            return this;
        }
        public String getScanRuleId() {
            return this.scanRuleId;
        }

        public GetScanRuleResponseBodyScanRule setScanScope(String scanScope) {
            this.scanScope = scanScope;
            return this;
        }
        public String getScanScope() {
            return this.scanScope;
        }

        public GetScanRuleResponseBodyScanRule setScanType(String scanType) {
            this.scanType = scanType;
            return this;
        }
        public String getScanType() {
            return this.scanType;
        }

        public GetScanRuleResponseBodyScanRule setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetScanRuleResponseBodyScanRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
