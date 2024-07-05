// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class TagCustomPersonRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CategoryDescription001-****</p>
     */
    @NameInMap("CategoryDescription")
    public String categoryDescription;

    /**
     * <strong>example:</strong>
     * <p>CategoryId001-****</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <strong>example:</strong>
     * <p>CategoryNametest-****</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>PersonDescriptiontest-****</p>
     */
    @NameInMap("PersonDescription")
    public String personDescription;

    /**
     * <strong>example:</strong>
     * <p>PersonId001-****</p>
     */
    @NameInMap("PersonId")
    public String personId;

    /**
     * <strong>example:</strong>
     * <p>PersonNametest-****</p>
     */
    @NameInMap("PersonName")
    public String personName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static TagCustomPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        TagCustomPersonRequest self = new TagCustomPersonRequest();
        return TeaModel.build(map, self);
    }

    public TagCustomPersonRequest setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
        return this;
    }
    public String getCategoryDescription() {
        return this.categoryDescription;
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

    public TagCustomPersonRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TagCustomPersonRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagCustomPersonRequest setPersonDescription(String personDescription) {
        this.personDescription = personDescription;
        return this;
    }
    public String getPersonDescription() {
        return this.personDescription;
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

}
