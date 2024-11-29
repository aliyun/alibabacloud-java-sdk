// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSyncJobListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-8vb39udfi356l9psq</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GetSourceDetail")
    public Boolean getSourceDetail;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceDBClusterDescription")
    public String sourceDBClusterDescription;

    /**
     * <strong>example:</strong>
     * <p>pc-t4n766v2llx852n81</p>
     */
    @NameInMap("SourceDBClusterId")
    public String sourceDBClusterId;

    /**
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("SourceDBType")
    public String sourceDBType;

    public static DescribeSyncJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncJobListRequest self = new DescribeSyncJobListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncJobListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSyncJobListRequest setGetSourceDetail(Boolean getSourceDetail) {
        this.getSourceDetail = getSourceDetail;
        return this;
    }
    public Boolean getGetSourceDetail() {
        return this.getSourceDetail;
    }

    public DescribeSyncJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSyncJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSyncJobListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSyncJobListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSyncJobListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSyncJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSyncJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSyncJobListRequest setSourceDBClusterDescription(String sourceDBClusterDescription) {
        this.sourceDBClusterDescription = sourceDBClusterDescription;
        return this;
    }
    public String getSourceDBClusterDescription() {
        return this.sourceDBClusterDescription;
    }

    public DescribeSyncJobListRequest setSourceDBClusterId(String sourceDBClusterId) {
        this.sourceDBClusterId = sourceDBClusterId;
        return this;
    }
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
    }

    public DescribeSyncJobListRequest setSourceDBType(String sourceDBType) {
        this.sourceDBType = sourceDBType;
        return this;
    }
    public String getSourceDBType() {
        return this.sourceDBType;
    }

}
