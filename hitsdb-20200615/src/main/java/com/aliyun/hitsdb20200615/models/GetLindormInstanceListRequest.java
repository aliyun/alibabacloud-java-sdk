// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryStr")
    public String queryStr;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("SupportEngine")
    public Integer supportEngine;

    @NameInMap("Tag")
    public java.util.List<GetLindormInstanceListRequestTag> tag;

    public static GetLindormInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceListRequest self = new GetLindormInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetLindormInstanceListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetLindormInstanceListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetLindormInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLindormInstanceListRequest setQueryStr(String queryStr) {
        this.queryStr = queryStr;
        return this;
    }
    public String getQueryStr() {
        return this.queryStr;
    }

    public GetLindormInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLindormInstanceListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetLindormInstanceListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetLindormInstanceListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetLindormInstanceListRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetLindormInstanceListRequest setSupportEngine(Integer supportEngine) {
        this.supportEngine = supportEngine;
        return this;
    }
    public Integer getSupportEngine() {
        return this.supportEngine;
    }

    public GetLindormInstanceListRequest setTag(java.util.List<GetLindormInstanceListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetLindormInstanceListRequestTag> getTag() {
        return this.tag;
    }

    public static class GetLindormInstanceListRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLindormInstanceListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceListRequestTag self = new GetLindormInstanceListRequestTag();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLindormInstanceListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
