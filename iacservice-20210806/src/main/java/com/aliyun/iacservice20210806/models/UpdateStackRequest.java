// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateStackRequest extends TeaModel {
    /**
     * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the stack.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the stack. The name must be 2 to 128 characters in length and can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</p>
     * 
     * <strong>example:</strong>
     * <p>stack-test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The RAM role granted to the task. This role is used to automatically continue the execution of scheduled tasks during automatic triggering or offline scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>TestIacRole</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    /**
     * <p>The path of the configuration source. The value can be up to 1,000 characters in length.</p>
     * <ul>
     * <li>If the source is OSS, set this parameter to oss::<file URL>. The file must be a ZIP file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
     * <li>If the source is IAC_SERVICE_MODULE, set this parameter to a template ID. Example: mod-xxxxx.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
     */
    @NameInMap("sourcePath")
    public String sourcePath;

    /**
     * <p>The working directory where the configuration files are located. Enter / if the files are in the root directory. Example: config/ or /.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("workingDirectory")
    public String workingDirectory;

    public static UpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackRequest self = new UpdateStackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateStackRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateStackRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public UpdateStackRequest setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public UpdateStackRequest setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }
    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

}
