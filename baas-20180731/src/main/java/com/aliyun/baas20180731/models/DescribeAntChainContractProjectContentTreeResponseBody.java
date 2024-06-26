// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectContentTreeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainContractProjectContentTreeResponseBodyResult result;

    public static DescribeAntChainContractProjectContentTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectContentTreeResponseBody self = new DescribeAntChainContractProjectContentTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectContentTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainContractProjectContentTreeResponseBody setResult(DescribeAntChainContractProjectContentTreeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainContractProjectContentTreeResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainContractProjectContentTreeResponseBodyResult extends TeaModel {
        @NameInMap("Children")
        public java.util.List<java.util.Map<String, ?>> children;

        @NameInMap("ProjectDescription")
        public String projectDescription;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectVersion")
        public String projectVersion;

        public static DescribeAntChainContractProjectContentTreeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectContentTreeResponseBodyResult self = new DescribeAntChainContractProjectContentTreeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectContentTreeResponseBodyResult setChildren(java.util.List<java.util.Map<String, ?>> children) {
            this.children = children;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

        public DescribeAntChainContractProjectContentTreeResponseBodyResult setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public DescribeAntChainContractProjectContentTreeResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeAntChainContractProjectContentTreeResponseBodyResult setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeAntChainContractProjectContentTreeResponseBodyResult setProjectVersion(String projectVersion) {
            this.projectVersion = projectVersion;
            return this;
        }
        public String getProjectVersion() {
            return this.projectVersion;
        }

    }

}
