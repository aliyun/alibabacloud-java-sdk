// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateMetaCategoryShrinkRequest extends TeaModel {
    /**
     * <p>The category ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30000181325</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("Description")
    public String description;

    /**
     * <p>The updated name of the category.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerIds")
    public String ownerIdsShrink;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateMetaCategoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCategoryShrinkRequest self = new UpdateMetaCategoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCategoryShrinkRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateMetaCategoryShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMetaCategoryShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMetaCategoryShrinkRequest setOwnerIdsShrink(String ownerIdsShrink) {
        this.ownerIdsShrink = ownerIdsShrink;
        return this;
    }
    public String getOwnerIdsShrink() {
        return this.ownerIdsShrink;
    }

    public UpdateMetaCategoryShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateMetaCategoryShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
