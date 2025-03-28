// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentDeploymentSpec extends TeaModel {
    @NameInMap("baseline")
    public EnvironmentSnapshot baseline;

    @NameInMap("changes")
    public EnvironmentChanges changes;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("skipRemoveResources")
    public Boolean skipRemoveResources;

    @NameInMap("target")
    public EnvironmentStagedConfigs target;

    @NameInMap("webhookCodeContext")
    public WebhookCodeContext webhookCodeContext;

    public static EnvironmentDeploymentSpec build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentDeploymentSpec self = new EnvironmentDeploymentSpec();
        return TeaModel.build(map, self);
    }

    public EnvironmentDeploymentSpec setBaseline(EnvironmentSnapshot baseline) {
        this.baseline = baseline;
        return this;
    }
    public EnvironmentSnapshot getBaseline() {
        return this.baseline;
    }

    public EnvironmentDeploymentSpec setChanges(EnvironmentChanges changes) {
        this.changes = changes;
        return this;
    }
    public EnvironmentChanges getChanges() {
        return this.changes;
    }

    public EnvironmentDeploymentSpec setSkipRemoveResources(Boolean skipRemoveResources) {
        this.skipRemoveResources = skipRemoveResources;
        return this;
    }
    public Boolean getSkipRemoveResources() {
        return this.skipRemoveResources;
    }

    public EnvironmentDeploymentSpec setTarget(EnvironmentStagedConfigs target) {
        this.target = target;
        return this;
    }
    public EnvironmentStagedConfigs getTarget() {
        return this.target;
    }

    public EnvironmentDeploymentSpec setWebhookCodeContext(WebhookCodeContext webhookCodeContext) {
        this.webhookCodeContext = webhookCodeContext;
        return this;
    }
    public WebhookCodeContext getWebhookCodeContext() {
        return this.webhookCodeContext;
    }

}
