// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLogAnalysisResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Analyses")
    public DescribeLogAnalysisResponseBodyAnalyses analyses;

    @NameInMap("Code")
    public String code;

    public static DescribeLogAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogAnalysisResponseBody self = new DescribeLogAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogAnalysisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeLogAnalysisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public static class DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Region")
        public String region;

        @NameInMap("Logstore")
        public String logstore;

        @NameInMap("Project")
        public String project;

        public static DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue self = new DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue();
            return TeaModel.build(map, self);
        }

        public DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DescribeLogAnalysisResponseBodyAnalysesAnalysisMetaValue setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
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

    }

    public static class DescribeLogAnalysisResponseBodyAnalysesAnalysis extends TeaModel {
        @NameInMap("MetaKey")
        public String metaKey;

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
