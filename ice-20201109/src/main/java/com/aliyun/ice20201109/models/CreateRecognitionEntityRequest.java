// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateRecognitionEntityRequest extends TeaModel {
    /**
     * <p>The recognition type. Valid values:</p>
     * <ul>
     * <li><p>landmark: custom landmark</p>
     * </li>
     * <li><p>object: custom object</p>
     * </li>
     * <li><p>logo: custom logo</p>
     * </li>
     * <li><p>face: custom face</p>
     * </li>
     * <li><p>label: custom label</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>landmark</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The additional information about the custom recognition entity. The value is a JSON string and can be up to 256 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;description&quot;: &quot;book classification&quot;}</p>
     */
    @NameInMap("EntityInfo")
    public String entityInfo;

    /**
     * <p>The name of the custom recognition entity. The name can be up to 64 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RecognitionEntity name</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The ID of the recognition library. You can call the <a href="https://help.aliyun.com/document_detail/2926699.html">ListRecognitionLibs</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong><strong><strong><strong><strong>24b47865c6</strong></strong></strong></strong></strong></strong></em>*</p>
     */
    @NameInMap("LibId")
    public String libId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateRecognitionEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecognitionEntityRequest self = new CreateRecognitionEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecognitionEntityRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateRecognitionEntityRequest setEntityInfo(String entityInfo) {
        this.entityInfo = entityInfo;
        return this;
    }
    public String getEntityInfo() {
        return this.entityInfo;
    }

    public CreateRecognitionEntityRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public CreateRecognitionEntityRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public CreateRecognitionEntityRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRecognitionEntityRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRecognitionEntityRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRecognitionEntityRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
