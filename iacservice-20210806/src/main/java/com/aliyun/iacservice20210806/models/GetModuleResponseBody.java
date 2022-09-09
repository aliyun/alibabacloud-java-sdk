// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetModuleResponseBody extends TeaModel {
    @NameInMap("module")
    public GetModuleResponseBodyModule module;

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
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("latestVersion")
        public String latestVersion;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("name")
        public String name;

        @NameInMap("outputPath")
        public String outputPath;

        @NameInMap("source")
        public String source;

        @NameInMap("sourcePath")
        public String sourcePath;

        @NameInMap("statePath")
        public String statePath;

        @NameInMap("status")
        public String status;

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
