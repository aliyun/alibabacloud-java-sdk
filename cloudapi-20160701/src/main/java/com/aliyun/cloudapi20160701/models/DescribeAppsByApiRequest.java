// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeAppsByApiRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppOwnerId")
    public Long appOwnerId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    public static DescribeAppsByApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsByApiRequest self = new DescribeAppsByApiRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppsByApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeAppsByApiRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppsByApiRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeAppsByApiRequest setAppOwnerId(Long appOwnerId) {
        this.appOwnerId = appOwnerId;
        return this;
    }
    public Long getAppOwnerId() {
        return this.appOwnerId;
    }

    public DescribeAppsByApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAppsByApiRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsByApiRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsByApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAppsByApiRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
