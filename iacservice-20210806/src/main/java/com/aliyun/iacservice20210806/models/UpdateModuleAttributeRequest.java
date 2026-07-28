// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateModuleAttributeRequest extends TeaModel {
    /**
     * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The template description. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The project group information.</p>
     */
    @NameInMap("groupInfo")
    public UpdateModuleAttributeRequestGroupInfo groupInfo;

    /**
     * <p>The template name. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). It cannot start or end with a hyphen, underscore, or period.</li>
     * <li>The name must be unique among all templates within the current account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ModuleName</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The path of the template source.</p>
     * <ul>
     * <li>If the source is Registry, set this parameter to <workspace name>/<module name>:<module version>. Example: terraform-alicloud-modules/rds:1.0.0.</li>
     * <li>If the source is OSS, set this parameter to oss::<file URL>. The file must be a ZIP file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
     * <li>If the source is ExportTask, set this parameter to <export task ID>:<exported version>. Example: ex-3b6cb9fa4751afff298da723c24ac:v1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
     */
    @NameInMap("sourcePath")
    public String sourcePath;

    /**
     * <p>The path of the state file that corresponds to the template. Currently, only OSS paths are supported. Set this parameter to oss::<OSS file path>/terraform.tfstate.</p>
     * 
     * <strong>example:</strong>
     * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate</a></p>
     */
    @NameInMap("statePath")
    public String statePath;

    /**
     * <p>The tags of the template.</p>
     */
    @NameInMap("tags")
    public java.util.List<UpdateModuleAttributeRequestTags> tags;

    /**
     * <p>The version generation strategy. Valid values:</p>
     * <ul>
     * <li>Manual: manually generate versions. This is the default value.</li>
     * <li>SourcePathUpdated: a new version is generated when sourcePath is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("versionStrategy")
    public String versionStrategy;

    public static UpdateModuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleAttributeRequest self = new UpdateModuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateModuleAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModuleAttributeRequest setGroupInfo(UpdateModuleAttributeRequestGroupInfo groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public UpdateModuleAttributeRequestGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public UpdateModuleAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateModuleAttributeRequest setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public UpdateModuleAttributeRequest setStatePath(String statePath) {
        this.statePath = statePath;
        return this;
    }
    public String getStatePath() {
        return this.statePath;
    }

    public UpdateModuleAttributeRequest setTags(java.util.List<UpdateModuleAttributeRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateModuleAttributeRequestTags> getTags() {
        return this.tags;
    }

    public UpdateModuleAttributeRequest setVersionStrategy(String versionStrategy) {
        this.versionStrategy = versionStrategy;
        return this;
    }
    public String getVersionStrategy() {
        return this.versionStrategy;
    }

    public static class UpdateModuleAttributeRequestGroupInfo extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-433aead7560571e66e31274ffd3</p>
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

        public static UpdateModuleAttributeRequestGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateModuleAttributeRequestGroupInfo self = new UpdateModuleAttributeRequestGroupInfo();
            return TeaModel.build(map, self);
        }

        public UpdateModuleAttributeRequestGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateModuleAttributeRequestGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class UpdateModuleAttributeRequestTags extends TeaModel {
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

        public static UpdateModuleAttributeRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateModuleAttributeRequestTags self = new UpdateModuleAttributeRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateModuleAttributeRequestTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateModuleAttributeRequestTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
