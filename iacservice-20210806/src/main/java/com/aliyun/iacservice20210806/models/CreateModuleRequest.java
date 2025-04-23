// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("groupInfo")
    public CreateModuleRequestGroupInfo groupInfo;

    /**
     * <p>This parameter is required.</p>
     * 
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

    public CreateModuleRequest setVersionStrategy(String versionStrategy) {
        this.versionStrategy = versionStrategy;
        return this;
    }
    public String getVersionStrategy() {
        return this.versionStrategy;
    }

    public static class CreateModuleRequestGroupInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>g-5fd38c9b92d541a7083a86432e2</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
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

}
