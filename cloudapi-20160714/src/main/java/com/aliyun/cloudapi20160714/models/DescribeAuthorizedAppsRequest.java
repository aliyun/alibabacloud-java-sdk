// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAuthorizedAppsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("StageName")
    public String stageName;

    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppOwnerId")
    public Long appOwnerId;

    public static DescribeAuthorizedAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthorizedAppsRequest self = new DescribeAuthorizedAppsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuthorizedAppsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAuthorizedAppsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAuthorizedAppsRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeAuthorizedAppsRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeAuthorizedAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuthorizedAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuthorizedAppsRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAuthorizedAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeAuthorizedAppsRequest setAppOwnerId(Long appOwnerId) {
        this.appOwnerId = appOwnerId;
        return this;
    }
    public Long getAppOwnerId() {
        return this.appOwnerId;
    }

}
