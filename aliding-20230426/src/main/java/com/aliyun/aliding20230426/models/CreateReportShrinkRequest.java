// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateReportShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Contents")
    public String contentsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DdFrom")
    public String ddFrom;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ToChat")
    public Boolean toChat;

    @NameInMap("ToCids")
    public String toCidsShrink;

    @NameInMap("ToUserids")
    public String toUseridsShrink;

    public static CreateReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReportShrinkRequest self = new CreateReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateReportShrinkRequest setContentsShrink(String contentsShrink) {
        this.contentsShrink = contentsShrink;
        return this;
    }
    public String getContentsShrink() {
        return this.contentsShrink;
    }

    public CreateReportShrinkRequest setDdFrom(String ddFrom) {
        this.ddFrom = ddFrom;
        return this;
    }
    public String getDdFrom() {
        return this.ddFrom;
    }

    public CreateReportShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateReportShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CreateReportShrinkRequest setToChat(Boolean toChat) {
        this.toChat = toChat;
        return this;
    }
    public Boolean getToChat() {
        return this.toChat;
    }

    public CreateReportShrinkRequest setToCidsShrink(String toCidsShrink) {
        this.toCidsShrink = toCidsShrink;
        return this;
    }
    public String getToCidsShrink() {
        return this.toCidsShrink;
    }

    public CreateReportShrinkRequest setToUseridsShrink(String toUseridsShrink) {
        this.toUseridsShrink = toUseridsShrink;
        return this;
    }
    public String getToUseridsShrink() {
        return this.toUseridsShrink;
    }

}
