// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLogAnalysisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Analyses")
    @Validation(required = true)
    public DescribeLogAnalysisResponseAnalyses analyses;

    public static DescribeLogAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogAnalysisResponse self = new DescribeLogAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogAnalysisResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogAnalysisResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLogAnalysisResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLogAnalysisResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLogAnalysisResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLogAnalysisResponse setAnalyses(DescribeLogAnalysisResponseAnalyses analyses) {
        this.analyses = analyses;
        return this;
    }
    public DescribeLogAnalysisResponseAnalyses getAnalyses() {
        return this.analyses;
    }

    public static class DescribeLogAnalysisResponseAnalysesAnalysisMetaValue extends TeaModel {
        @NameInMap("Logstore")
        @Validation(required = true)
        public String logstore;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Project")
        @Validation(required = true)
        public String project;

        @NameInMap("RoleArn")
        @Validation(required = true)
        public String roleArn;

        public static DescribeLogAnalysisResponseAnalysesAnalysisMetaValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogAnalysisResponseAnalysesAnalysisMetaValue self = new DescribeLogAnalysisResponseAnalysesAnalysisMetaValue();
            return TeaModel.build(map, self);
        }

        public DescribeLogAnalysisResponseAnalysesAnalysisMetaValue setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public DescribeLogAnalysisResponseAnalysesAnalysisMetaValue setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLogAnalysisResponseAnalysesAnalysisMetaValue setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeLogAnalysisResponseAnalysesAnalysisMetaValue setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class DescribeLogAnalysisResponseAnalysesAnalysis extends TeaModel {
        @NameInMap("MetaKey")
        @Validation(required = true)
        public String metaKey;

        @NameInMap("MetaValue")
        @Validation(required = true)
        public DescribeLogAnalysisResponseAnalysesAnalysisMetaValue metaValue;

        public static DescribeLogAnalysisResponseAnalysesAnalysis build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogAnalysisResponseAnalysesAnalysis self = new DescribeLogAnalysisResponseAnalysesAnalysis();
            return TeaModel.build(map, self);
        }

        public DescribeLogAnalysisResponseAnalysesAnalysis setMetaKey(String metaKey) {
            this.metaKey = metaKey;
            return this;
        }
        public String getMetaKey() {
            return this.metaKey;
        }

        public DescribeLogAnalysisResponseAnalysesAnalysis setMetaValue(DescribeLogAnalysisResponseAnalysesAnalysisMetaValue metaValue) {
            this.metaValue = metaValue;
            return this;
        }
        public DescribeLogAnalysisResponseAnalysesAnalysisMetaValue getMetaValue() {
            return this.metaValue;
        }

    }

    public static class DescribeLogAnalysisResponseAnalyses extends TeaModel {
        @NameInMap("Analysis")
        @Validation(required = true)
        public java.util.List<DescribeLogAnalysisResponseAnalysesAnalysis> analysis;

        public static DescribeLogAnalysisResponseAnalyses build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogAnalysisResponseAnalyses self = new DescribeLogAnalysisResponseAnalyses();
            return TeaModel.build(map, self);
        }

        public DescribeLogAnalysisResponseAnalyses setAnalysis(java.util.List<DescribeLogAnalysisResponseAnalysesAnalysis> analysis) {
            this.analysis = analysis;
            return this;
        }
        public java.util.List<DescribeLogAnalysisResponseAnalysesAnalysis> getAnalysis() {
            return this.analysis;
        }

    }

}
