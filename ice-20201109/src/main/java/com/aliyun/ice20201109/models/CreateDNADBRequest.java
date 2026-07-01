// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateDNADBRequest extends TeaModel {
    /**
     * <p>The description of the DNA database.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个视频DNA库。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The DNA database model. Valid values:</p>
     * <ul>
     * <li><p><strong>Video</strong>: For video content.</p>
     * </li>
     * <li><p><strong>Audio</strong>: For audio content.</p>
     * </li>
     * <li><p><strong>Image</strong>: For image content. (Deprecated)</p>
     * </li>
     * <li><p><strong>Text</strong>: For text content. Supported only in the China (Shanghai) region. (Deprecated)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Video</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The name of the DNA database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateDNADBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDNADBRequest self = new CreateDNADBRequest();
        return TeaModel.build(map, self);
    }

    public CreateDNADBRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDNADBRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateDNADBRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDNADBRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDNADBRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDNADBRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDNADBRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
