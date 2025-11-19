// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Sandbox extends TeaModel {
    /**
     * <p>沙箱创建时间</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>最后更新时间</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    @NameInMap("sandboxArn")
    public String sandboxArn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sandboxId")
    public String sandboxId;

    /**
     * <p>沙箱空闲超时时间（秒）</p>
     */
    @NameInMap("sandboxIdleTimeoutSeconds")
    public Integer sandboxIdleTimeoutSeconds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("templateId")
    public String templateId;

    @NameInMap("templateName")
    public String templateName;

    public static Sandbox build(java.util.Map<String, ?> map) throws Exception {
        Sandbox self = new Sandbox();
        return TeaModel.build(map, self);
    }

    public Sandbox setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Sandbox setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public Sandbox setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public Sandbox setSandboxArn(String sandboxArn) {
        this.sandboxArn = sandboxArn;
        return this;
    }
    public String getSandboxArn() {
        return this.sandboxArn;
    }

    public Sandbox setSandboxId(String sandboxId) {
        this.sandboxId = sandboxId;
        return this;
    }
    public String getSandboxId() {
        return this.sandboxId;
    }

    public Sandbox setSandboxIdleTimeoutSeconds(Integer sandboxIdleTimeoutSeconds) {
        this.sandboxIdleTimeoutSeconds = sandboxIdleTimeoutSeconds;
        return this;
    }
    public Integer getSandboxIdleTimeoutSeconds() {
        return this.sandboxIdleTimeoutSeconds;
    }

    public Sandbox setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Sandbox setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public Sandbox setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
