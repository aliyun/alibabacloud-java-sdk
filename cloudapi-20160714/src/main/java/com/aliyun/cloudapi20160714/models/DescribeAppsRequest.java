// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppsRequest extends TeaModel {
    /**
     * <p>The ID of the app.</p>
     * 
     * <strong>example:</strong>
     * <p>20112314518278</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>The Alibaba Cloud account of the app owner. For more information, see <a href="https://account.console.aliyun.com/?spm=a2c4g.11186623.2.15.3a8c196eVWxvQB#/secure">Account Management</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1546564</p>
     */
    @NameInMap("AppOwner")
    public Long appOwner;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsRequest self = new DescribeAppsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppsRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppsRequest setAppOwner(Long appOwner) {
        this.appOwner = appOwner;
        return this;
    }
    public Long getAppOwner() {
        return this.appOwner;
    }

    public DescribeAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
