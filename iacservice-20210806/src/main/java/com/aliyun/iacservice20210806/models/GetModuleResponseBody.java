// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetModuleResponseBody extends TeaModel {
    /**
     * <p>The template information.</p>
     */
    @NameInMap("module")
    public GetModuleResponseBodyModule module;

    /**
     * <p>The request ID.</p>
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

    public static class GetModuleResponseBodyModuleGroupInfo extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-fu1a1ol8cob1oni01ekcloi</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>groupName</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-al1d11jlvlsbvr11lf3pqo</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>projectName</p>
         */
        @NameInMap("projectName")
        public String projectName;

        public static GetModuleResponseBodyModuleGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            GetModuleResponseBodyModuleGroupInfo self = new GetModuleResponseBodyModuleGroupInfo();
            return TeaModel.build(map, self);
        }

        public GetModuleResponseBodyModuleGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetModuleResponseBodyModuleGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetModuleResponseBodyModuleGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetModuleResponseBodyModuleGroupInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GetModuleResponseBodyModuleTags extends TeaModel {
        /**
         * <p>The tag key of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static GetModuleResponseBodyModuleTags build(java.util.Map<String, ?> map) throws Exception {
            GetModuleResponseBodyModuleTags self = new GetModuleResponseBodyModuleTags();
            return TeaModel.build(map, self);
        }

        public GetModuleResponseBodyModuleTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetModuleResponseBodyModuleTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetModuleResponseBodyModule extends TeaModel {
        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T06:11:27Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The group information.</p>
         */
        @NameInMap("groupInfo")
        public GetModuleResponseBodyModuleGroupInfo groupInfo;

        /**
         * <p>The latest version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-4267dcfbf1b6d14625614ddbe15</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>ModuleName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The storage path of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("outputPath")
        public String outputPath;

        /**
         * <p>The template source. Valid values:</p>
         * <ul>
         * <li>OSS: Imported from OSS.</li>
         * <li>Registry: Created from a template in the template center.</li>
         * <li>ExportTask: Exported from a resource export task.</li>
         * <li>Upload: Uploaded as a file.</li>
         * <li>Shared: Cloned from a shared template.</li>
         * <li>Editor: Created by using the online editor.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The source path of the template.</p>
         * <ul>
         * <li>If the source is Registry, the value is in the format of <workspace name>/<module name>:<module version>, such as terraform-alicloud-modules/rds:1.0.0.</li>
         * <li>If the source is OSS, the value is in the format of oss::<file link>, such as oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
         * <li>If the source is ExportTask, the value is in the format of <export task ID>:<exported version>, such as ex-3b6cb9fa4751afff298da723c24ac:v1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <p>The path of the state file that corresponds to the template. Currently, only OSS paths are supported. The value is in the format of oss::<file OSS path>/terraform.tfstate.</p>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate</a></p>
         */
        @NameInMap("statePath")
        public String statePath;

        /**
         * <p>The template status. Valid values:</p>
         * <ul>
         * <li>Creating: The template is being created.</li>
         * <li>Created: The template is created.</li>
         * </ul>
         * <p>After the template is created, you can publish a version.</p>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tags of the template.</p>
         */
        @NameInMap("tags")
        public java.util.List<GetModuleResponseBodyModuleTags> tags;

        /**
         * <p>The version generation strategy. Valid values:</p>
         * <ul>
         * <li>Manual: Versions are generated manually. This is the default value.</li>
         * <li>SourcePathUpdated: A new version is generated when the sourcePath is modified.</li>
         * </ul>
         * 
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

        public GetModuleResponseBodyModule setGroupInfo(GetModuleResponseBodyModuleGroupInfo groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public GetModuleResponseBodyModuleGroupInfo getGroupInfo() {
            return this.groupInfo;
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

        public GetModuleResponseBodyModule setTags(java.util.List<GetModuleResponseBodyModuleTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetModuleResponseBodyModuleTags> getTags() {
            return this.tags;
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
