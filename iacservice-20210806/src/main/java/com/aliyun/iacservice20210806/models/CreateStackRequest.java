// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateStackRequest extends TeaModel {
    /**
     * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. A UUID is recommended.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the stack. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Stack to create ecs and related resource for multiple enviroments.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the stack. The name must be 2 to 128 characters in length and can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). It cannot start or end with a hyphen, underscore, or period.</p>
     * 
     * <strong>example:</strong>
     * <p>stack-test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The associated parameter sets.</p>
     */
    @NameInMap("parameterSetIds")
    public java.util.List<String> parameterSetIds;

    /**
     * <p>The RAM role authorized for the task. This role is used to automatically resume the execution of scheduled tasks in auto-triggered or offline scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>TestIacRole</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    /**
     * <p>Specifies whether to skip resource property validation for the provider. Default value: false.</p>
     */
    @NameInMap("skipPropertyValidation")
    public Boolean skipPropertyValidation;

    /**
     * <p>The source of the stack. Valid values:</p>
     * <ul>
     * <li>OSS: a template stored in Object Storage Service (OSS).</li>
     * <li>IAC_SERVICE_MODULE: a template created in the automation service console.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The path of the source. The value can be up to 1,000 characters in length.</p>
     * <ul>
     * <li>If the source is OSS, the value must be in the oss::<file URL> format and the file must be a ZIP file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
     * <li>If the source is IAC_SERVICE_MODULE, the value must be the template ID. Example: mod-xxxxx.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
     */
    @NameInMap("sourcePath")
    public String sourcePath;

    /**
     * <p>The working directory where the configuration file is located. If the file is in the root directory, enter /. Examples: config/ or /.</p>
     * 
     * <strong>example:</strong>
     * <p>/stack</p>
     */
    @NameInMap("workingDirectory")
    public String workingDirectory;

    public static CreateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackRequest self = new CreateStackRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStackRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateStackRequest setParameterSetIds(java.util.List<String> parameterSetIds) {
        this.parameterSetIds = parameterSetIds;
        return this;
    }
    public java.util.List<String> getParameterSetIds() {
        return this.parameterSetIds;
    }

    public CreateStackRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public CreateStackRequest setSkipPropertyValidation(Boolean skipPropertyValidation) {
        this.skipPropertyValidation = skipPropertyValidation;
        return this;
    }
    public Boolean getSkipPropertyValidation() {
        return this.skipPropertyValidation;
    }

    public CreateStackRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateStackRequest setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public CreateStackRequest setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }
    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

}
