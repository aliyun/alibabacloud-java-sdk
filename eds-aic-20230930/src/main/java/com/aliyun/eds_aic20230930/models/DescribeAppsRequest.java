// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAppsRequest extends TeaModel {
    @NameInMap("AppIdList")
    public java.util.List<String> appIdList;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstallationStatus")
    public String installationStatus;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Status")
    public String status;

    public static DescribeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsRequest self = new DescribeAppsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppsRequest setAppIdList(java.util.List<String> appIdList) {
        this.appIdList = appIdList;
        return this;
    }
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    public DescribeAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeAppsRequest setInstallationStatus(String installationStatus) {
        this.installationStatus = installationStatus;
        return this;
    }
    public String getInstallationStatus() {
        return this.installationStatus;
    }

    public DescribeAppsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAppsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAppsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
