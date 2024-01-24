// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLogAnalysisResponseBody extends TeaModel {
    /**
     * <p>The collection of log dump information.</p>
     */
    @NameInMap("Analyses")
    public DescribeLogAnalysisResponseBodyAnalyses analyses;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of log dump entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of log dump entries in the region.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLogAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogAnalysisResponseBody self = new DescribeLogAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogAnalysisResponseBody setAnalyses(DescribeLogAnalysisResponseBodyAnalyses analyses) {
        this.analyses = analyses;
        return this;
    }
    public DescribeLogAnalysisResponseBodyAnalyses getAnalyses() {
        return this.analyses;
    }

    public DescribeLogAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLogAnalysisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLogAnalysisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLogAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogAnalysisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue extends TeaModel {
        /**
         * <p>The name of the dedicated Logstore that is used to store NAS operation logs.</p>
         */
        @NameInMap("Logstore")
        public String logstore;

        /**
         * <p>The name of the project where the dedicated Logstore resides.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The region where the dedicated Logstore resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The role that is used by NAS to access Simple Log Service.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        public static DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue self = new DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue();
            return TeaModel.build(map, self);
        }

        public DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class DescribeLogAnalysisResponseBodyAnalysesAnalysis extends TeaModel {
        /**
         * <p>The ID of the file system.</p>
         */
        @NameInMap("MetaKey")
        public String metaKey;

        /**
         * <p>The log dump information of the file system.</p>
         */
        @NameInMap("MetaValue")
        public DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue metaValue;

        public static DescribeLogAnalysisResponseBodyAnalysesAnalysis build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogAnalysisResponseBodyAnalysesAnalysis self = new DescribeLogAnalysisResponseBodyAnalysesAnalysis();
            return TeaModel.build(map, self);
        }

        public DescribeLogAnalysisResponseBodyAnalysesAnalysis setMetaKey(String metaKey) {
            this.metaKey = metaKey;
            return this;
        }
        public String getMetaKey() {
            return this.metaKey;
        }

        public DescribeLogAnalysisResponseBodyAnalysesAnalysis setMetaValue(DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue metaValue) {
            this.metaValue = metaValue;
            return this;
        }
        public DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue getMetaValue() {
            return this.metaValue;
        }

    }

    public static class DescribeLogAnalysisResponseBodyAnalyses extends TeaModel {
        @NameInMap("Analysis")
        public java.util.List<DescribeLogAnalysisResponseBodyAnalysesAnalysis> analysis;

        public static DescribeLogAnalysisResponseBodyAnalyses build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogAnalysisResponseBodyAnalyses self = new DescribeLogAnalysisResponseBodyAnalyses();
            return TeaModel.build(map, self);
        }

        public DescribeLogAnalysisResponseBodyAnalyses setAnalysis(java.util.List<DescribeLogAnalysisResponseBodyAnalysesAnalysis> analysis) {
            this.analysis = analysis;
            return this;
        }
        public java.util.List<DescribeLogAnalysisResponseBodyAnalysesAnalysis> getAnalysis() {
            return this.analysis;
        }

    }

}
