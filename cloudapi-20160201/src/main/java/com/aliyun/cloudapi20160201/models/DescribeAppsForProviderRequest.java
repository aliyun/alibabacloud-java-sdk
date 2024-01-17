// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAppsForProviderRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppOwner")
    public String appOwner;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

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

    public DescribeAppsForProviderRequest setAppOwner(String appOwner) {
        this.appOwner = appOwner;
        return this;
    }
    public String getAppOwner() {
        return this.appOwner;
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

}
