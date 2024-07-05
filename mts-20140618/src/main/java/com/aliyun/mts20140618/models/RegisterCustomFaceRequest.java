// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterCustomFaceRequest extends TeaModel {
    /**
     * <p>The ID of the figure library in which you want to register a custom face. The ID is used to uniquely identify a figure library. You can specify the ID of a custom figure library. Make sure that the ID is unique and keep the ID for future API operation calls. If you set this parameter to the ID of a system figure library, the custom face is registered in the system figure library. The ID can be up to 120 characters in length and is not case-sensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CategoryId001-****</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The URL of the facial image that you want to register for the specified figure. The image must contain only one face.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-****.jpeg">http://example-****.jpeg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the figure for which you want to register a custom face. The ID is used to uniquely identify a figure. You can specify a figure ID. Make sure that the ID is unique and keep the ID for future API operation calls. The ID can be up to 120 characters in length and is not case-sensitive. The value returned is of the String type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PersonId001-****</p>
     */
    @NameInMap("PersonId")
    public String personId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RegisterCustomFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCustomFaceRequest self = new RegisterCustomFaceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCustomFaceRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public RegisterCustomFaceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public RegisterCustomFaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RegisterCustomFaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RegisterCustomFaceRequest setPersonId(String personId) {
        this.personId = personId;
        return this;
    }
    public String getPersonId() {
        return this.personId;
    }

    public RegisterCustomFaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RegisterCustomFaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
