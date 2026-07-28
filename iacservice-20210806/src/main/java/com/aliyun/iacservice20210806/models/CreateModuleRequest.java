// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleRequest extends TeaModel {
    /**
     * <p>The idempotency parameter. We recommend that you use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the template. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS instance module</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The project group information to which the template belongs.</p>
     */
    @NameInMap("groupInfo")
    public CreateModuleRequestGroupInfo groupInfo;

    /**
     * <p>The name of the template. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</li>
     * <li>The name must be unique among all templates under the current account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-ecs-module</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The source from which the template is created. Valid values:</p>
     * <ul>
     * <li>OSS: imports from a ZIP file stored in OSS.</li>
     * <li>Registry: creates from a module in the template registry.</li>
     * <li>ExportTask: references a template exported by a resource export task.</li>
     * <li>Editor: creates a blank template that supports online editing.</li>
     * <li>Upload: uploads a local template file to generate the template.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The path of the template source. This parameter takes effect when source is set to Registry, OSS, or ExportTask.</p>
     * <ul>
     * <li>If source is set to Registry, the value is in the format of \<workspace name>/\<module name>:\<module version>. Example: terraform-alicloud-modules/rds:1.0.0.</li>
     * <li>If source is set to OSS, the value is in the format of oss::<file URL>. The file must be a ZIP file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
     * <li>If source is set to ExportTask, the value is in the format of \<export task ID>:\<exported version>. Example: ex-3b6cb9fa4751afff298da723c24ac:v1.</li>
     * <li>If source is set to Editor or Upload, leave this parameter empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
     */
    @NameInMap("sourcePath")
    public String sourcePath;

    /**
     * <p>The path of the State file that corresponds to the template. This parameter is valid only when source is set to OSS.
     * The value is in the format of oss::\<OSS file path>/terraform.tfstate.</p>
     * 
     * <strong>example:</strong>
     * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate</a></p>
     */
    @NameInMap("statePath")
    public String statePath;

    /**
     * <p>The list of tags for the template.</p>
     */
    @NameInMap("tags")
    public java.util.List<CreateModuleRequestTags> tags;

    /**
     * <p>The version generation strategy. Valid values:</p>
     * <ul>
     * <li>Manual: manually generates a version. This is the default value.</li>
     * <li>SourcePathUpdated: generates a new version when sourcePath is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("versionStrategy")
    public String versionStrategy;

    public static CreateModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleRequest self = new CreateModuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateModuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModuleRequest setGroupInfo(CreateModuleRequestGroupInfo groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public CreateModuleRequestGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public CreateModuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateModuleRequest setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public CreateModuleRequest setStatePath(String statePath) {
        this.statePath = statePath;
        return this;
    }
    public String getStatePath() {
        return this.statePath;
    }

    public CreateModuleRequest setTags(java.util.List<CreateModuleRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateModuleRequestTags> getTags() {
        return this.tags;
    }

    public CreateModuleRequest setVersionStrategy(String versionStrategy) {
        this.versionStrategy = versionStrategy;
        return this;
    }
    public String getVersionStrategy() {
        return this.versionStrategy;
    }

    public static class CreateModuleRequestGroupInfo extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-5fd38c9b92d541a7083a86432e2</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-433aead75605713865c386cb9d</p>
         */
        @NameInMap("projectId")
        public String projectId;

        public static CreateModuleRequestGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateModuleRequestGroupInfo self = new CreateModuleRequestGroupInfo();
            return TeaModel.build(map, self);
        }

        public CreateModuleRequestGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateModuleRequestGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class CreateModuleRequestTags extends TeaModel {
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

        public static CreateModuleRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateModuleRequestTags self = new CreateModuleRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateModuleRequestTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateModuleRequestTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
