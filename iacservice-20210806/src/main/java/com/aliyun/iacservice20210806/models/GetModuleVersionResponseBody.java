// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetModuleVersionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("version")
    public GetModuleVersionResponseBodyVersion version;

    public static GetModuleVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModuleVersionResponseBody self = new GetModuleVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModuleVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModuleVersionResponseBody setVersion(GetModuleVersionResponseBodyVersion version) {
        this.version = version;
        return this;
    }
    public GetModuleVersionResponseBodyVersion getVersion() {
        return this.version;
    }

    public static class GetModuleVersionResponseBodyVersion extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("source")
        public String source;

        @NameInMap("sourcePath")
        public String sourcePath;

        @NameInMap("statePath")
        public String statePath;

        @NameInMap("terraformContext")
        public java.util.Map<String, ?> terraformContext;

        @NameInMap("versionStrategy")
        public String versionStrategy;

        public static GetModuleVersionResponseBodyVersion build(java.util.Map<String, ?> map) throws Exception {
            GetModuleVersionResponseBodyVersion self = new GetModuleVersionResponseBodyVersion();
            return TeaModel.build(map, self);
        }

        public GetModuleVersionResponseBodyVersion setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetModuleVersionResponseBodyVersion setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModuleVersionResponseBodyVersion setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetModuleVersionResponseBodyVersion setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetModuleVersionResponseBodyVersion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetModuleVersionResponseBodyVersion setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetModuleVersionResponseBodyVersion setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public GetModuleVersionResponseBodyVersion setStatePath(String statePath) {
            this.statePath = statePath;
            return this;
        }
        public String getStatePath() {
            return this.statePath;
        }

        public GetModuleVersionResponseBodyVersion setTerraformContext(java.util.Map<String, ?> terraformContext) {
            this.terraformContext = terraformContext;
            return this;
        }
        public java.util.Map<String, ?> getTerraformContext() {
            return this.terraformContext;
        }

        public GetModuleVersionResponseBodyVersion setVersionStrategy(String versionStrategy) {
            this.versionStrategy = versionStrategy;
            return this;
        }
        public String getVersionStrategy() {
            return this.versionStrategy;
        }

    }

}
