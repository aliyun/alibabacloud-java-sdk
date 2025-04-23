// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateModuleAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("groupInfo")
    public UpdateModuleAttributeRequestGroupInfo groupInfo;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

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
     * <p>Manual</p>
     */
    @NameInMap("versionStrategy")
    public String versionStrategy;

    public static UpdateModuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleAttributeRequest self = new UpdateModuleAttributeRequest();
        return TeaModel.build(map, self);
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

    public UpdateModuleAttributeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
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

    public UpdateModuleAttributeRequest setVersionStrategy(String versionStrategy) {
        this.versionStrategy = versionStrategy;
        return this;
    }
    public String getVersionStrategy() {
        return this.versionStrategy;
    }

    public static class UpdateModuleAttributeRequestGroupInfo extends TeaModel {
        @NameInMap("groupId")
        public String groupId;

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

}
