// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddAuthorityTemplateItemsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Items")
    public String itemsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15***</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static AddAuthorityTemplateItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthorityTemplateItemsShrinkRequest self = new AddAuthorityTemplateItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddAuthorityTemplateItemsShrinkRequest setItemsShrink(String itemsShrink) {
        this.itemsShrink = itemsShrink;
        return this;
    }
    public String getItemsShrink() {
        return this.itemsShrink;
    }

    public AddAuthorityTemplateItemsShrinkRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public AddAuthorityTemplateItemsShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
