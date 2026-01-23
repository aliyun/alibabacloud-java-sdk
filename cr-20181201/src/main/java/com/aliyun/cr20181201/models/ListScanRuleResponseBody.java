// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request Id</p>
     * 
     * <strong>example:</strong>
     * <p>2CB62B5E-605B-5A23-9110-728B8207A25C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of scan rules.</p>
     */
    @NameInMap("ScanRules")
    public java.util.List<ListScanRuleResponseBodyScanRules> scanRules;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListScanRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScanRuleResponseBody self = new ListScanRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScanRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScanRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListScanRuleResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListScanRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScanRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScanRuleResponseBody setScanRules(java.util.List<ListScanRuleResponseBodyScanRules> scanRules) {
        this.scanRules = scanRules;
        return this;
    }
    public java.util.List<ListScanRuleResponseBodyScanRules> getScanRules() {
        return this.scanRules;
    }

    public ListScanRuleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListScanRuleResponseBodyScanRules extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1702361810000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The list of namespaces.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        /**
         * <p>The repository name.</p>
         */
        @NameInMap("RepoNames")
        public java.util.List<String> repoNames;

        /**
         * <p>The tag that triggers the scan matches the regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>.*</p>
         */
        @NameInMap("RepoTagFilterPattern")
        public String repoTagFilterPattern;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>cicd-prod</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The scan rule id.</p>
         * 
         * <strong>example:</strong>
         * <p>crscnr-2sdveqjhpzd****</p>
         */
        @NameInMap("ScanRuleId")
        public String scanRuleId;

        /**
         * <p>The scan scope.</p>
         * 
         * <strong>example:</strong>
         * <p>REPO</p>
         */
        @NameInMap("ScanScope")
        public String scanScope;

        /**
         * <p>The scan type. Valid values:</p>
         * <ul>
         * <li><code>VUL</code>: Products Cloud Security Scanner</li>
         * <li><code>SBOM</code>: Product Content Analysis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SBOM</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <p>The trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1764122725000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListScanRuleResponseBodyScanRules build(java.util.Map<String, ?> map) throws Exception {
            ListScanRuleResponseBodyScanRules self = new ListScanRuleResponseBodyScanRules();
            return TeaModel.build(map, self);
        }

        public ListScanRuleResponseBodyScanRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListScanRuleResponseBodyScanRules setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        public ListScanRuleResponseBodyScanRules setRepoNames(java.util.List<String> repoNames) {
            this.repoNames = repoNames;
            return this;
        }
        public java.util.List<String> getRepoNames() {
            return this.repoNames;
        }

        public ListScanRuleResponseBodyScanRules setRepoTagFilterPattern(String repoTagFilterPattern) {
            this.repoTagFilterPattern = repoTagFilterPattern;
            return this;
        }
        public String getRepoTagFilterPattern() {
            return this.repoTagFilterPattern;
        }

        public ListScanRuleResponseBodyScanRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListScanRuleResponseBodyScanRules setScanRuleId(String scanRuleId) {
            this.scanRuleId = scanRuleId;
            return this;
        }
        public String getScanRuleId() {
            return this.scanRuleId;
        }

        public ListScanRuleResponseBodyScanRules setScanScope(String scanScope) {
            this.scanScope = scanScope;
            return this;
        }
        public String getScanScope() {
            return this.scanScope;
        }

        public ListScanRuleResponseBodyScanRules setScanType(String scanType) {
            this.scanType = scanType;
            return this;
        }
        public String getScanType() {
            return this.scanType;
        }

        public ListScanRuleResponseBodyScanRules setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListScanRuleResponseBodyScanRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
