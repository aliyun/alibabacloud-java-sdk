// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateTicketShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CustomFields")
    public String customFields;

    @NameInMap("Notify")
    public String notifyShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>G3IOe205RLciE</p>
     */
    @NameInMap("OpenTeamId")
    public String openTeamId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("OpenTemplateBizId")
    public String openTemplateBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProcessorUserIds")
    public String processorUserIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SG</p>
     */
    @NameInMap("Scene")
    public String scene;

    @NameInMap("SceneContext")
    public String sceneContextShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Killer Ball Wo Mouichido</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateTicketShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketShrinkRequest self = new CreateTicketShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketShrinkRequest setCustomFields(String customFields) {
        this.customFields = customFields;
        return this;
    }
    public String getCustomFields() {
        return this.customFields;
    }

    public CreateTicketShrinkRequest setNotifyShrink(String notifyShrink) {
        this.notifyShrink = notifyShrink;
        return this;
    }
    public String getNotifyShrink() {
        return this.notifyShrink;
    }

    public CreateTicketShrinkRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public CreateTicketShrinkRequest setOpenTemplateBizId(String openTemplateBizId) {
        this.openTemplateBizId = openTemplateBizId;
        return this;
    }
    public String getOpenTemplateBizId() {
        return this.openTemplateBizId;
    }

    public CreateTicketShrinkRequest setProcessorUserIdsShrink(String processorUserIdsShrink) {
        this.processorUserIdsShrink = processorUserIdsShrink;
        return this;
    }
    public String getProcessorUserIdsShrink() {
        return this.processorUserIdsShrink;
    }

    public CreateTicketShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateTicketShrinkRequest setSceneContextShrink(String sceneContextShrink) {
        this.sceneContextShrink = sceneContextShrink;
        return this;
    }
    public String getSceneContextShrink() {
        return this.sceneContextShrink;
    }

    public CreateTicketShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CreateTicketShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
