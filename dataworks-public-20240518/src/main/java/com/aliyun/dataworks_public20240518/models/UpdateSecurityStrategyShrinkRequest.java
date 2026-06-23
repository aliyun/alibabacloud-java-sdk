// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateSecurityStrategyShrinkRequest extends TeaModel {
    /**
     * <p>A client token to ensure request idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The policy content, which is constrained by the <code>SecurityStrategySchema</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p><strong>The policy description.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>控制数据分析模块的查询结果安全行为</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p><strong>The policy ID.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p><strong>The policy name.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>默认数据分析策略</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p><strong>A list of associated workspace IDs.</strong></p>
     */
    @NameInMap("Workspaces")
    public String workspacesShrink;

    public static UpdateSecurityStrategyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityStrategyShrinkRequest self = new UpdateSecurityStrategyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityStrategyShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSecurityStrategyShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public UpdateSecurityStrategyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSecurityStrategyShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSecurityStrategyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSecurityStrategyShrinkRequest setWorkspacesShrink(String workspacesShrink) {
        this.workspacesShrink = workspacesShrink;
        return this;
    }
    public String getWorkspacesShrink() {
        return this.workspacesShrink;
    }

}
