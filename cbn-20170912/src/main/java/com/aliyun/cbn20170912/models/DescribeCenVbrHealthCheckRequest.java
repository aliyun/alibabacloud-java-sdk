// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenVbrHealthCheckRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VbrInstanceId")
    public String vbrInstanceId;

    @NameInMap("VbrInstanceOwnerId")
    public Long vbrInstanceOwnerId;

    @NameInMap("VbrInstanceRegionId")
    public String vbrInstanceRegionId;

    public static DescribeCenVbrHealthCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenVbrHealthCheckRequest self = new DescribeCenVbrHealthCheckRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenVbrHealthCheckRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenVbrHealthCheckRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCenVbrHealthCheckRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCenVbrHealthCheckRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenVbrHealthCheckRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenVbrHealthCheckRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCenVbrHealthCheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCenVbrHealthCheckRequest setVbrInstanceId(String vbrInstanceId) {
        this.vbrInstanceId = vbrInstanceId;
        return this;
    }
    public String getVbrInstanceId() {
        return this.vbrInstanceId;
    }

    public DescribeCenVbrHealthCheckRequest setVbrInstanceOwnerId(Long vbrInstanceOwnerId) {
        this.vbrInstanceOwnerId = vbrInstanceOwnerId;
        return this;
    }
    public Long getVbrInstanceOwnerId() {
        return this.vbrInstanceOwnerId;
    }

    public DescribeCenVbrHealthCheckRequest setVbrInstanceRegionId(String vbrInstanceRegionId) {
        this.vbrInstanceRegionId = vbrInstanceRegionId;
        return this;
    }
    public String getVbrInstanceRegionId() {
        return this.vbrInstanceRegionId;
    }

}
