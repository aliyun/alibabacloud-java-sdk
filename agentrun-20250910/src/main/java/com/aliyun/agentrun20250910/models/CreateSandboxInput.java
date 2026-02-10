// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateSandboxInput extends TeaModel {
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <strong>example:</strong>
     * <p>01KE8DAJ35JC8SKP9CNFRZ8CW7</p>
     */
    @NameInMap("sandboxId")
    public String sandboxId;

    @NameInMap("sandboxIdleTimeoutInSeconds")
    public Integer sandboxIdleTimeoutInSeconds;

    /**
     * <p>沙箱空闲超时时间（秒）</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sandboxIdleTimeoutSeconds")
    @Deprecated
    public Integer sandboxIdleTimeoutSeconds;

    /**
     * <p>模板名称（系统内部通过 templateName 查询 template_id）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>templateName</p>
     */
    @NameInMap("templateName")
    public String templateName;

    public static CreateSandboxInput build(java.util.Map<String, ?> map) throws Exception {
        CreateSandboxInput self = new CreateSandboxInput();
        return TeaModel.build(map, self);
    }

    public CreateSandboxInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public CreateSandboxInput setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public CreateSandboxInput setSandboxId(String sandboxId) {
        this.sandboxId = sandboxId;
        return this;
    }
    public String getSandboxId() {
        return this.sandboxId;
    }

    public CreateSandboxInput setSandboxIdleTimeoutInSeconds(Integer sandboxIdleTimeoutInSeconds) {
        this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
        return this;
    }
    public Integer getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

    @Deprecated
    public CreateSandboxInput setSandboxIdleTimeoutSeconds(Integer sandboxIdleTimeoutSeconds) {
        this.sandboxIdleTimeoutSeconds = sandboxIdleTimeoutSeconds;
        return this;
    }
    public Integer getSandboxIdleTimeoutSeconds() {
        return this.sandboxIdleTimeoutSeconds;
    }

    public CreateSandboxInput setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
