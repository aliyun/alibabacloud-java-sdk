// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetModuleResponseBody extends TeaModel {
    @NameInMap("module")
    public GetModuleResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1E7BA3EB-B0EF-53F5-9999-07CAD6D9F8A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModuleResponseBody self = new GetModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModuleResponseBody setModule(GetModuleResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetModuleResponseBodyModule getModule() {
        return this.module;
    }

    public GetModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetModuleResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-09-06T06:11:27Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        /**
         * <strong>example:</strong>
         * <p>mod-4267dcfbf1b6d14625614ddbe15</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("outputPath")
        public String outputPath;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>OSS：
         * &quot;oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>&quot;
         * Registry：
         * &quot;alibaba/security-group/alicloud:2.1.0&quot;</p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate</a></p>
         */
        @NameInMap("statePath")
        public String statePath;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("versionStrategy")
        public String versionStrategy;

        public static GetModuleResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetModuleResponseBodyModule self = new GetModuleResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetModuleResponseBodyModule setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetModuleResponseBodyModule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModuleResponseBodyModule setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public GetModuleResponseBodyModule setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetModuleResponseBodyModule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetModuleResponseBodyModule setOutputPath(String outputPath) {
            this.outputPath = outputPath;
            return this;
        }
        public String getOutputPath() {
            return this.outputPath;
        }

        public GetModuleResponseBodyModule setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetModuleResponseBodyModule setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public GetModuleResponseBodyModule setStatePath(String statePath) {
            this.statePath = statePath;
            return this;
        }
        public String getStatePath() {
            return this.statePath;
        }

        public GetModuleResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetModuleResponseBodyModule setVersionStrategy(String versionStrategy) {
            this.versionStrategy = versionStrategy;
            return this;
        }
        public String getVersionStrategy() {
            return this.versionStrategy;
        }

    }

}
