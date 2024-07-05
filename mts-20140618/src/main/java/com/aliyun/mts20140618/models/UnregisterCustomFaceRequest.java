// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UnregisterCustomFaceRequest extends TeaModel {
    /**
     * <p>The ID of the figure library. The ID is used to uniquely identify a figure library. You can specify the ID of a custom figure library. Make sure that the ID is unique. If you set this parameter to the ID of a system figure library, the system figure library is used. The ID can be up to 120 characters in length and is not case-sensitive. You can call the <a href="https://help.aliyun.com/document_detail/187787.html">ListCustomPersons</a> operation to query the figure library ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CategoryId001-****</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The ID of the face. The ID is used to uniquely identify a face. Make sure that the ID is unique. The ID can be up to 120 characters in length and is not case-sensitive. You can call the <a href="https://help.aliyun.com/document_detail/187787.html">ListCustomPersons</a> operation to query the face ID. If you set this parameter to ALL, all the faces associated with the specified figure are deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15****</p>
     */
    @NameInMap("FaceId")
    public String faceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the figure. The ID is used to uniquely identify a custom figure. Make sure that the ID is unique. The ID can be up to 120 characters in length and is not case-sensitive. You can call the <a href="https://help.aliyun.com/document_detail/187787.html">ListCustomPersons</a> operation to query the figure ID. If you set this parameter to ALL, all the faces in the specified figure library are deleted, and the custom figure library is deleted.</p>
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

    public static UnregisterCustomFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnregisterCustomFaceRequest self = new UnregisterCustomFaceRequest();
        return TeaModel.build(map, self);
    }

    public UnregisterCustomFaceRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public UnregisterCustomFaceRequest setFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }
    public String getFaceId() {
        return this.faceId;
    }

    public UnregisterCustomFaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnregisterCustomFaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnregisterCustomFaceRequest setPersonId(String personId) {
        this.personId = personId;
        return this;
    }
    public String getPersonId() {
        return this.personId;
    }

    public UnregisterCustomFaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnregisterCustomFaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
