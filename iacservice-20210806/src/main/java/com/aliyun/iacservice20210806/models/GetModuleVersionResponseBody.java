// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetModuleVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0D298375-F92F-5B65-82E4-EA68F02521F1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The version details.</p>
     */
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
        /**
         * <p>The time when the version was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08T18:07:40Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-4267dcfbf1b6dfffbc27e218d1b66</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <p>The template version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>versionName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The source of the version. Valid values:</p>
         * <ul>
         * <li>OSS: imported from OSS</li>
         * <li>Registry: created by using a template in the template center</li>
         * <li>ExportTask: referenced from a template exported by a resource export task</li>
         * <li>Upload: uploaded as a file</li>
         * <li>Shared: cloned from a shared template</li>
         * <li>Editor: edited online</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The path value of the version source.</p>
         * <ul>
         * <li>If the source is Registry, the value is in the <Workspace name>/<Module name>:<Module version> format. Example: terraform-alicloud-modules/rds:1.0.0.</li>
         * <li>If the source is OSS, the value is in the oss::<File URL> format. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
         * <li>If the source is ExportTask, the value is in the <Export task ID>:<Exported version> format. Example: ex-3b6cb9fa4751afff298da723c24ac:v1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <p>The path value of the state file corresponding to the template. Currently, only OSS paths are supported. The value is in the oss::<OSS path of the file>/terraform.tfstate format.</p>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate</a></p>
         */
        @NameInMap("statePath")
        public String statePath;

        /**
         * <p>The Terraform content.</p>
         */
        @NameInMap("terraformContext")
        public java.util.Map<String, ?> terraformContext;

        /**
         * <p>The version generation strategy. Valid values:</p>
         * <ul>
         * <li>Manual: manually generated version (default)</li>
         * <li>SourcePathUpdated: a new version is generated when sourcePath is modified</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
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
