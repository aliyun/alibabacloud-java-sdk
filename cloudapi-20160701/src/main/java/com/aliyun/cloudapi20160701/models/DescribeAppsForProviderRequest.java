// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeAppsForProviderRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppOwnerId")
    public Long appOwnerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeAppsForProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsForProviderRequest self = new DescribeAppsForProviderRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppsForProviderRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppsForProviderRequest setAppOwnerId(Long appOwnerId) {
        this.appOwnerId = appOwnerId;
        return this;
    }
    public Long getAppOwnerId() {
        return this.appOwnerId;
    }

    public DescribeAppsForProviderRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsForProviderRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsForProviderRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
