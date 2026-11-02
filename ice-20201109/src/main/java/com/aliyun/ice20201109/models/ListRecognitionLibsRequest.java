// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListRecognitionLibsRequest extends TeaModel {
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
     * <p>The ID of the library. If you specify this parameter, the system queries the specified library. You can specify multiple IDs separated by commas (,).</p>
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
     * <p>The number of entries per page. The maximum number of entries per page is 50.</p>
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

    public static ListRecognitionLibsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecognitionLibsRequest self = new ListRecognitionLibsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecognitionLibsRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public ListRecognitionLibsRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public ListRecognitionLibsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListRecognitionLibsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListRecognitionLibsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecognitionLibsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecognitionLibsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListRecognitionLibsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
