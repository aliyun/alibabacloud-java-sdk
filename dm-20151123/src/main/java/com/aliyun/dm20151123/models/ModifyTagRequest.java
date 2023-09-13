// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyTagRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the tag.</p>
     */
    @NameInMap("TagId")
    public Integer tagId;

    /**
     * <p>The name of the tag.</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static ModifyTagRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagRequest self = new ModifyTagRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTagRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTagRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTagRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTagRequest setTagId(Integer tagId) {
        this.tagId = tagId;
        return this;
    }
    public Integer getTagId() {
        return this.tagId;
    }

    public ModifyTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
