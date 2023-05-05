// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListDistributeAllUserRequest extends TeaModel {
    @NameInMap("AdRegionId")
    public String adRegionId;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("KeyName")
    public String keyName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserRegionId")
    public String userRegionId;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static ListDistributeAllUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistributeAllUserRequest self = new ListDistributeAllUserRequest();
        return TeaModel.build(map, self);
    }

    public ListDistributeAllUserRequest setAdRegionId(String adRegionId) {
        this.adRegionId = adRegionId;
        return this;
    }
    public String getAdRegionId() {
        return this.adRegionId;
    }

    public ListDistributeAllUserRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ListDistributeAllUserRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public ListDistributeAllUserRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDistributeAllUserRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributeAllUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDistributeAllUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDistributeAllUserRequest setUserRegionId(String userRegionId) {
        this.userRegionId = userRegionId;
        return this;
    }
    public String getUserRegionId() {
        return this.userRegionId;
    }

    public ListDistributeAllUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public ListDistributeAllUserRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
