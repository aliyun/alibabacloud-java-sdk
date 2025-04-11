// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAppsRequest extends TeaModel {
    /**
     * <p>The IDs of the applications.</p>
     */
    @NameInMap("AppIdList")
    public java.util.List<String> appIdList;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultAppName</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    /**
     * <p>Region id.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The installation/uninstallation status of the application.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>INSTALLFAILED: The application failed to be installed.</li>
     * <li>UNINSTALLING: The application is being uninstalled.</li>
     * <li>INSTALLING: The application is being installed.</li>
     * <li>UNINSTALLED: The application is uninstalled.</li>
     * <li>INSTALLED: The application is installed.</li>
     * <li>UNINSTALLFAILED: The application failed to be uninstalled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INSTALLING</p>
     */
    @NameInMap("InstallationStatus")
    public String installationStatus;

    /**
     * <p>The value of MD5.</p>
     * 
     * <strong>example:</strong>
     * <p>THCIEH73KEK3334</p>
     */
    @NameInMap("MD5")
    public String MD5;

    /**
     * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the parameter is left empty, the data is queried from the first entry.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The status of the application.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>FAILED: The application failed to be created.</li>
     * <li>NORMAL: The application is available.</li>
     * <li>CREATING: The application is being created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
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

    public DescribeAppsRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public DescribeAppsRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeAppsRequest setInstallationStatus(String installationStatus) {
        this.installationStatus = installationStatus;
        return this;
    }
    public String getInstallationStatus() {
        return this.installationStatus;
    }

    public DescribeAppsRequest setMD5(String MD5) {
        this.MD5 = MD5;
        return this;
    }
    public String getMD5() {
        return this.MD5;
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
