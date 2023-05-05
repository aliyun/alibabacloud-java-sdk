// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAuthorizationAllUserRequest extends TeaModel {
    @NameInMap("AdRegionId")
    public String adRegionId;

    @NameInMap("AppId")
    public Long appId;

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

    public static ListAuthorizationAllUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationAllUserRequest self = new ListAuthorizationAllUserRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationAllUserRequest setAdRegionId(String adRegionId) {
        this.adRegionId = adRegionId;
        return this;
    }
    public String getAdRegionId() {
        return this.adRegionId;
    }

    public ListAuthorizationAllUserRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ListAuthorizationAllUserRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizationAllUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizationAllUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAuthorizationAllUserRequest setUserRegionId(String userRegionId) {
        this.userRegionId = userRegionId;
        return this;
    }
    public String getUserRegionId() {
        return this.userRegionId;
    }

    public ListAuthorizationAllUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public ListAuthorizationAllUserRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
