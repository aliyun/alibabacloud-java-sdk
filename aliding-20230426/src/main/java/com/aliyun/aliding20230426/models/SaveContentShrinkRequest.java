// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SaveContentShrinkRequest extends TeaModel {
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

    public static SaveContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveContentShrinkRequest self = new SaveContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveContentShrinkRequest setContentsShrink(String contentsShrink) {
        this.contentsShrink = contentsShrink;
        return this;
    }
    public String getContentsShrink() {
        return this.contentsShrink;
    }

    public SaveContentShrinkRequest setDdFrom(String ddFrom) {
        this.ddFrom = ddFrom;
        return this;
    }
    public String getDdFrom() {
        return this.ddFrom;
    }

    public SaveContentShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SaveContentShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
