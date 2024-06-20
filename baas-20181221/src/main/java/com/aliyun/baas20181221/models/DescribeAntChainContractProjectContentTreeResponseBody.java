// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectContentTreeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A0DF307A-A44A-476F-99D8-BA4F205350BD</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("ProjectDescription")
        public String projectDescription;

        /**
         * <strong>example:</strong>
         * <p>2L9VK68g</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>projectname</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
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
