// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomPersonsRequest extends TeaModel {
    /**
     * <p>The ID of the figure library about which you want to query information. The ID is used to uniquely identify a custom figure library. Make sure that the ID is unique. If you do not specify this parameter, the operation returns all the custom figure libraries. The ID can be up to 120 characters in length and is not case-sensitive.</p>
     * <blockquote>
     * <p>You cannot specify the ID of the system figure library for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CategoryId-****</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the figure about which you want to query information. The ID is used to uniquely identify a figure. Make sure that the ID is unique. If you do not specify this parameter, the operation returns the information about all the figures in the specified figure library.</p>
     * 
     * <strong>example:</strong>
     * <p>PersonId-****</p>
     */
    @NameInMap("PersonId")
    public String personId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListCustomPersonsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomPersonsRequest self = new ListCustomPersonsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomPersonsRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public ListCustomPersonsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListCustomPersonsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListCustomPersonsRequest setPersonId(String personId) {
        this.personId = personId;
        return this;
    }
    public String getPersonId() {
        return this.personId;
    }

    public ListCustomPersonsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListCustomPersonsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
