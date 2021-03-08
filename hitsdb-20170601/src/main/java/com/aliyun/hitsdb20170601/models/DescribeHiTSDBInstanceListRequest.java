// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DescribeHiTSDBInstanceListRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("QueryStr")
    public String queryStr;

    @NameInMap("StatusList")
    public String statusList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("EngineType")
    public String engineType;

    public static DescribeHiTSDBInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiTSDBInstanceListRequest self = new DescribeHiTSDBInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHiTSDBInstanceListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeHiTSDBInstanceListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeHiTSDBInstanceListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHiTSDBInstanceListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeHiTSDBInstanceListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeHiTSDBInstanceListRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeHiTSDBInstanceListRequest setQueryStr(String queryStr) {
        this.queryStr = queryStr;
        return this;
    }
    public String getQueryStr() {
        return this.queryStr;
    }

    public DescribeHiTSDBInstanceListRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public DescribeHiTSDBInstanceListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHiTSDBInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHiTSDBInstanceListRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

}
