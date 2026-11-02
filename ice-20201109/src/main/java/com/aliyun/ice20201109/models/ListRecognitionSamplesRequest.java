// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListRecognitionSamplesRequest extends TeaModel {
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
     * <p>The entity ID. If you set this parameter to ANY, the system queries the entity name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>**<strong><strong><strong><strong><strong><strong>544cb84754</strong></strong></strong></strong></strong></strong></p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_person</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The library ID. If you specify this parameter, the system queries the specified library. You can specify multiple IDs and separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lib1,lib2,lib3</p>
     */
    @NameInMap("LibId")
    public String libId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListRecognitionSamplesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecognitionSamplesRequest self = new ListRecognitionSamplesRequest();
        return TeaModel.build(map, self);
    }

    public ListRecognitionSamplesRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public ListRecognitionSamplesRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public ListRecognitionSamplesRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public ListRecognitionSamplesRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public ListRecognitionSamplesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListRecognitionSamplesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListRecognitionSamplesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecognitionSamplesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecognitionSamplesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListRecognitionSamplesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
