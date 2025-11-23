// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddAuthorityTemplateItemsShrinkRequest extends TeaModel {
    /**
     * <p>The resources that you want to add to the permission template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Items")
    public String itemsShrink;

    /**
     * <p>The ID of the permission template. You can call the <a href="https://help.aliyun.com/document_detail/600705.html">CreateAuthorityTemplate</a> operation to obtain the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15***</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
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
