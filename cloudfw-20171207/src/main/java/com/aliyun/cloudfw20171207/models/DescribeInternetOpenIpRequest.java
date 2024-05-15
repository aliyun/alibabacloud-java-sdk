// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenIpRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    /**
     * <p>The instance name.</p>
     */
    @NameInMap("AssetsInstanceName")
    public String assetsInstanceName;

    /**
     * <p>The asset type of the instance.</p>
     */
    @NameInMap("AssetsType")
    public String assetsType;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The port number.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The public IP address of the instance.</p>
     */
    @NameInMap("PublicIp")
    public String publicIp;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The risk level. If you leave this parameter empty, all risk levels are queried. Valid values:</p>
     * <br>
     * <p>*   **3**: high risk</p>
     * <p>*   **2**: medium risk</p>
     * <p>*   **1**: low risk</p>
     * <p>*   **0**: no risk</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The application.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInternetOpenIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenIpRequest self = new DescribeInternetOpenIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenIpRequest setAssetsInstanceId(String assetsInstanceId) {
        this.assetsInstanceId = assetsInstanceId;
        return this;
    }
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    public DescribeInternetOpenIpRequest setAssetsInstanceName(String assetsInstanceName) {
        this.assetsInstanceName = assetsInstanceName;
        return this;
    }
    public String getAssetsInstanceName() {
        return this.assetsInstanceName;
    }

    public DescribeInternetOpenIpRequest setAssetsType(String assetsType) {
        this.assetsType = assetsType;
        return this;
    }
    public String getAssetsType() {
        return this.assetsType;
    }

    public DescribeInternetOpenIpRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInternetOpenIpRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInternetOpenIpRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInternetOpenIpRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInternetOpenIpRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeInternetOpenIpRequest setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public DescribeInternetOpenIpRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeInternetOpenIpRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeInternetOpenIpRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeInternetOpenIpRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
