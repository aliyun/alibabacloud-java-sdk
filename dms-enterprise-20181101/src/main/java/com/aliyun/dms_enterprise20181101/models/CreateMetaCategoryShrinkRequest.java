// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateMetaCategoryShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerIds")
    public String ownerIdsShrink;

    /**
     * <p>The ID of the parent category. The new category is created under this parent category. If this value is left empty, the new category is of the first level.</p>
     * 
     * <strong>example:</strong>
     * <p>30000322682</p>
     */
    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateMetaCategoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCategoryShrinkRequest self = new CreateMetaCategoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetaCategoryShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMetaCategoryShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetaCategoryShrinkRequest setOwnerIdsShrink(String ownerIdsShrink) {
        this.ownerIdsShrink = ownerIdsShrink;
        return this;
    }
    public String getOwnerIdsShrink() {
        return this.ownerIdsShrink;
    }

    public CreateMetaCategoryShrinkRequest setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public CreateMetaCategoryShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateMetaCategoryShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
