// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class TagCustomPersonRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("CategoryName")
    public String categoryName;

    @NameInMap("CategoryDescription")
    public String categoryDescription;

    @NameInMap("PersonId")
    public String personId;

    @NameInMap("PersonName")
    public String personName;

    @NameInMap("PersonDescription")
    public String personDescription;

    public static TagCustomPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        TagCustomPersonRequest self = new TagCustomPersonRequest();
        return TeaModel.build(map, self);
    }

    public TagCustomPersonRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagCustomPersonRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TagCustomPersonRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TagCustomPersonRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TagCustomPersonRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public TagCustomPersonRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public TagCustomPersonRequest setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
        return this;
    }
    public String getCategoryDescription() {
        return this.categoryDescription;
    }

    public TagCustomPersonRequest setPersonId(String personId) {
        this.personId = personId;
        return this;
    }
    public String getPersonId() {
        return this.personId;
    }

    public TagCustomPersonRequest setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    public String getPersonName() {
        return this.personName;
    }

    public TagCustomPersonRequest setPersonDescription(String personDescription) {
        this.personDescription = personDescription;
        return this;
    }
    public String getPersonDescription() {
        return this.personDescription;
    }

}
