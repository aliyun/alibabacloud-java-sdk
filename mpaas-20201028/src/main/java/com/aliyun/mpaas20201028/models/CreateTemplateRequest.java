// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Content")
    public String content;

    @NameInMap("DescInfo")
    public String descInfo;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("IconUrls")
    public String iconUrls;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("ImageUrls")
    public String imageUrls;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("JumpAction")
    public Integer jumpAction;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PushStyle")
    public Integer pushStyle;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ShowStyle")
    public Long showStyle;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>GKDDZPFH</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <strong>example:</strong>
     * <p>title,content</p>
     */
    @NameInMap("Variables")
    public String variables;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateTemplateRequest setDescInfo(String descInfo) {
        this.descInfo = descInfo;
        return this;
    }
    public String getDescInfo() {
        return this.descInfo;
    }

    public CreateTemplateRequest setIconUrls(String iconUrls) {
        this.iconUrls = iconUrls;
        return this;
    }
    public String getIconUrls() {
        return this.iconUrls;
    }

    public CreateTemplateRequest setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public String getImageUrls() {
        return this.imageUrls;
    }

    public CreateTemplateRequest setJumpAction(Integer jumpAction) {
        this.jumpAction = jumpAction;
        return this;
    }
    public Integer getJumpAction() {
        return this.jumpAction;
    }

    public CreateTemplateRequest setPushStyle(Integer pushStyle) {
        this.pushStyle = pushStyle;
        return this;
    }
    public Integer getPushStyle() {
        return this.pushStyle;
    }

    public CreateTemplateRequest setShowStyle(Long showStyle) {
        this.showStyle = showStyle;
        return this;
    }
    public Long getShowStyle() {
        return this.showStyle;
    }

    public CreateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateTemplateRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateTemplateRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public CreateTemplateRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

    public CreateTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
